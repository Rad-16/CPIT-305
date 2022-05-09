package Interfaces;

import static Interfaces.LogIn.u;
import static Interfaces.startApp.clients;
import static Interfaces.startApp.j;
import static Interfaces.startApp.out;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class OnlineDonation extends javax.swing.JFrame {

    private Connection con = null;

    public OnlineDonation() {
        initComponents();
        
        ImageIcon Menu = new ImageIcon("Icon\\menu.png");
        ImageIcon MenuS = new ImageIcon(Menu.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        MenuIcon.setIcon(MenuS);
        
        ImageIcon BDon = new ImageIcon("Icon\\blood-donation.png");
        ImageIcon BDonS = new ImageIcon(BDon.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH));
        BDonIcon.setIcon(BDonS);
        
        ImageIcon Battery = new ImageIcon("Icon\\battery-status.png");
        ImageIcon BatteryS = new ImageIcon(Battery.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        BatteryIcon.setIcon(BatteryS);
        
        ImageIcon WiFi = new ImageIcon("Icon\\wifi.png");
        ImageIcon WiFiS = new ImageIcon(WiFi.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        WiFiIcon.setIcon(WiFiS);
        
        ImageIcon Network = new ImageIcon("Icon\\signal.png");
        ImageIcon NetworkS = new ImageIcon(Network.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        NetworkIcon.setIcon(NetworkS);
        
        try {
            
            // (1) driver for JDBC connections
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // (2) path for database
            //String url = "Users_Database.accdb";

            // (3) ODBC connection string
            String dbURL = "jdbc:ucanaccess://Users_Database.accdb";

            // (4) create connection
            con = DriverManager.getConnection(dbURL);
            
            // (5) Create Statment
            Statement st = con.createStatement();

            // (6) Ecute Query
            String query1 = "SELECT ID FROM Request";
            ResultSet rs = st.executeQuery(query1);

            // (7) Fill the Array
            while (rs.next()) {
                String ID = rs.getString("ID");
                clients.add(ID);
            }
            
            // (7) Show The Requests
            ResultSet rs2 = st.executeQuery(query1);
            String[] d = new String[clients.size()];
            int i = 0;
            while (rs2.next()) {
                String ID = rs2.getString("ID");
                d[i] = ID;
                i++;
            }
            Requests.setListData(d);
                
        }//try
        
        //SQL Exception
        catch (SQLException s) {
            j.showMessageDialog(null, "There is an SQL Erorr: " + s.getMessage());
        } 

        //Class Not Found Exception
        catch (ClassNotFoundException ex) {
            j.showMessageDialog(null, "Class Not Found: " + ex.getMessage());
        }
        
    }//OnlineDonation

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PinkBackground = new javax.swing.JPanel();
        HomepageText = new javax.swing.JLabel();
        BDonIcon = new javax.swing.JLabel();
        UbMenu = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        MenuIcon = new javax.swing.JLabel();
        PhoneInfoPanel = new javax.swing.JPanel();
        TimeIcon = new javax.swing.JLabel();
        BatteryIcon = new javax.swing.JLabel();
        WiFiIcon = new javax.swing.JLabel();
        NetworkIcon = new javax.swing.JLabel();
        HomepageText4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Requests = new javax.swing.JList<>();
        NoReq = new javax.swing.JLabel();
        AddReq = new javax.swing.JButton();
        Donate = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(u.getID());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Close(evt);
            }
        });

        PinkBackground.setBackground(new java.awt.Color(255, 230, 230));
        PinkBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomepageText.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        HomepageText.setText("Onine Donation");
        PinkBackground.add(HomepageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        PinkBackground.add(BDonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 125, 125));

        UbMenu.setBackground(new java.awt.Color(255, 204, 204));
        UbMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Text.setText("Blood Donation");
        Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        UbMenu.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 28));
        UbMenu.add(MenuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 30, 30));

        PinkBackground.add(UbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 50));

        PhoneInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        PhoneInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TimeIcon.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        TimeIcon.setText("12:00");

        BatteryIcon.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N

        WiFiIcon.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N

        NetworkIcon.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N

        javax.swing.GroupLayout PhoneInfoPanelLayout = new javax.swing.GroupLayout(PhoneInfoPanel);
        PhoneInfoPanel.setLayout(PhoneInfoPanelLayout);
        PhoneInfoPanelLayout.setHorizontalGroup(
            PhoneInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TimeIcon)
                .addGap(202, 202, 202)
                .addComponent(NetworkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(WiFiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(BatteryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        PhoneInfoPanelLayout.setVerticalGroup(
            PhoneInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhoneInfoPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(PhoneInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NetworkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WiFiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BatteryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PinkBackground.add(PhoneInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 20));

        HomepageText4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        HomepageText4.setForeground(new java.awt.Color(178, 169, 169));
        HomepageText4.setText("_________________________");
        PinkBackground.add(HomepageText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, 230, 30));

        jScrollPane2.setViewportView(Requests);

        PinkBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 70));

        NoReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NoReq.setForeground(new java.awt.Color(255, 0, 0));
        PinkBackground.add(NoReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 150, 20));

        AddReq.setFont(new java.awt.Font("Book Antiqua", 0, 15)); // NOI18N
        AddReq.setText("Add Requset");
        AddReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReqActionPerformed(evt);
            }
        });
        PinkBackground.add(AddReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 120, 40));

        Donate.setFont(new java.awt.Font("Book Antiqua", 0, 15)); // NOI18N
        Donate.setText("Donate ");
        Donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonateActionPerformed(evt);
            }
        });
        PinkBackground.add(Donate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 40));

        backLabel.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        backLabel.setText("< Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
        });
        PinkBackground.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReqActionPerformed
        
        try {
            
            //if User Login Correctly
            if (u != null) {

                Statement st = con.createStatement();

                st.executeUpdate("INSERT INTO Request" + " VALUES(" + u.getID() + ")");
                
                String query1 = "SELECT ID FROM Request";
                ResultSet rs = st.executeQuery(query1);
                
                //Add User to ArrayList
                clients.add(u.getID());
                String[] d = new String[clients.size()];
                
                //Make Array of String to show the new Requests
                int i = 0;
                while (rs.next()) {
                    String ID = rs.getString("ID");
                    d[i] = ID;
                    i++;
                }
                
                Requests.setListData(d);
                
                AddReq.setText(" ");
                
                // Notify The Server That a Client Added Request
                Interfaces.startApp.out.println("Client " + u.getID() + " Add Donation Request");
            }//if

            //Add Dialog
            else {
                j.showMessageDialog(null, "LogIn First");
            }

        }//try
        
        //SQL Exception
        catch (SQLException ex) {
            j.showMessageDialog(null, "There is an SQL Erorr: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_AddReqActionPerformed

    private void DonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonateActionPerformed

        //if there this selection
        if(u != null){
        if (!Requests.isSelectionEmpty()) {

            //Checks
            if (u.isEligible() == 0) {
                j.showMessageDialog(null, "Sorry, you are not Eligible to Donate");
            } else if (u.isEligible() == -1) {
                j.showMessageDialog(null, "Take the reqiurement quiz first");
            } else if(Requests.getSelectedValue().equals(u.getID())){
                j.showMessageDialog(null, "You Can Not Donate for Yourself");
            }
            
            //if Everything Correct
            else {
                                
                try {
                    
                    //(1) Create Statment
                    Statement st = con.createStatement();
                    
                    //(2) Delete Query
                    String query = "DELETE FROM Request WHERE ID = " + Requests.getSelectedValue();
                    int deleted = st.executeUpdate(query);
                    
                    // Notify The Server
                        Interfaces.startApp.out.println("Client " + u.getID() + " Donated to " + Requests.getSelectedValue());
                }//try
                
                //SQL Exception
                catch (SQLException s) {
                    j.showMessageDialog(null, "There is an SQL Erorr: " + s.getMessage());
                }

                //Reomve Request from ArrayList
                for (int i = 0; i < clients.size(); i++) {
                    if (Requests.getSelectedValue() == clients.get(i)) {
                        
                        
                        clients.remove(clients.get(i));
                    }
                }
                
                //Choose Appointement
                dispose();
                Centers C = new Centers();
                C.setVisible(true);                

            }//else
            
        }//if
        
        //If there is no Selection
        else {
            j.showMessageDialog(null, "Choose a request to donate first");
        }
        
        }
        else{
            j.showMessageDialog(null, "LogIn First");
        }
    }//GEN-LAST:event_DonateActionPerformed

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed

        dispose();
        Homepage H = new Homepage();
        H.setVisible(true);
        
    }//GEN-LAST:event_backLabelMousePressed

    private void Close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Close
        // Notify The Server When User Exit
        Interfaces.startApp.out.println("* Client " + u.getID() + " Exit *");
        System.exit(0);
    }//GEN-LAST:event_Close

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineDonation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReq;
    private javax.swing.JLabel BDonIcon;
    private javax.swing.JLabel BatteryIcon;
    private javax.swing.JButton Donate;
    private javax.swing.JLabel HomepageText;
    private javax.swing.JLabel HomepageText4;
    private javax.swing.JLabel MenuIcon;
    private javax.swing.JLabel NetworkIcon;
    private javax.swing.JLabel NoReq;
    private javax.swing.JPanel PhoneInfoPanel;
    private javax.swing.JPanel PinkBackground;
    private javax.swing.JList<String> Requests;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel TimeIcon;
    private javax.swing.JPanel UbMenu;
    private javax.swing.JLabel WiFiIcon;
    private javax.swing.JLabel backLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
