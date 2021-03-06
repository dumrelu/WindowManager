package com.iclp.windowmanager;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

public class DesktopCanvas extends Canvas
{
    private Desktop desktop;
    private BufferedImage buffer;
    private Window selectedWindow = null;
    private int xDiff = 0;
    private int yDiff = 0;
    private boolean shouldMoveWindow = false;
    
    public DesktopCanvas(Desktop desktop)
    {
        this.desktop = desktop;
        this.buffer = new BufferedImage(desktop.getBuffer().getWidth(), desktop.getBuffer().getHeight(), BufferedImage.TYPE_INT_ARGB);
        
        setSize(this.buffer.getWidth(), this.buffer.getHeight());
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                onMousePressed(e.getX(), e.getY());
            }
            
            @Override
            public void mouseReleased(MouseEvent e)
            {
                onMouseReleased();
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                onMouseMove(e.getX(), e.getY());
            }
        });
    }
    
    public Desktop getDesktop()
    {
        return this.desktop;
    }
    
    @Override
    public void update(Graphics g)
    {
        paint(g);
    }
    
    @Override
    public void paint(Graphics g)
    {
        Graphics bufferGraphics = this.buffer.getGraphics();
        onPaint(bufferGraphics);
        
        g.drawImage(this.buffer, 0, 0, null);
    }
    
    private void onPaint(Graphics g)
    {
        FrameBuffer frameBuffer = this.desktop.getBuffer();
        frameBuffer.getLock().lock();
        
        g.drawImage(frameBuffer.getBuffer(), 0, 0, null);
        
        frameBuffer.getLock().unlock();
    }
    
    private void onMousePressed(int x, int y)
    {
        Manager manager = this.desktop.getManager();
        
        manager.getLogger().log(Logger.DEBUG, "Mouse click on desktop \"" +
                this.desktop.getName() + "\" at coordinates: (" + 
                x + ", " + y + ")");
        
        Window clickedWindow = findClickedWindow(x, y);
        
        if(this.selectedWindow != null)
        {
            manager.unfocusWindow(selectedWindow);
            this.selectedWindow = null;
        }
        
        if(clickedWindow != null)
        {
            this.selectedWindow = clickedWindow;
            manager.focusWindow(selectedWindow);
            manager.getLogger().log(Logger.DEBUG, "Window selected: " + this.selectedWindow.getTitle());
            this.xDiff = this.selectedWindow.getX() - x;
            this.yDiff = this.selectedWindow.getY() - y;
        }
    }
    
    private void onMouseReleased()
    {
        if(this.selectedWindow == null)
        {
            return;
        }
        
        Manager manager = this.desktop.getManager();
        manager.resumeUpdates(this.selectedWindow);
    }
    
    private void onMouseMove(int x, int y)
    {
        if(this.selectedWindow == null || !shouldMoveWindow)
        {
            return;
        }
        
        Rectangle currentRect = this.selectedWindow.getRectangle();
        Rectangle newRect = new Rectangle(x + this.xDiff, y + this.yDiff, currentRect.width, currentRect.height);
        
        this.selectedWindow.getManager().setRectangle(this.selectedWindow, newRect);
    }

    private Window findClickedWindow(int x, int y) 
    {
        Manager manager = this.desktop.getManager();
        Window clickedWindow = null;
        
        manager.lockDesktop(this.desktop);
        
        ArrayList<Window> windows = new ArrayList<>(manager.getWindows(desktop));
        Collections.reverse(windows);
        for(Window window : windows)
        {
            manager.pauseUpdates(window);
            Rectangle windowRect = window.getRectangle();
            if(window.getRectangle().intersects(x, y))
            {
                if(isClickOnCloseButton(windowRect, x, y))
                {
                    if(window == selectedWindow)
                    {
                        manager.unfocusWindow(selectedWindow);
                        this.selectedWindow = null;
                    }
                    window.onCloseButton();
                    break;
                }
                
                clickedWindow = window;
                shouldMoveWindow = isClickOnWindowBorder(windowRect, x, y);
                
                if(!shouldMoveWindow)
                {
                    window.onClick(x - windowRect.x, y - windowRect.y);
                }
                
                break;
            }
            manager.resumeUpdates(window);
        }
        
        manager.unlockDesktop(this.desktop);
        return clickedWindow;
    }
    
    private boolean isClickOnWindowBorder(Rectangle windowRect, int x, int y)
    {
        Rectangle borderRect = new Rectangle(windowRect.x, windowRect.y, windowRect.width, Renderer.BORDER_HEIGHT);
        return borderRect.intersects(x, y);
    }
    
    private boolean isClickOnCloseButton(Rectangle windowRect, int x, int y)
    {
        Rectangle closeButtonRect = Renderer.getCloseButtonRect(windowRect);
        return closeButtonRect.intersects(x, y);
    }
}
