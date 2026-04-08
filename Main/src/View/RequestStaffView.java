package View;


import Users.*;
import admin.*;
import pages.landingForm;
import javax.swing.*;
import config.config;
import Login.Login;
import Staff.StaffDashboard;
import javax.swing.table.TableModel;



public class RequestStaffView extends javax.swing.JFrame {

    public RequestStaffView() {
        initComponents();
        acc_name1.setText(config.Session.name);
        acc_type2.setText(config.Session.type);
        getRequestsData();
    }
    
    void getRequestsData() {
    config con = new config();
    
    // We change the table to tbl_blood and filter for 'Pending'
    // We also use 'AS' to make the headers look professional in the JTable
        String sql = "SELECT r_id AS 'Request ID', u_id AS 'Account ID', blood_type as 'Blood Type', quantity AS 'Quantity', r_date AS 'Request Date', status AS 'Status' FROM tbl_requests WHERE status = 'Pending'";


    // This will now fill your specific table (e.g., requestTable)
    con.displayData(sql, requestTable);
}
    
    // --- ADDED SEARCH FILTER METHOD ---
    public void searchFilter() {
        config con = new config();
        String find = search.getText();
        
        // If search is empty or placeholder, show all data
        if (find.isEmpty() || find.equals("Search")) {
            getRequestsData();
            return;
        }

        String sql = "SELECT r_id, u_id, blood_type, r_date, status FROM tbl_requests "
                   + "WHERE u_id LIKE '%" + find + "%' "
                   + "OR r_id LIKE '%" + find + "%' "
                   + "OR blood_type LIKE '%" + find + "%' "
                   + "OR status LIKE '%" + find + "%'";

        con.displayData(sql, requestTable);
    }
    
    public void declineRequest() {
    int rowIndex = requestTable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a request to decline!");
        return;
    }

    TableModel model = requestTable.getModel();
    String id = model.getValueAt(rowIndex, 0).toString(); // Assuming column 0 is r_id
    String bloodType = model.getValueAt(rowIndex, 2).toString();

    // 1. Confirm the action
    int confirm = JOptionPane.showConfirmDialog(null, 
            "Are you sure you want to decline the request for " + bloodType + "?", 
            "Decline Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        config con = new config();
        
        // 2. SQL Update Statement
        String sql = "UPDATE tbl_requests SET status = 'Declined' WHERE r_id = ?";
        
        // 3. Execute update (using your existing update method in config)
        con.addRecord(sql, id); 

        // 4. Refresh the table to show the new status
        getRequestsData(); 
        JOptionPane.showMessageDialog(null, "Request has been declined.");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        upPanel = new javax.swing.JPanel();
        downPanel = new javax.swing.JPanel();
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_type2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btn_approve = new javax.swing.JButton();
        btn_decline = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        UserButton2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        Stocks = new javax.swing.JPanel();
        reports = new javax.swing.JLabel();
        UserButton1 = new javax.swing.JPanel();
        users1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        ReportsStaff = new javax.swing.JPanel();
        reports1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 0, 51));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upPanel.setBackground(new java.awt.Color(204, 0, 51));
        upPanel.setForeground(new java.awt.Color(255, 255, 255));
        upPanel.setLayout(null);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Requests");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Profile Blank red small.png"))); // NOI18N

        acc_name1.setText("jLabel2");

        acc_type2.setForeground(new java.awt.Color(204, 0, 0));
        acc_type2.setText("jLabel2");

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(requestTable);

        btn_approve.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_approve.setText("Approve");
        btn_approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_approveActionPerformed(evt);
            }
        });

        btn_decline.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_decline.setText("Decline");
        btn_decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_declineActionPerformed(evt);
            }
        });

        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setText("Search");
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acc_name1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_approve, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_decline, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acc_type2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(acc_name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_type2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_approve)
                            .addComponent(btn_decline)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        reports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports.setForeground(new java.awt.Color(240, 240, 240));
        reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports.setText("Stocks");

        javax.swing.GroupLayout StocksLayout = new javax.swing.GroupLayout(Stocks);
        Stocks.setLayout(StocksLayout);
        StocksLayout.setHorizontalGroup(
            StocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StocksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StocksLayout.setVerticalGroup(
            StocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(Stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 30));

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

        ReportsStaff.setBackground(new java.awt.Color(204, 0, 51));
        ReportsStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsStaffMouseExited(evt);
            }
        });

        reports1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports1.setForeground(new java.awt.Color(240, 240, 240));
        reports1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports1.setText("Reports");

        javax.swing.GroupLayout ReportsStaffLayout = new javax.swing.GroupLayout(ReportsStaff);
        ReportsStaff.setLayout(ReportsStaffLayout);
        ReportsStaffLayout.setHorizontalGroup(
            ReportsStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reports1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReportsStaffLayout.setVerticalGroup(
            ReportsStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(ReportsStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 30));

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

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        StaffDashboard sdb = new StaffDashboard();
        sdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void StocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseClicked
        StockView sview = new StockView();
        
        sview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StocksMouseClicked

    private void UserButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseClicked
        UserViewStaff uvs = new UserViewStaff();
        
        uvs.setVisible(true);
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

    private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseEntered
        HomeButton.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_HomeButtonMouseEntered

    private void HomeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseExited
        HomeButton.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_HomeButtonMouseExited

    private void StocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseEntered
        Stocks.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_StocksMouseEntered

    private void StocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseExited
        Stocks.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_StocksMouseExited

    private void UserButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseEntered
        UserButton2.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_UserButton2MouseEntered

    private void UserButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseExited
        UserButton2.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton2MouseExited

    private void ReportsStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsStaffMouseClicked
        RecordsStaffView rsv = new RecordsStaffView();
        
        rsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReportsStaffMouseClicked

    private void ReportsStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsStaffMouseEntered
        ReportsStaff.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_ReportsStaffMouseEntered

    private void ReportsStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsStaffMouseExited
        ReportsStaff.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_ReportsStaffMouseExited

    private void UserButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseEntered
        UserButton1.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_UserButton1MouseEntered

    private void UserButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseExited
        UserButton1.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton1MouseExited

    private void btn_declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_declineActionPerformed
        declineRequest();
    }//GEN-LAST:event_btn_declineActionPerformed

    private void btn_approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_approveActionPerformed
        int rowIndex = requestTable.getSelectedRow();
            if (rowIndex < 0) {
                JOptionPane.showMessageDialog(null, "Please select a request first!");
                return;
            }

            config con = new config();
            TableModel model = requestTable.getModel();

            String r_id = model.getValueAt(rowIndex, 0).toString();    // Request ID ang 0
            String b_type = model.getValueAt(rowIndex, 2).toString();  // Blood Type and 2
            int qtyNeeded = Integer.parseInt(model.getValueAt(rowIndex, 3).toString()); // Quantity column

            // 1. Check if stock is sufficient
            String checkSql = "SELECT quantity FROM tbl_blood WHERE blood_type = ?";
            int currentStock = con.getSingleValue(checkSql, b_type);

            if (currentStock < qtyNeeded) {
                JOptionPane.showMessageDialog(null, "Insufficient Stock! Only " + currentStock + " bags available.");
            } else {
                // 2. Update status to Approved
                con.addRecord("UPDATE tbl_requests SET status = 'Approved' WHERE r_id = ?", r_id);

                // 3. Subtract from tbl_blood
                con.addRecord("UPDATE tbl_blood SET quantity = quantity - ? WHERE blood_type = ?", qtyNeeded, b_type);

                JOptionPane.showMessageDialog(null, "Request Approved!");
                getRequestsData(); // Refresh table
            }
    }//GEN-LAST:event_btn_approveActionPerformed

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        if (search.getText().equals("Search")) {
            search.setText("");
            search.setForeground(new java.awt.Color(0, 0, 0)); // Change text to black
        }
    }//GEN-LAST:event_searchFocusGained

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        if (search.getText().isEmpty()) {
            search.setForeground(new java.awt.Color(153, 153, 153)); // Change back to gray
            search.setText("Search");
        }
    }//GEN-LAST:event_searchFocusLost

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        searchFilter();
    }//GEN-LAST:event_searchKeyReleased
    
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
                if (config.Session.id == 0){
                    new Login().setVisible(true);
                } else {
                new RequestStaffView().setVisible(true);
            }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel HomeButton;
    private javax.swing.JPanel ReportsStaff;
    private javax.swing.JPanel Stocks;
    private javax.swing.JPanel UserButton1;
    private javax.swing.JPanel UserButton2;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_type2;
    private javax.swing.JButton btn_approve;
    private javax.swing.JButton btn_decline;
    private javax.swing.JPanel downPanel;
    private javax.swing.JLabel home;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel reports1;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField search;
    private javax.swing.JPanel upPanel;
    private javax.swing.JLabel users1;
    // End of variables declaration//GEN-END:variables
}