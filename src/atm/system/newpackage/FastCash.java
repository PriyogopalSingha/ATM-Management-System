/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.system.newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PRIYOGOPAL
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }
    int myAccNum;
    public FastCash(int AccNum) {
        initComponents();
        myAccNum = AccNum;
        
        getBalance();
    }
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    int oldBalance;
    private void getBalance(){
        String Query = "select * from accountstable where AccNum = '" +myAccNum+ "'" ;
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next()){
                oldBalance = Rs.getInt(8);
                BalnLBL.setText("Rs " + oldBalance);
              }
        
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HunBTN = new javax.swing.JButton();
        FiveHunBTN = new javax.swing.JButton();
        OneThouBTN = new javax.swing.JButton();
        TenThouBTN = new javax.swing.JButton();
        FiveThouBTN = new javax.swing.JButton();
        TwoThouBTN = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BalnLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to EASY ATM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("FAST CASH");

        HunBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HunBTN.setText("Rs 100");
        HunBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HunBTNMouseClicked(evt);
            }
        });
        HunBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HunBTNActionPerformed(evt);
            }
        });

        FiveHunBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FiveHunBTN.setText("Rs 500");
        FiveHunBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiveHunBTNMouseClicked(evt);
            }
        });
        FiveHunBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveHunBTNActionPerformed(evt);
            }
        });

        OneThouBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OneThouBTN.setText("Rs 1000");
        OneThouBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneThouBTNMouseClicked(evt);
            }
        });
        OneThouBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneThouBTNActionPerformed(evt);
            }
        });

        TenThouBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TenThouBTN.setText("Rs 10000");
        TenThouBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenThouBTNMouseClicked(evt);
            }
        });
        TenThouBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenThouBTNActionPerformed(evt);
            }
        });

        FiveThouBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FiveThouBTN.setText("Rs 5000");
        FiveThouBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiveThouBTNMouseClicked(evt);
            }
        });
        FiveThouBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveThouBTNActionPerformed(evt);
            }
        });

        TwoThouBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TwoThouBTN.setText("Rs 2000");
        TwoThouBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoThouBTNMouseClicked(evt);
            }
        });
        TwoThouBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoThouBTNActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("LOG OUT");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("EASY ATM");

        BalnLBL.setBackground(new java.awt.Color(0, 0, 0));
        BalnLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BalnLBL.setText("BALANCE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HunBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FiveHunBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OneThouBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BalnLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TwoThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiveThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TwoThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FiveHunBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiveThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OneThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenThouBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)
                        .addComponent(BalnLBL)))
                .addGap(24, 24, 24)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HunBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HunBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HunBTNActionPerformed

    private void FiveHunBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveHunBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FiveHunBTNActionPerformed

    private void OneThouBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneThouBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OneThouBTNActionPerformed

    private void TenThouBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenThouBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TenThouBTNActionPerformed

    private void FiveThouBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveThouBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FiveThouBTNActionPerformed

    private void TwoThouBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoThouBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TwoThouBTNActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
         new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void HunBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HunBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 100){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 100 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
    }//GEN-LAST:event_HunBTNMouseClicked

    private void FiveHunBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiveHunBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 500){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 500 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
    }//GEN-LAST:event_FiveHunBTNMouseClicked

    private void OneThouBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneThouBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 1000){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 1000 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
    }//GEN-LAST:event_OneThouBTNMouseClicked

    private void TwoThouBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoThouBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 2000){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 2000 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
        
    }//GEN-LAST:event_TwoThouBTNMouseClicked

    private void TenThouBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenThouBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 10000){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 10000 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
    }//GEN-LAST:event_TenThouBTNMouseClicked

    private void FiveThouBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiveThouBTNMouseClicked
        // TODO add your handling code here:
        if(oldBalance < 5000){
            JOptionPane.showMessageDialog(this, "Not Enough Balance");
        }
        else{
            try{
                
            String Query = "Update accountstable set Balance = ? where AccNum = ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm", "root", "");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,oldBalance - 5000 );
            ps.setInt(2, myAccNum);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Informnation");
            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
                    
        }
    }//GEN-LAST:event_FiveThouBTNMouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalnLBL;
    private javax.swing.JButton FiveHunBTN;
    private javax.swing.JButton FiveThouBTN;
    private javax.swing.JButton HunBTN;
    private javax.swing.JButton OneThouBTN;
    private javax.swing.JButton TenThouBTN;
    private javax.swing.JButton TwoThouBTN;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}