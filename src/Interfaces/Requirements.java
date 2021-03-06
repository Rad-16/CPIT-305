package Interfaces;

//Imports
import static Interfaces.LogIn.u;
import static Interfaces.startApp.j;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

//Class To Take Requirements Test
public class Requirements extends javax.swing.JFrame {

    public Requirements() {
        
        initComponents();
        
    //----------------------------------Icons-----------------------------------
    
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
        
        ImageIcon Quiz = new ImageIcon("Icon\\shopping-list.png");
        ImageIcon QuizS = new ImageIcon(Quiz.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        QuizIcon.setIcon(QuizS);
        
    //--------------------------------------------------------------------------
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes); buttonGroup.add(No);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        backLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        AgeSpinner = new javax.swing.JSpinner();
        WeightLabel = new javax.swing.JLabel();
        WeightSpinner = new javax.swing.JSpinner();
        AntibioticsLabel = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        Reslut = new javax.swing.JButton();
        age_Error = new javax.swing.JLabel();
        w_Error = new javax.swing.JLabel();
        LastDonComboBox = new javax.swing.JComboBox<>();
        LastDonLabel = new javax.swing.JLabel();
        LineDown = new javax.swing.JLabel();
        LineUp = new javax.swing.JLabel();
        QuizIcon = new javax.swing.JLabel();
        LastDon_Erorr = new javax.swing.JLabel();
        Antibiotic_Erorr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(u.getID());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Close(evt);
            }
        });

        PinkBackground.setBackground(new java.awt.Color(255, 230, 230));
        PinkBackground.setAutoscrolls(true);
        PinkBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomepageText.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        HomepageText.setText("Requirements Test");
        PinkBackground.add(HomepageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

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

        backLabel.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        backLabel.setText("< Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
        });
        PinkBackground.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        AgeLabel.setBackground(new java.awt.Color(255, 255, 255));
        AgeLabel.setFont(new java.awt.Font("Book Antiqua", 0, 22)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(61, 9, 9));
        AgeLabel.setText("Age: ");
        PinkBackground.add(AgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, 29));

        AgeSpinner.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        PinkBackground.add(AgeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 30));

        WeightLabel.setBackground(new java.awt.Color(255, 204, 204));
        WeightLabel.setFont(new java.awt.Font("Book Antiqua", 0, 22)); // NOI18N
        WeightLabel.setForeground(new java.awt.Color(61, 9, 9));
        WeightLabel.setText("Weight: ");
        PinkBackground.add(WeightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 29));

        WeightSpinner.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        PinkBackground.add(WeightSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 60, 30));

        AntibioticsLabel.setBackground(new java.awt.Color(255, 204, 204));
        AntibioticsLabel.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        AntibioticsLabel.setForeground(new java.awt.Color(61, 9, 9));
        AntibioticsLabel.setText("Taking antibiotics:");
        PinkBackground.add(AntibioticsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 29));
        AntibioticsLabel.getAccessibleContext().setAccessibleName("Was last donation before \n3 months?");

        yes.setBackground(new java.awt.Color(255, 255, 255));
        yes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        yes.setText("Yes");
        PinkBackground.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 325, -1, 20));

        No.setBackground(new java.awt.Color(255, 255, 255));
        No.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        No.setText("No");
        No.setToolTipText("");
        PinkBackground.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 325, -1, 20));

        Reslut.setBackground(new java.awt.Color(207, 117, 117));
        Reslut.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        Reslut.setForeground(new java.awt.Color(255, 255, 255));
        Reslut.setText("Result");
        Reslut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReslutActionPerformed(evt);
            }
        });
        PinkBackground.add(Reslut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 90, -1));
        PinkBackground.add(age_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 90, 20));
        PinkBackground.add(w_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 225, 90, 20));

        LastDonComboBox.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        LastDonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1-3 Weeks ago", "1-3 Months ago", "More than 3 Months" }));
        LastDonComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LastDonComboBox.setFocusTraversalPolicyProvider(true);
        LastDonComboBox.setName(""); // NOI18N
        PinkBackground.add(LastDonComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 28));

        LastDonLabel.setBackground(new java.awt.Color(255, 204, 204));
        LastDonLabel.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        LastDonLabel.setForeground(new java.awt.Color(61, 9, 9));
        LastDonLabel.setText("Last Donatin:");
        PinkBackground.add(LastDonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 29));

        LineDown.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        LineDown.setForeground(new java.awt.Color(178, 169, 169));
        LineDown.setText("_________________________");
        PinkBackground.add(LineDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        LineUp.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        LineUp.setForeground(new java.awt.Color(178, 169, 169));
        LineUp.setText("_________________________");
        PinkBackground.add(LineUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 135, -1, -1));
        PinkBackground.add(QuizIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 390, 90, 80));
        PinkBackground.add(LastDon_Erorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 295, 120, 20));
        PinkBackground.add(Antibiotic_Erorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method To Go To The HomePage
    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed

        dispose();
        Homepage H = new Homepage();
        H.setVisible(true);
        
    }//GEN-LAST:event_backLabelMousePressed

    //Method To Get The Result Of The Test
    private void ReslutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReslutActionPerformed
        
        //Initalise Text
        age_Error.setText(" ");
        w_Error.setText(" ");
        LastDon_Erorr.setText(" ");
        Antibiotic_Erorr.setText(" ");
        
        boolean validage = checkAge();
        boolean validweight = checkWeight();
        boolean vaildmonth = checkLastDonation();
        boolean validans= checkantibiotics();

    //-------------------------------Combine----------------------------------//
        boolean Validinfo = validweight && vaildmonth && validans&&validage;

    //--------------------------------Result----------------------------------//
                
        //if Result is true, go Center
        if (Validinfo == true) {
            j.showMessageDialog(null, "Congratulation! You can Donate");
            u.setEligible(1);
        } else{
            u.setEligible(0);
            j.showMessageDialog(null, "Sorry, you are not Eligible to Donate");
        }
        
        Homepage H = new Homepage();
        H.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ReslutActionPerformed

    //Method To Notify The Server When User Exit
    private void Close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Close

        Interfaces.startApp.out.println("* Client " + u.getID() + " Exit *");
        System.exit(0);
        
    }//GEN-LAST:event_Close

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
            java.util.logging.Logger.getLogger(Requirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requirements().setVisible(true);
            }
        });
    }
      
    
    //Method To Check Age
    private boolean checkAge() {

    //------------------------Initalise------------------------//
        boolean valid = true;
        int age = Integer.parseInt(AgeSpinner.getValue().toString());

    //--------------------------Case1--------------------------//
   
        //if Age is Equal to nothing
        if (age == 0) {
            age_Error.setText("Enter Age");
            age_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case2--------------------------//
        
        //Must be Older  
        else if (age < 18) {
            age_Error.setText("Older than 18");
            age_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case3--------------------------//
        
        //Must be Younger 
        else if (age > 60) {
            age_Error.setText("Younger than 60");
            age_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case4--------------------------//
        
        //Age between 18 and 60
        else {
            valid= true;
        }
        
    //-------------------------Return--------------------------//
        return valid;
    }
         
    //Method To Check Weight
    private boolean checkWeight() {

    //------------------------Initalise------------------------//
        boolean valid = true;
        int weight = Integer.parseInt(WeightSpinner.getValue().toString());

    //--------------------------Case1--------------------------//
   
        //if Age is Equal to nothing
        if (weight == 0) {
            w_Error.setText("Enter Weight");
            w_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case2--------------------------//
        
        //Age must be digit 
        else if (weight < 50) {
            w_Error.setText("50kg or above");
            w_Error.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case3--------------------------//
        
        //Weight above 50
        else  {
            valid = true;
        }
        
    //-------------------------Return--------------------------//
        return valid;
    }
    
    //Method To Check The Last Donation
    private boolean checkLastDonation() {
        
    //------------------------Initalise------------------------//
        boolean valid = true;
        String LastDon = LastDonComboBox.getSelectedItem().toString();
        
    //--------------------------Case1--------------------------//
    
        //No value entered
        if(LastDon.equals("More than 3 Months")){
            valid = true;
        }
        
    //--------------------------Case2--------------------------//
        else{
            LastDon_Erorr.setText("Wait above 3 months");
            LastDon_Erorr.setForeground(Color.red);
            valid = false;
        }
        
    //-------------------------Return--------------------------//
        return valid;
        
    }
             
    //Method To Check antibiotics
    private boolean checkantibiotics() {
        
    //------------------------Initalise------------------------//
        boolean valid = true;
        Boolean y= yes.isSelected();
        Boolean n = No.isSelected();
        
    //--------------------------Case1--------------------------//
    
        //if no choice
        if (!y && !n) {
            Antibiotic_Erorr.setText("Select a Choice");
            Antibiotic_Erorr.setForeground(Color.red);
            valid = false;
        } 
       
    //--------------------------Case2--------------------------//
        
        //If yes choice selected
        else if(y) {
            Antibiotic_Erorr.setText("Must stop for a while");
            Antibiotic_Erorr.setForeground(Color.red);
            valid = false;
        } 
        
    //--------------------------Case2--------------------------//
        
        //If no choice selected
        else {
            valid = true;
        }
        
    //-------------------------Return--------------------------//
        return valid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JSpinner AgeSpinner;
    private javax.swing.JLabel Antibiotic_Erorr;
    private javax.swing.JLabel AntibioticsLabel;
    private javax.swing.JLabel BatteryIcon;
    private javax.swing.JLabel HomepageText;
    private javax.swing.JComboBox<String> LastDonComboBox;
    private javax.swing.JLabel LastDonLabel;
    private javax.swing.JLabel LastDon_Erorr;
    private javax.swing.JLabel LineDown;
    private javax.swing.JLabel LineUp;
    private javax.swing.JLabel MenuIcon;
    private javax.swing.JLabel NetworkIcon;
    private javax.swing.JRadioButton No;
    private javax.swing.JPanel PhoneInfoPanel;
    private javax.swing.JPanel PinkBackground;
    private javax.swing.JLabel QuizIcon;
    private javax.swing.JButton Reslut;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel TimeIcon;
    private javax.swing.JPanel UbMenu;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JSpinner WeightSpinner;
    private javax.swing.JLabel WiFiIcon;
    private javax.swing.JLabel age_Error;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel w_Error;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables

}//class
