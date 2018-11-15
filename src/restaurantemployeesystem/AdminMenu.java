/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantemployeesystem;

import java.awt.Cursor;

/**
 *
 * @author User
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
        
        btnBilD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnOrderD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEmpReg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCashierP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderD = new javax.swing.JButton();
        btnEmpReg = new javax.swing.JButton();
        btnCashierP = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBilD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrderD.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        btnOrderD.setText("Order Details");
        getContentPane().add(btnOrderD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 50));

        btnEmpReg.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        btnEmpReg.setText("Employee Registry");
        btnEmpReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 50));

        btnCashierP.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        btnCashierP.setText("Cashier Process");
        btnCashierP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierPActionPerformed(evt);
            }
        });
        getContentPane().add(btnCashierP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 210, 50));

        btnExit.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 60, 30));

        btnBilD.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        btnBilD.setText("Bill Details");
        getContentPane().add(btnBilD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brown.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpRegActionPerformed
        EmployeeRegistry emp = new EmployeeRegistry();
        emp.setVisible(true);
        emp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEmpRegActionPerformed

    private void btnCashierPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierPActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCashierPActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilD;
    private javax.swing.JButton btnCashierP;
    private javax.swing.JButton btnEmpReg;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrderD;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
