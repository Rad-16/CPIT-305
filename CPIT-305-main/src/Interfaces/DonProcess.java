/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class DonProcess extends javax.swing.JFrame {

    /**
     * Creates new form Donation
     */
    public DonProcess() {
        initComponents();
        
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
        
        ImageIcon DonProcess = new ImageIcon("Icon\\DonProcess.jpeg");
        ImageIcon DonProcessS = new ImageIcon(DonProcess.getImage().getScaledInstance(260, 340, Image.SCALE_SMOOTH));
        DonationPicture.setIcon(DonProcessS);
        
        
        
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
        UbMenu = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        MenuIcon = new javax.swing.JLabel();
        BookingText = new javax.swing.JLabel();
        PhoneInfoPanel = new javax.swing.JPanel();
        TimeIcon = new javax.swing.JLabel();
        BatteryIcon = new javax.swing.JLabel();
        WiFiIcon = new javax.swing.JLabel();
        NetworkIcon = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        DonationPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PinkBackground.setBackground(new java.awt.Color(255, 230, 230));
        PinkBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UbMenu.setBackground(new java.awt.Color(255, 204, 204));
        UbMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Text.setText("Blood Donation");
        Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        UbMenu.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 28));
        UbMenu.add(MenuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 30, 30));

        PinkBackground.add(UbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 50));

        BookingText.setFont(new java.awt.Font("Book Antiqua", 1, 28)); // NOI18N
        BookingText.setText("Donation Process");
        PinkBackground.add(BookingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

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

        BackLabel.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        BackLabel.setText("< Back");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackLabelMousePressed(evt);
            }
        });
        PinkBackground.add(BackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));
        PinkBackground.add(DonationPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PinkBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMousePressed
        // TODO add your handling code here:
        dispose();
        Homepage H = new Homepage();
        H.setVisible(true);
    }//GEN-LAST:event_BackLabelMousePressed

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
            java.util.logging.Logger.getLogger(DonProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JLabel BatteryIcon;
    private javax.swing.JLabel BookingText;
    private javax.swing.JLabel DonationPicture;
    private javax.swing.JLabel MenuIcon;
    private javax.swing.JLabel NetworkIcon;
    private javax.swing.JPanel PhoneInfoPanel;
    private javax.swing.JPanel PinkBackground;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel TimeIcon;
    private javax.swing.JPanel UbMenu;
    private javax.swing.JLabel WiFiIcon;
    // End of variables declaration//GEN-END:variables
}