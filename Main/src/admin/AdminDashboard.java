package admin;


import pages.landingForm;
import javax.swing.*;
import config.config;
import Login.Login;
import Users.UserView;
import View.StockView;


public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
        acc_name1.setText(config.Session.name);
        acc_type2.setText(config.Session.type);
        acc_email.setText(config.Session.email);
        
//        if (config.Session.id == 0){
//            JOptionPane.showMessageDialog(null, "Access Denied!");
//        } else {
//            AdminDashboard ad = new AdminDashboard();
//            ad.setVisible(true);
//            this.dispose();
//            return;
//        }

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
        acc_email = new javax.swing.JLabel();
        UserButton2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        UserButton = new javax.swing.JPanel();
        reports = new javax.swing.JLabel();
        UserButton1 = new javax.swing.JPanel();
        users1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        Stocks = new javax.swing.JPanel();
        reports1 = new javax.swing.JLabel();

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

        jLayeredPane1.add(upPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));

        downPanel.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout downPanelLayout = new javax.swing.GroupLayout(downPanel);
        downPanel.setLayout(downPanelLayout);
        downPanelLayout.setHorizontalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        downPanelLayout.setVerticalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(downPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 930, 30));

        BG.setBackground(new java.awt.Color(153, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Profile Blank red.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 150, 150));

        acc_name1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        acc_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name1.setText("jLabel2");
        jPanel1.add(acc_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 90, -1));

        acc_type2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        acc_type2.setForeground(new java.awt.Color(204, 0, 0));
        acc_type2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_type2.setText("jLabel1");
        jPanel1.add(acc_type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 70, -1));

        acc_email.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        acc_email.setForeground(new java.awt.Color(153, 153, 153));
        acc_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_email.setText("jLabel2");
        jPanel1.add(acc_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 50, 10));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 870, 440));

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

        jLayeredPane1.add(UserButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 60, 30));

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
            .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        UserButtonLayout.setVerticalGroup(
            UserButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(UserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 30));

        UserButton1.setBackground(new java.awt.Color(204, 0, 51));
        UserButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserButton1MouseExited(evt);
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

        HomeButton.setBackground(new java.awt.Color(255, 102, 102));
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
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

        Stocks.setBackground(new java.awt.Color(204, 0, 51));
        Stocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StocksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StocksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StocksMouseExited(evt);
            }
        });

        reports1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports1.setForeground(new java.awt.Color(240, 240, 240));
        reports1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports1.setText("Stocks");

        javax.swing.GroupLayout StocksLayout = new javax.swing.GroupLayout(Stocks);
        Stocks.setLayout(StocksLayout);
        StocksLayout.setHorizontalGroup(
            StocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StocksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StocksLayout.setVerticalGroup(
            StocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(Stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 30));

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
        JOptionPane.showMessageDialog(this, "You are already on the Home Dashboard.");
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void UserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseClicked
//        new Users().setVisible(true);
    }//GEN-LAST:event_UserButtonMouseClicked

    private void UserButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseClicked
        UserView uview = new UserView();
        
        uview.setVisible(true);
        this.dispose();
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

    private void UserButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseEntered
        UserButton1.setBackground(new java.awt.Color(255, 102, 102));  
    }//GEN-LAST:event_UserButton1MouseEntered

    private void UserButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseExited
        UserButton1.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton1MouseExited

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

    private void StocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseClicked
        StockView sview = new StockView();
        
        sview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StocksMouseClicked

    private void StocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseEntered
        Stocks.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_StocksMouseEntered

    private void StocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseExited
        Stocks.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_StocksMouseExited
    
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

        /* Create and display the form */     // THIS ALSO IMPLEMENTS THE REQUIRED LOG IN
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (config.Session.id == 0){
                    new Login().setVisible(true);
                } else {
                new AdminDashboard().setVisible(true);
            }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel BlockPane3;
    private javax.swing.JPanel HomeButton;
    private javax.swing.JPanel Stocks;
    private javax.swing.JPanel UserButton;
    private javax.swing.JPanel UserButton1;
    private javax.swing.JPanel UserButton2;
    private javax.swing.JLabel acc_email;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_type2;
    private javax.swing.JPanel downPanel;
    private javax.swing.JLabel home;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel reports1;
    private javax.swing.JPanel upPanel;
    private javax.swing.JLabel users1;
    // End of variables declaration//GEN-END:variables
}