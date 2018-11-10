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
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public Billing() {
     
        initComponents();
        
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);
        btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnPrint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmboPayMethod.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtBillNo = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        lblBillNo = new javax.swing.JLabel();
        lblCName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblODetails = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblODetails = new javax.swing.JTable();
        lblTax = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtSubTot = new javax.swing.JTextField();
        lblSubTot = new javax.swing.JLabel();
        lblPayMethod = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        txtTot = new javax.swing.JTextField();
        lblTot = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        cmboPayMethod = new javax.swing.JComboBox<>();
        lblBillingSystem = new javax.swing.JLabel();
        BlackStrap = new javax.swing.JLabel();
        GreyBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Billing System");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(915, 640));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDate.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 120, -1));

        txtTime.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 120, -1));

        txtBillNo.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        txtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 120, -1));

        txtCName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        getContentPane().add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 120, -1));

        lblBillNo.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblBillNo.setForeground(new java.awt.Color(255, 255, 255));
        lblBillNo.setText("Bill No:");
        getContentPane().add(lblBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        lblCName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblCName.setForeground(new java.awt.Color(255, 255, 255));
        lblCName.setText("Cashier's Name:");
        getContentPane().add(lblCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        lblTime.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time:");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        lblODetails.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblODetails.setForeground(new java.awt.Color(255, 255, 255));
        lblODetails.setText("Order Details");
        getContentPane().add(lblODetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnPrint.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        tblODetails.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        tblODetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Food Code", "Food Name", "Unit Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblODetails);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 910, 220));

        lblTax.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblTax.setForeground(new java.awt.Color(255, 255, 255));
        lblTax.setText("Tax:");
        getContentPane().add(lblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        lblDate.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        txtSubTot.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        txtSubTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 120, -1));

        lblSubTot.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblSubTot.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTot.setText("Sub Total:");
        getContentPane().add(lblSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        lblPayMethod.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblPayMethod.setForeground(new java.awt.Color(255, 255, 255));
        lblPayMethod.setText("Payment Method:");
        getContentPane().add(lblPayMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, 20));

        txtTax.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        getContentPane().add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 120, -1));

        txtTot.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        txtTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotActionPerformed(evt);
            }
        });
        getContentPane().add(txtTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 120, -1));

        lblTot.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblTot.setForeground(new java.awt.Color(255, 255, 255));
        lblTot.setText("Total:");
        getContentPane().add(lblTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, -1, -1));

        lblDiscount.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount.setText("Discount:");
        getContentPane().add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, -1, -1));

        txtDiscount.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        getContentPane().add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 120, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        cmboPayMethod.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        cmboPayMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "Debit Card" }));
        cmboPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboPayMethodActionPerformed(evt);
            }
        });
        getContentPane().add(cmboPayMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, -1, 30));

        lblBillingSystem.setFont(new java.awt.Font("Bernard MT Condensed", 0, 28)); // NOI18N
        lblBillingSystem.setForeground(new java.awt.Color(240, 240, 240));
        lblBillingSystem.setText("Billing System");
        getContentPane().add(lblBillingSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        BlackStrap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black screen.jpg"))); // NOI18N
        BlackStrap.setText("jLabel2");
        getContentPane().add(BlackStrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        GreyBackground.setForeground(new java.awt.Color(255, 255, 255));
        GreyBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brown.jpg"))); // NOI18N
        GreyBackground.setText("jLabel1");
        getContentPane().add(GreyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void cmboPayMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboPayMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboPayMethodActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillNoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtSubTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotActionPerformed

    private void txtTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlackStrap;
    private javax.swing.JLabel GreyBackground;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cmboPayMethod;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBillNo;
    private javax.swing.JLabel lblBillingSystem;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblODetails;
    private javax.swing.JLabel lblPayMethod;
    private javax.swing.JLabel lblSubTot;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTot;
    private javax.swing.JTable tblODetails;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtSubTot;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTot;
    // End of variables declaration//GEN-END:variables
}