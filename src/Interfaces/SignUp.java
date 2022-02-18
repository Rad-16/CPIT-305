/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.startApp.users;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    
    boolean validInfo;
    
    public SignUp() {
        initComponents();
        
//---------------------------------Icons----------------------------------//

        ImageIcon Menu = new ImageIcon("Icon\\menu.png");
        ImageIcon MenuS = new ImageIcon(Menu.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        MenuIcon.setIcon(MenuS);
        
        ImageIcon Battery = new ImageIcon("Icon\\battery-status.png");
        ImageIcon BatteryS = new ImageIcon(Battery.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        BatteryIcon.setIcon(BatteryS);
        
        ImageIcon WiFi = new ImageIcon("Icon\\wifi.png");
        ImageIcon WiFiS = new ImageIcon(WiFi.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        WiFiIcon.setIcon(WiFiS);
        
        ImageIcon Network = new ImageIcon("Icon\\signal.png");
        ImageIcon NetworkS = new ImageIcon(Network.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH));
        NetworkIcon.setIcon(NetworkS);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PinkBackground = new javax.swing.JPanel();
        HomepageText = new javax.swing.JLabel();
        UbMenu = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        MenuIcon = new javax.swing.JLabel();
        PhoneInfoPanel = new javax.swing.JPanel();
        TimeIcon = new javax.swing.JLabel();
        BatteryIcon = new javax.swing.JLabel();
        WiFiIcon = new javax.swing.JLabel();
        NetworkIcon = new javax.swing.JLabel();
        PWText = new javax.swing.JLabel();
        IDText = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        IDField = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Email = new javax.swing.JPasswordField();
        PWText1 = new javax.swing.JLabel();
        IDText1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Password_Error = new javax.swing.JLabel();
        ID_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PinkBackground.setBackground(new java.awt.Color(255, 230, 230));
        PinkBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomepageText.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        HomepageText.setText("Sign up");
        PinkBackground.add(HomepageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

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

        PWText.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        PWText.setText("Password:");
        PinkBackground.add(PWText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        IDText.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        IDText.setText("ID/Iqama:");
        PinkBackground.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        PinkBackground.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, -1));
        PinkBackground.add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, -1));

        Enter.setBackground(new java.awt.Color(255, 255, 255));
        Enter.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Enter.setText("Sign up");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        PinkBackground.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 40));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        PinkBackground.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, -1));

        PWText1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        PWText1.setText("Email:");
        PinkBackground.add(PWText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        IDText1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        IDText1.setText("Name:");
        PinkBackground.add(IDText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        PinkBackground.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, -1));

        Password_Error.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Password_Error.setForeground(new java.awt.Color(255, 51, 51));
        PinkBackground.add(Password_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 390, 120, 20));

        ID_Error.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        ID_Error.setForeground(new java.awt.Color(255, 51, 51));
        PinkBackground.add(ID_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 270, 120, 20));

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

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PassActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed

        System.out.println("sign");
    //--------------------------------Checks----------------------------------//
        boolean validPassword = checkPassword();
        boolean validEmail = checkID();

//-------------------------------Combine----------------------------------//
        validInfo = validPassword && validEmail;

//--------------------------------Reslut----------------------------------//
        if (validInfo == true) {
            
            //Get User Info
            String ID = IDField.getText().trim();
            String Password = new String (Pass.getPassword());
            
            //Add User to the array
            users.add(new User(ID, Password));
            
            //try to write User Info. to the file
            try (BufferedWriter out = new BufferedWriter(new FileWriter("Users.txt", true))) {
                
                //Write User Info
                out.write("\n" + ID + "_" + Password);
                
                //Open Login Interface
                LogIn n = new LogIn();
                n.setVisible(true);
                this.dispose();
            } 
            
            //File Exception
            catch (FileNotFoundException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            //IO Exception
            catch (IOException ex) {
                Logger.getLogger(startApp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }//if

    }//GEN-LAST:event_EnterActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private boolean checkPassword() {

        //------------------------Initalise------------------------//
        boolean valid = true;
        String password = new String (Pass.getPassword());
        Password_Error.setText("");

    //--------------------------Case1--------------------------//
        
        //Equal to nothing
        if (password.trim().equals("")) {
            valid = false;
            Password_Error.setText("Enter Password");
            Password_Error.setForeground(Color.red);

            Pass.setText("");

        } 
    
    //--------------------------Cas2--------------------------//
        
        //Correct format
        else if (password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{6,10}$")) {
            
        } 
        
    //--------------------------Case3--------------------------//
        
        //not in the right format
        else {
            valid = false;
            Password_Error.setText("Incorrect Password");
            Password_Error.setForeground(Color.red);
            
            Pass.setText("");
        }

    //-------------------------Return--------------------------//
        return valid;
    }
    
    private boolean checkID() {

        //------------------------Initalise------------------------//
        boolean valid = true;
        String ID = IDField.getText();

    //--------------------------Case1--------------------------//
    
        //if ID is Equal to nothing
        if (ID.trim().equals("")) {
            ID_Error.setText("Enter Your ID/Iqama");
            ID_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case2--------------------------//
        
        //ID must be Only 10 digit
        else if (ID.matches("[0-9]+") && ID.length() == 10) {
            ID_Error.setText(" ");
        } 
        
    //--------------------------Case3--------------------------//
        
        //if ID not digit or not in right length
        else {
            ID_Error.setText("10-digit ID/Iqama");
            ID_Error.setForeground(Color.red);
            valid = false;
        }
        
    //-------------------------Return--------------------------//
        return valid;
    }
    
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BatteryIcon;
    private javax.swing.JPasswordField Email;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel HomepageText;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDText;
    private javax.swing.JLabel IDText1;
    private javax.swing.JLabel ID_Error;
    private javax.swing.JLabel MenuIcon;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NetworkIcon;
    private javax.swing.JLabel PWText;
    private javax.swing.JLabel PWText1;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel Password_Error;
    private javax.swing.JPanel PhoneInfoPanel;
    private javax.swing.JPanel PinkBackground;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel TimeIcon;
    private javax.swing.JPanel UbMenu;
    private javax.swing.JLabel WiFiIcon;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
