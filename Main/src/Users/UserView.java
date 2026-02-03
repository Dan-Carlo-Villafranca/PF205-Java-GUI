package Users;


import admin.*;
import pages.landingForm;
import javax.swing.*;
import config.config;
import Login.Login;


public class UserView extends javax.swing.JFrame {

    public UserView() {
        initComponents();
        acc_name1.setText(config.Session.name);
        acc_type2.setText(config.Session.type);
        getUsersData();
    }
    
    void getUsersData(){
        config con = new config();
        String sql = "SELECT u_id, full_name, email, type, status FROM tbl_accounts";
        con.displayData(sql, userTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        upPanel = new javax.swing.JPanel();
        BlockPane3 = new javax.swing.JPanel();
        downPanel = new javax.swing.JPanel();
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_type2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        UserButton2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        UserButton = new javax.swing.JPanel();
        reports = new javax.swing.JLabel();
        UserButton1 = new javax.swing.JPanel();
        users1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 0, 51));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upPanel.setBackground(new java.awt.Color(204, 0, 51));
        upPanel.setForeground(new java.awt.Color(255, 255, 255));
        upPanel.setLayout(null);

        BlockPane3.setBackground(new java.awt.Color(204, 0, 51));
        BlockPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BlockPane3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BlockPane3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BlockPane3Layout = new javax.swing.GroupLayout(BlockPane3);
        BlockPane3.setLayout(BlockPane3Layout);
        BlockPane3Layout.setHorizontalGroup(
            BlockPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        BlockPane3Layout.setVerticalGroup(
            BlockPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        upPanel.add(BlockPane3);
        BlockPane3.setBounds(330, 0, 70, 30);

        jLayeredPane1.add(upPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        downPanel.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout downPanelLayout = new javax.swing.GroupLayout(downPanel);
        downPanel.setLayout(downPanelLayout);
        downPanelLayout.setHorizontalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        downPanelLayout.setVerticalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(downPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 600, 30));

        BG.setBackground(new java.awt.Color(153, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("USERS");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Profile Blank red small.png"))); // NOI18N

        acc_name1.setText("jLabel2");

        acc_type2.setForeground(new java.awt.Color(204, 0, 0));
        acc_type2.setText("jLabel2");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(userTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_type2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acc_name1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(acc_name1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acc_type2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 540, 290));

        UserButton2.setBackground(new java.awt.Color(204, 0, 51));
        UserButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserButton2MouseExited(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(240, 240, 240));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Log out");

        javax.swing.GroupLayout UserButton2Layout = new javax.swing.GroupLayout(UserButton2);
        UserButton2.setLayout(UserButton2Layout);
        UserButton2Layout.setHorizontalGroup(
            UserButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserButton2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        UserButton2Layout.setVerticalGroup(
            UserButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserButton2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(UserButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 60, 30));

        UserButton.setBackground(new java.awt.Color(204, 0, 51));
        UserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserButtonMouseExited(evt);
            }
        });

        reports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports.setForeground(new java.awt.Color(240, 240, 240));
        reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports.setText("Reports");

        javax.swing.GroupLayout UserButtonLayout = new javax.swing.GroupLayout(UserButton);
        UserButton.setLayout(UserButtonLayout);
        UserButtonLayout.setHorizontalGroup(
            UserButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserButtonLayout.setVerticalGroup(
            UserButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(UserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 30));

        UserButton1.setBackground(new java.awt.Color(255, 102, 102));
        UserButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserButton1MouseClicked(evt);
            }
        });

        users1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        users1.setForeground(new java.awt.Color(240, 240, 240));
        users1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users1.setText("Users");

        javax.swing.GroupLayout UserButton1Layout = new javax.swing.GroupLayout(UserButton1);
        UserButton1.setLayout(UserButton1Layout);
        UserButton1Layout.setHorizontalGroup(
            UserButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserButton1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(users1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        UserButton1Layout.setVerticalGroup(
            UserButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(UserButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 60, 30));

        HomeButton.setBackground(new java.awt.Color(204, 0, 51));
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeButtonMouseExited(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        home.setForeground(new java.awt.Color(240, 240, 240));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");

        javax.swing.GroupLayout HomeButtonLayout = new javax.swing.GroupLayout(HomeButton);
        HomeButton.setLayout(HomeButtonLayout);
        HomeButtonLayout.setHorizontalGroup(
            HomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeButtonLayout.setVerticalGroup(
            HomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BlockPane3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlockPane3MouseEntered
        BlockPane3.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_BlockPane3MouseEntered

    private void BlockPane3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlockPane3MouseExited
        BlockPane3.setBackground(new java.awt.Color(204, 0, 51));
    }//GEN-LAST:event_BlockPane3MouseExited

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        AdminDashboard ads = new AdminDashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void UserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseClicked
//        new Users().setVisible(true);
    }//GEN-LAST:event_UserButtonMouseClicked

    private void UserButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserButton1MouseClicked

    private void UserButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseClicked
            config.Session.name = null;
            config.Session.email = null;
            config.Session.type = null;
            
            Login log = new Login(); 
            // 2. Make it visible
            log.setVisible(true); 
            // 3. Close the current Admin Dashboard
            this.dispose();
    }//GEN-LAST:event_UserButton2MouseClicked

    private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseEntered
        HomeButton.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_HomeButtonMouseEntered

    private void HomeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseExited
        HomeButton.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_HomeButtonMouseExited

    private void UserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseEntered
        UserButton.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_UserButtonMouseEntered

    private void UserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseExited
        UserButton.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButtonMouseExited

    private void UserButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseEntered
        UserButton2.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_UserButton2MouseEntered

    private void UserButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseExited
        UserButton2.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(landingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel BlockPane3;
    private javax.swing.JPanel HomeButton;
    private javax.swing.JPanel UserButton;
    private javax.swing.JPanel UserButton1;
    private javax.swing.JPanel UserButton2;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_type2;
    private javax.swing.JPanel downPanel;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel reports;
    private javax.swing.JPanel upPanel;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel users1;
    // End of variables declaration//GEN-END:variables
}