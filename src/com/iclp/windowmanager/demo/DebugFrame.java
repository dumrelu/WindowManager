/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iclp.windowmanager.demo;

import com.iclp.windowmanager.Desktop;
import com.iclp.windowmanager.Manager;
import com.iclp.windowmanager.ManagerListener;
import com.iclp.windowmanager.Rectangle;
import com.iclp.windowmanager.UpdateRequest;
import com.iclp.windowmanager.Window;
import com.sun.media.jfxmedia.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author relu
 */
public class DebugFrame extends javax.swing.JFrame implements ManagerListener {

    private Manager manager;
    private Window selectedWindow = null;
    private Desktop selectedDesktop = null;
    
    /**
     * Creates new form DebugFrame
     */
    public DebugFrame(Manager manager) {
        this.manager = manager;
        initComponents();
        txtUpdates.setEditable(false);
        
        initWindows();
        initDesktops();
        initUpdates();
        
        manager.addListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listWindows = new javax.swing.JList<>();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblRect = new javax.swing.JLabel();
        txtRect = new javax.swing.JTextField();
        lblUpdates = new javax.swing.JLabel();
        txtUpdates = new javax.swing.JTextField();
        btnWindowResume = new javax.swing.JButton();
        btnWindowPause = new javax.swing.JButton();
        lblDesktop = new javax.swing.JLabel();
        choiceDesktop = new java.awt.Choice();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDesktops = new javax.swing.JList<>();
        lblDesktopName = new javax.swing.JLabel();
        lblNumOfWindows = new javax.swing.JLabel();
        lblFocusedWindowName = new javax.swing.JLabel();
        txtDesktopName = new javax.swing.JTextField();
        txtWindowCount = new javax.swing.JTextField();
        txtFocusedWindowName = new javax.swing.JTextField();
        lblDesktopUpdates = new javax.swing.JLabel();
        txtDesktopUpdates = new javax.swing.JTextField();
        btnPauseDesktopUpdates = new javax.swing.JButton();
        btnResumeWindowUpdates = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listUpdates = new javax.swing.JList<>();
        cbAutoScroll = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        listExecutedUpdates = new javax.swing.JList<>();
        lblPauseAllUpdates = new javax.swing.JButton();
        btnResumeAllUpdates = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Windows"));

        listWindows.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listWindows.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listWindowsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listWindows);

        lblTitle.setText("Title:");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        lblRect.setText("Rect:");
        lblRect.setToolTipText("");

        txtRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRectActionPerformed(evt);
            }
        });

        lblUpdates.setText("Updates:");

        btnWindowResume.setText("Resume");
        btnWindowResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWindowResumeActionPerformed(evt);
            }
        });

        btnWindowPause.setText("Pause");
        btnWindowPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWindowPauseActionPerformed(evt);
            }
        });

        lblDesktop.setText("Desktop");

        choiceDesktop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceDesktopItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblRect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRect, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtTitle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnWindowPause)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnWindowResume)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDesktop)
                                    .addComponent(lblUpdates))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUpdates)
                                    .addComponent(choiceDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRect)
                            .addComponent(txtRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesktop)
                            .addComponent(choiceDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUpdates)
                            .addComponent(txtUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnWindowResume)
                            .addComponent(btnWindowPause))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Desktops"));

        listDesktops.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listDesktops.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listDesktopsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listDesktops);

        lblDesktopName.setText("Name:");

        lblNumOfWindows.setText("Window count:");

        lblFocusedWindowName.setText("Focused window:");

        lblDesktopUpdates.setText("Updates:");

        btnPauseDesktopUpdates.setText("Pause");
        btnPauseDesktopUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseDesktopUpdatesActionPerformed(evt);
            }
        });

        btnResumeWindowUpdates.setText("Resume");
        btnResumeWindowUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeWindowUpdatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDesktopName)
                        .addGap(18, 18, 18)
                        .addComponent(txtDesktopName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumOfWindows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWindowCount))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFocusedWindowName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFocusedWindowName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDesktopUpdates)
                        .addGap(18, 18, 18)
                        .addComponent(txtDesktopUpdates))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnPauseDesktopUpdates)
                        .addGap(18, 18, 18)
                        .addComponent(btnResumeWindowUpdates)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesktopName)
                    .addComponent(txtDesktopName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumOfWindows)
                    .addComponent(txtWindowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFocusedWindowName)
                    .addComponent(txtFocusedWindowName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesktopUpdates)
                    .addComponent(txtDesktopUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPauseDesktopUpdates)
                    .addComponent(btnResumeWindowUpdates)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Updates"));

        listUpdates.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listUpdates);

        cbAutoScroll.setText("Auto scroll");

        listExecutedUpdates.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listExecutedUpdates);

        lblPauseAllUpdates.setText("Pause");
        lblPauseAllUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPauseAllUpdatesActionPerformed(evt);
            }
        });

        btnResumeAllUpdates.setText("Resume");
        btnResumeAllUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeAllUpdatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbAutoScroll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPauseAllUpdates))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResumeAllUpdates))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAutoScroll)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPauseAllUpdates)
                        .addComponent(btnResumeAllUpdates)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRectActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void listWindowsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listWindowsValueChanged
        selectedWindow = manager.getWindowByTitle(listWindows.getSelectedValue());
        updateWindowData();
    }//GEN-LAST:event_listWindowsValueChanged

    private void btnWindowPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWindowPauseActionPerformed
        if(selectedWindow != null)
        {
            manager.pauseUpdates(selectedWindow);
        }
    }//GEN-LAST:event_btnWindowPauseActionPerformed

    private void btnWindowResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWindowResumeActionPerformed
        if(selectedWindow != null)
        {
            manager.resumeUpdates(selectedWindow);
        }
    }//GEN-LAST:event_btnWindowResumeActionPerformed

    private void listDesktopsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listDesktopsValueChanged
        selectedDesktop = manager.getDesktopByName(listDesktops.getSelectedValue());
        updateDesktopData();
    }//GEN-LAST:event_listDesktopsValueChanged

    private void btnPauseDesktopUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseDesktopUpdatesActionPerformed
        if(selectedDesktop != null)
        {
            manager.lockDesktop(selectedDesktop);
        }
    }//GEN-LAST:event_btnPauseDesktopUpdatesActionPerformed

    private void btnResumeWindowUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeWindowUpdatesActionPerformed
        if(selectedDesktop != null)
        {
            manager.unlockDesktop(selectedDesktop);
        }
    }//GEN-LAST:event_btnResumeWindowUpdatesActionPerformed

    private void choiceDesktopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceDesktopItemStateChanged
        if(selectedWindow != null)
        {
            selectedWindow.setDesktop(manager.getDesktopByName(choiceDesktop.getSelectedItem()));
        }
    }//GEN-LAST:event_choiceDesktopItemStateChanged

    private void lblPauseAllUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPauseAllUpdatesActionPerformed
        manager.lockForRender();
    }//GEN-LAST:event_lblPauseAllUpdatesActionPerformed

    private void btnResumeAllUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeAllUpdatesActionPerformed
        manager.unlockForRender();
    }//GEN-LAST:event_btnResumeAllUpdatesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPauseDesktopUpdates;
    private javax.swing.JButton btnResumeAllUpdates;
    private javax.swing.JButton btnResumeWindowUpdates;
    private javax.swing.JButton btnWindowPause;
    private javax.swing.JButton btnWindowResume;
    private javax.swing.JCheckBox cbAutoScroll;
    private java.awt.Choice choiceDesktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDesktop;
    private javax.swing.JLabel lblDesktopName;
    private javax.swing.JLabel lblDesktopUpdates;
    private javax.swing.JLabel lblFocusedWindowName;
    private javax.swing.JLabel lblNumOfWindows;
    private javax.swing.JButton lblPauseAllUpdates;
    private javax.swing.JLabel lblRect;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdates;
    private javax.swing.JList<String> listDesktops;
    private javax.swing.JList<String> listExecutedUpdates;
    private javax.swing.JList<String> listUpdates;
    private javax.swing.JList<String> listWindows;
    private javax.swing.JTextField txtDesktopName;
    private javax.swing.JTextField txtDesktopUpdates;
    private javax.swing.JTextField txtFocusedWindowName;
    private javax.swing.JTextField txtRect;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtUpdates;
    private javax.swing.JTextField txtWindowCount;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onWindowAdded(Window window) {
        initWindows();
        updateDesktopData();
    }

    @Override
    public void onWindowRemoved(Window window) {
        initWindows();
        updateDesktopData();
    }

    @Override
    public void onWindowFocused(Desktop desktop, Window window) {
        //updateWindowData();
        if(selectedDesktop == desktop)
        {
            updateDesktopData();
        }
    }

    @Override
    public void onWindowUnfocused(Desktop desktop) {
        //updateWindowData();
    }

    @Override
    public void onWindowsSwapped(Window first, Window second) {
        updateWindowData();
    }

    @Override
    public void onDesktopAdded(Desktop desktop) {
        initDesktops();
    }

    @Override
    public void onDesktopNameChanged(Desktop desktop, String newName, String oldName) {
        initDesktops();
        if(selectedDesktop == desktop)
        {
            updateDesktopData();
        }
    }

    @Override
    public void onWindowTitleChanged(Window window, String newTitle, String oldTitle) {
        initWindows();
        updateWindowData();
        updateDesktopData();
    }

    @Override
    public void onWindowRectangleChanged(Window window, Rectangle newRect, Rectangle oldRect) {
        //updateWindowData();
        
        if(selectedWindow == window)
        {
            Rectangle rect = selectedWindow.getRectangle();
            txtRect.setText("(" + rect.x + "," + rect.y + "," + rect.width + "," + rect.height + ")");
        }
    }

    @Override
    public void onWindowDesktopChanged(Window window, Desktop newDesktop, Desktop oldDesktop) {
        updateDesktopData();
        updateWindowData();
    }

    @Override
    public void onUpdateRequestAdded(UpdateRequest request) {
        synchronized(this)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    DefaultListModel<String> model = (DefaultListModel<String>) listUpdates.getModel();
                    model.addElement(request.toString());
                    if(cbAutoScroll.isSelected())
                    {
                        int lastIndex = model.getSize() - 1;
                        listUpdates.ensureIndexIsVisible(lastIndex);
                    }
                }
            });
        }
    }

    @Override
    public void onUpdateRequestExecuted(UpdateRequest request) {
        synchronized(this)
        {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    DefaultListModel<String> pendingUpdatesModel = (DefaultListModel<String>) listUpdates.getModel();
                    DefaultListModel<String> executedUpdatesModel = (DefaultListModel<String>) listExecutedUpdates.getModel();

                    String updateString = request.toString();
                    pendingUpdatesModel.removeElement(updateString);
                    executedUpdatesModel.addElement(updateString);
                    if(cbAutoScroll.isSelected())
                    {
                        int lastPendingIndex = pendingUpdatesModel.getSize() - 1;
                        int lastExecutedIndex = executedUpdatesModel.getSize() - 1;
                        listUpdates.ensureIndexIsVisible(lastPendingIndex);
                        listExecutedUpdates.ensureIndexIsVisible(lastExecutedIndex);
                    }
                }
            });
        }
    }

    @Override
    public void onUpdatesPaused() {
        
    }

    @Override
    public void onUpdatesPaused(Desktop desktop) {
        //updateDesktopData();
        
        if(selectedDesktop == desktop)
        {
            txtDesktopUpdates.setText(manager.canUpdate(selectedDesktop) ? "ON" : "OFF");
        }
    }

    @Override
    public void onUpdatesPaused(Window window) {
        if(selectedWindow == window)
        {
            updateWindowData();
        }
    }

    @Override
    public void onUpdatesResumed() {
        
    }

    @Override
    public void onUpdatesResumed(Desktop desktop) {
        //updateDesktopData();
        
        if(selectedDesktop == desktop)
        {
            txtDesktopUpdates.setText(manager.canUpdate(selectedDesktop) ? "ON" : "OFF");
        }
    }

    @Override
    public void onUpdatesResumed(Window window) {
        if(selectedWindow == window)
        {
            updateWindowData();
        }
    }
    
    private void initWindows()
    {
        DefaultListModel<String> model = new DefaultListModel<>();
        listWindows.setModel(model);
        for(Window window : manager.getWindows())
        {
            if(!window.isClosed())
            {
                model.addElement(window.getTitle());
            }
        }
    }
    
    private void updateWindowData()
    {
        if(selectedWindow == null || selectedWindow.getDesktop() == null)
        {
            return;
        }
        
        txtTitle.setText("");
        txtRect.setText("");
        txtUpdates.setText("");
        
        txtTitle.setText(selectedWindow.getTitle());
        Rectangle rect = selectedWindow.getRectangle();
        txtRect.setText("(" + rect.x + "," + rect.y + "," + rect.width + "," + rect.height + ")");
        txtUpdates.setText(manager.canUpdate(selectedWindow) ? "ON" : "OFF");
        choiceDesktop.select(selectedWindow.getDesktop().getName());
    }
    
    private void initDesktops()
    {
        DefaultListModel<String> model = new DefaultListModel<>();
        listDesktops.setModel(model);
        choiceDesktop.removeAll();
        for(Desktop desktop : manager.getDesktops())
        {
            model.addElement(desktop.getName());
            choiceDesktop.add(desktop.getName());
        }
    }
    
    private void updateDesktopData()
    {
        if(selectedDesktop == null)
        {
            return;
        }
        
        txtDesktopName.setText("");
        txtWindowCount.setText("");
        txtFocusedWindowName.setText("");
        txtDesktopUpdates.setText("");
        
        txtDesktopName.setText(selectedDesktop.getName());
        txtWindowCount.setText("" + manager.getWindows(selectedDesktop).size());
        Window focusedWindow = manager.getFocusedWindow(selectedDesktop);
        if(focusedWindow != null)
        {
            txtFocusedWindowName.setText(focusedWindow.getTitle());
        }
        else
        {
            txtFocusedWindowName.setText("N/A");
        }
        txtDesktopUpdates.setText(manager.canUpdate(selectedDesktop) ? "ON" : "OFF");
    }
    
    private void initUpdates()
    {
        listUpdates.setModel(new DefaultListModel<>());
        listExecutedUpdates.setModel(new DefaultListModel<>());
    }
}
