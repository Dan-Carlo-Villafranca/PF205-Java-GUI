package Staff;


import admin.*;
import pages.landingForm;
import javax.swing.*;
import config.config;
import Login.Login;
import Users.UserView;
import View.DonationViewStaff;
import View.RecordsStaffView;
import View.RecordsView;
import View.RequestStaffView;
import View.RequestView;
import View.StockView;
import View.StockViewStaff;
import View.UserViewStaff;


public class StaffDashboard extends javax.swing.JFrame {

    public StaffDashboard() {
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

        updateRequestValue();
        updateDonationValue();
        updateWarningStatus();

    }
public void updateRequestValue() {
    config con = new config();
    // This counts every single request in your table
    String sql = "SELECT COUNT(*) FROM tbl_requests";

    try (java.sql.Connection conn = con.connectDB();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
         java.sql.ResultSet rs = pstmt.executeQuery()) {

        if (rs.next()) {
            int count = rs.getInt(1);
            
            // This links the database number to your specific label
            request_value.setText(String.valueOf(count)); 
        }

    } catch (java.sql.SQLException e) {
        System.out.println("Error updating request_value: " + e.getMessage());
    }
}

public void updateDonationValue() {
    config con = new config();
    String sql = "SELECT COUNT(*) FROM tbl_donations";

    try (java.sql.Connection conn = con.connectDB();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
         java.sql.ResultSet rs = pstmt.executeQuery()) {

        if (rs.next()) {
            int count = rs.getInt(1);
            // Updates the label for donations
            donations_value.setText(String.valueOf(count)); 
        }

    } catch (java.sql.SQLException e) {
        System.out.println("Error updating donations_value: " + e.getMessage());
    }
}

public void updateWarningStatus() {
    config con = new config();
    String countSql = "SELECT COUNT(*) FROM tbl_blood";
    // Modified to select BOTH type and quantity
    String lowSql = "SELECT blood_type, quantity FROM tbl_blood WHERE quantity < 5";

    try (java.sql.Connection conn = con.connectDB();
         java.sql.PreparedStatement pstmtCount = conn.prepareStatement(countSql);
         java.sql.ResultSet rsCount = pstmtCount.executeQuery()) {

        if (rsCount.next() && rsCount.getInt(1) == 0) {
            warningLabel.setText("No Inventory Recorded");
            warningLabel.setForeground(new java.awt.Color(200, 200, 200)); 
            return;
        }

        try (java.sql.PreparedStatement pstmtLow = conn.prepareStatement(lowSql);
             java.sql.ResultSet rsLow = pstmtLow.executeQuery()) {

            java.util.List<String> emptyTypes = new java.util.ArrayList<>();
            java.util.List<String> lowTypes = new java.util.ArrayList<>();

            while (rsLow.next()) {
                String type = rsLow.getString("blood_type");
                int qty = rsLow.getInt("quantity");
                
                if (qty <= 0) {
                    emptyTypes.add(type);
                } else {
                    lowTypes.add(type);
                }
            }

            if (emptyTypes.isEmpty() && lowTypes.isEmpty()) {
                warningLabel.setText("All stocks sufficient");
                warningLabel.setForeground(new java.awt.Color(144, 238, 144)); // Light Green
            } else if (!emptyTypes.isEmpty()) {
                // PRIORITIZE EMPTY: Show types that are at 0
                String joinedEmpty = String.join(", ", emptyTypes);
                warningLabel.setText("‼ EMPTY: " + joinedEmpty);
                warningLabel.setForeground(java.awt.Color.WHITE); // High contrast for danger
            } else {
                // SHOW LOW: Only if nothing is at 0
                String joinedLow = String.join(", ", lowTypes);
                if (joinedLow.length() > 15) {
                    warningLabel.setText("Multiple types low!");
                } else {
                    warningLabel.setText("Low: " + joinedLow);
                }
                warningLabel.setForeground(java.awt.Color.YELLOW); 
            }
        }

    } catch (java.sql.SQLException e) {
        System.out.println("Error updating warningLabel: " + e.getMessage());
        warningLabel.setText("Error loading data");
    }
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
        total_stock = new javax.swing.JPanel();
        stocks_txt = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        blood_request = new javax.swing.JPanel();
        requests_txt = new javax.swing.JLabel();
        request_value = new javax.swing.JLabel();
        donations = new javax.swing.JPanel();
        Donations_txt = new javax.swing.JLabel();
        donations_value = new javax.swing.JLabel();
        UserButton2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
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
        jLabel1.setText("Staff DASHBOARD");
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

        total_stock.setBackground(new java.awt.Color(255, 51, 50));
        total_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_stockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                total_stockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                total_stockMouseExited(evt);
            }
        });

        stocks_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stocks_txt.setForeground(new java.awt.Color(255, 255, 255));
        stocks_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocks_txt.setText("Stocks");

        warningLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel.setText("jlabel");

        javax.swing.GroupLayout total_stockLayout = new javax.swing.GroupLayout(total_stock);
        total_stock.setLayout(total_stockLayout);
        total_stockLayout.setHorizontalGroup(
            total_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stockLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(stocks_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        total_stockLayout.setVerticalGroup(
            total_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_stockLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(stocks_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(total_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 100));

        blood_request.setBackground(new java.awt.Color(255, 51, 51));
        blood_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blood_requestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blood_requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blood_requestMouseExited(evt);
            }
        });

        requests_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requests_txt.setForeground(new java.awt.Color(255, 255, 255));
        requests_txt.setText("Requests");

        request_value.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        request_value.setForeground(new java.awt.Color(255, 255, 255));
        request_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        request_value.setText("jLabel6");

        javax.swing.GroupLayout blood_requestLayout = new javax.swing.GroupLayout(blood_request);
        blood_request.setLayout(blood_requestLayout);
        blood_requestLayout.setHorizontalGroup(
            blood_requestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blood_requestLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(blood_requestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(requests_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(request_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        blood_requestLayout.setVerticalGroup(
            blood_requestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blood_requestLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(requests_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(request_value)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(blood_request, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 200, 100));

        donations.setBackground(new java.awt.Color(255, 51, 51));
        donations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donationsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donationsMouseExited(evt);
            }
        });

        Donations_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Donations_txt.setForeground(new java.awt.Color(255, 255, 255));
        Donations_txt.setText("Donations");

        donations_value.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donations_value.setForeground(new java.awt.Color(255, 255, 255));
        donations_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donations_value.setText("jLabel6");

        javax.swing.GroupLayout donationsLayout = new javax.swing.GroupLayout(donations);
        donations.setLayout(donationsLayout);
        donationsLayout.setHorizontalGroup(
            donationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationsLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(donationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(donations_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Donations_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        donationsLayout.setVerticalGroup(
            donationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Donations_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(donations_value)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(donations, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, 100));

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

        Reports.setBackground(new java.awt.Color(204, 0, 51));
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });

        reports.setBackground(new java.awt.Color(255, 102, 102));
        reports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports.setForeground(new java.awt.Color(240, 240, 240));
        reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports.setText("Reports");
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reports)
                .addContainerGap())
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 30));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeButtonMouseEntered(evt);
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

    private void ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseClicked
        RecordsStaffView rsv = new RecordsStaffView();
        rsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReportsMouseClicked

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

    private void UserButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseEntered
        UserButton1.setBackground(new java.awt.Color(255, 102, 102));  
    }//GEN-LAST:event_UserButton1MouseEntered

    private void UserButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton1MouseExited
        UserButton1.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton1MouseExited

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
        Reports.setBackground(new java.awt.Color(255, 102, 102)); 
    }//GEN-LAST:event_ReportsMouseEntered

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
        Reports.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_ReportsMouseExited

    private void UserButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseEntered
        UserButton2.setBackground(new java.awt.Color(255, 102, 102)); 
    }//GEN-LAST:event_UserButton2MouseEntered

    private void UserButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButton2MouseExited
        UserButton2.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_UserButton2MouseExited

    private void StocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseClicked
        StockViewStaff svs = new StockViewStaff();
        
        svs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StocksMouseClicked

    private void StocksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseEntered
        Stocks.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_StocksMouseEntered

    private void StocksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksMouseExited
        Stocks.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_StocksMouseExited

    private void total_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_stockMouseEntered
        total_stock.setBackground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_total_stockMouseEntered

    private void total_stockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_stockMouseExited
        total_stock.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_total_stockMouseExited

    private void blood_requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_requestMouseEntered
        blood_request.setBackground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_blood_requestMouseEntered

    private void blood_requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_requestMouseExited
        blood_request.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_blood_requestMouseExited

    private void donationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationsMouseEntered
        donations.setBackground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_donationsMouseEntered

    private void donationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationsMouseExited
        donations.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_donationsMouseExited

    private void blood_requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_requestMouseClicked
        RequestStaffView rsv = new RequestStaffView();
        rsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_blood_requestMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        reportsMouseClicked(null);
    }//GEN-LAST:event_reportsMouseClicked

    private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseEntered
        HomeButton.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_HomeButtonMouseEntered

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_reportsMouseExited

    private void donationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationsMouseClicked
//        DonationViewStaff dvs = new DonationViewStaff();
//        dvs.setVisible(true);
//        this.dispose();

        RecordsStaffView rsv = new RecordsStaffView();
        rsv.reportTypeSelect.setSelectedItem("Donation History");
        rsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donationsMouseClicked

    private void total_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_stockMouseClicked
        StockView sview = new StockView();
        
        sview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_total_stockMouseClicked
    
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
                new StaffDashboard().setVisible(true);
            }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel BlockPane3;
    private javax.swing.JLabel Donations_txt;
    private javax.swing.JPanel HomeButton;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Stocks;
    private javax.swing.JPanel UserButton1;
    private javax.swing.JPanel UserButton2;
    private javax.swing.JLabel acc_email;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_type2;
    private javax.swing.JPanel blood_request;
    private javax.swing.JPanel donations;
    private javax.swing.JLabel donations_value;
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
    private javax.swing.JLabel request_value;
    private javax.swing.JLabel requests_txt;
    private javax.swing.JLabel stocks_txt;
    private javax.swing.JPanel total_stock;
    private javax.swing.JPanel upPanel;
    private javax.swing.JLabel users1;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}