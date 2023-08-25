/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }

    int MyAccNum;
    public FastCash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
       // AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
    Connection Con = null;
       PreparedStatement pst = null,pst1=null;
       ResultSet Rs = null,Rs1=null;
       Statement st = null,st1=null;
       int OldBalance;
    private void GetBalance()
    {
        String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
        try{
          Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
          st1 = Con.createStatement();
          Rs1=st1.executeQuery(Query);
          if(Rs1.next()){
             OldBalance = Rs1.getInt(9);
             BalLbl.setText("Rs"+OldBalance);
             
              }else
          {
             
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            
    }                                     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DEPOSITBTN = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        DEPOSITBTN2 = new javax.swing.JButton();
        DEPOSITBTN3 = new javax.swing.JButton();
        DEPOSITBTN4 = new javax.swing.JButton();
        DEPOSITBTN5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MYCODESPACE BANK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("FAST CASH");

        DEPOSITBTN.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN.setText("Rs 100");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });
        DEPOSITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTNActionPerformed(evt);
            }
        });

        DEPOSITBTN1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN1.setText("Rs 500");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });
        DEPOSITBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN1ActionPerformed(evt);
            }
        });

        DEPOSITBTN2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN2.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN2.setText("Rs 5000");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });
        DEPOSITBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN2ActionPerformed(evt);
            }
        });

        DEPOSITBTN3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN3.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN3.setText("Rs 2000");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });
        DEPOSITBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN3ActionPerformed(evt);
            }
        });

        DEPOSITBTN4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN4.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN4.setText("Rs 1000");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });
        DEPOSITBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN4ActionPerformed(evt);
            }
        });

        DEPOSITBTN5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        DEPOSITBTN5.setForeground(new java.awt.Color(0, 0, 204));
        DEPOSITBTN5.setText("Rs 10000");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });
        DEPOSITBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("MYCODESPACE BANK");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("LOGOUT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        BalLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 0, 255));
        BalLbl.setText("Balance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(144, 144, 144)
                                        .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DEPOSITBTN2)
                                            .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(147, 147, 147)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DEPOSITBTN3)
                                            .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTNActionPerformed

    private void DEPOSITBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN1ActionPerformed

    private void DEPOSITBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN2ActionPerformed

    private void DEPOSITBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN3ActionPerformed

    private void DEPOSITBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN4ActionPerformed

    private void DEPOSITBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN5ActionPerformed

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
         if(OldBalance <100)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-100);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
         if(OldBalance <500)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-500);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
         if(OldBalance <1000)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-1000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
         if(OldBalance <2000)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-2000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
         if(OldBalance <5000)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-5000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
        if(OldBalance <10000)
       {
                      JOptionPane.showMessageDialog(this, "No Enough Balance");

       }else
       {  
        try {
           String Query = "Update AccountTbl set Balance=? where AccNum=?";
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-10000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1)
           {
               JOptionPane.showMessageDialog(this,"Balance Updated");
               new MainMenu().setVisible(true);
               this.dispose();
               
           }else{
                JOptionPane.showMessageDialog(this," Missing Information");
           }
           }
      catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
           
       }
       }
       
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         new  MainMenu().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
    private javax.swing.JLabel BalLbl;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton DEPOSITBTN2;
    private javax.swing.JButton DEPOSITBTN3;
    private javax.swing.JButton DEPOSITBTN4;
    private javax.swing.JButton DEPOSITBTN5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
