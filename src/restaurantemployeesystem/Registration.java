/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantemployeesystem;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import static restaurantemployeesystem.SignUp.txtsPassword;
import static restaurantemployeesystem.SignUp.txtsUserName;



public class Registration extends javax.swing.JFrame {
   
    
   
    public Registration() {
        initComponents();
        
       
        
        txtAddress.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtDateHired.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtEmpCode.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtFName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtLName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtSalary.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtMobileNo.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        
        comboStatus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        showDate();
        
                     
        
    }
    
    public void showDate(){
        String txtDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        txtDateHired.setText(txtDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btRegister = new javax.swing.JButton();
        txtEmpCode = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtDateHired = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        lblDateHired = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblEmployeeCode = new javax.swing.JLabel();
        EmployeeRegistration = new javax.swing.JLabel();
        BlackStrap = new javax.swing.JLabel();
        GreyBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Registry");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(844, 600));
        setMinimumSize(new java.awt.Dimension(844, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btRegister.setBackground(new java.awt.Color(204, 204, 204));
        btRegister.setFont(new java.awt.Font("Bernard MT Condensed", 0, 20)); // NOI18N
        btRegister.setText("REGISTER");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        txtEmpCode.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtEmpCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, -1));

        txtFName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 260, -1));

        txtLName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, -1));

        txtAddress.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 260, -1));

        txtMobileNo.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 260, -1));

        txtSalary.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, -1));

        txtDateHired.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        txtDateHired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateHiredActionPerformed(evt);
            }
        });
        getContentPane().add(txtDateHired, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 260, -1));

        comboStatus.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full-Time", "Part-Time", "Inactive" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });
        getContentPane().add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 120, -1));

        lblStatus.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status:");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 70, 30));

        lblDateHired.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblDateHired.setForeground(new java.awt.Color(255, 255, 255));
        lblDateHired.setText("Date Hired:");
        getContentPane().add(lblDateHired, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 30));

        lblSalary.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblSalary.setText("Monthly Salary:");
        getContentPane().add(lblSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 30));

        lblMobileNo.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblMobileNo.setForeground(new java.awt.Color(255, 255, 255));
        lblMobileNo.setText("Mobile No:");
        getContentPane().add(lblMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, 30));

        lblAddress.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, 30));

        lblLastName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Last Name:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 90, 30));

        lblFirstName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("First Name:");
        getContentPane().add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 80, 30));

        lblEmployeeCode.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblEmployeeCode.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeCode.setText("Employee Code:");
        getContentPane().add(lblEmployeeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 30));

        EmployeeRegistration.setFont(new java.awt.Font("Bernard MT Condensed", 0, 28)); // NOI18N
        EmployeeRegistration.setForeground(new java.awt.Color(240, 240, 240));
        EmployeeRegistration.setText("Employee Registration");
        getContentPane().add(EmployeeRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        BlackStrap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black screen.jpg"))); // NOI18N
        BlackStrap.setText("jLabel2");
        getContentPane().add(BlackStrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

        GreyBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brown.jpg"))); // NOI18N
        GreyBackground.setText("jLabel1");
        getContentPane().add(GreyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
       if (txtFName.getText().length()<1 || txtLName.getText().length()<1 || txtAddress.getText().length()<1 || txtMobileNo.getText().length()<1 || txtSalary.getText().length()<1){
          JOptionPane.showMessageDialog(null,"Fill up all the fields");
        }
        
        else{
            
            Database db = new Database();
            db.getDatabaseConnection();
            
            register(txtEmpCode.getText(),txtFName.getText(), txtLName.getText(), txtAddress.getText(), txtMobileNo.getText(), txtSalary.getText(), txtDateHired.getText(), comboStatus.getSelectedItem().toString());
            
            if(SignUp.comboUserType.getSelectedItem().toString()=="Administrator")
            {
                AdminMenu admenu = new AdminMenu();
                admenu.setVisible(true);
                admenu.setLocationRelativeTo(null);
                this.dispose();
            }
            
            else
            {
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
            }
            
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void txtDateHiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateHiredActionPerformed
        
    }//GEN-LAST:event_txtDateHiredActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlackStrap;
    private javax.swing.JLabel EmployeeRegistration;
    private javax.swing.JLabel GreyBackground;
    private javax.swing.JButton btRegister;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDateHired;
    private javax.swing.JLabel lblEmployeeCode;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtAddress;
    public static javax.swing.JTextField txtDateHired;
    private javax.swing.JTextField txtEmpCode;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void register(String EmpCode,String FName, String LName, String Address, String MobileNo, String Salary, String DateHired, String Status) {
       
        try{
         
            PreparedStatement ps = Database.con.prepareStatement("INSERT INTO employee_registry(Employeeid,FirstName,LastName,Address,MobileNo,Salary,DateHired,Status) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1,txtEmpCode.getText());
            ps.setString(2,txtFName.getText());
            ps.setString(3,txtLName.getText());
            ps.setString(4,txtAddress.getText());
            ps.setString(5,txtMobileNo.getText());
            ps.setString(6,txtSalary.getText());
            ps.setString(7,txtDateHired.getText());
            ps.setString(8,comboStatus.getSelectedItem().toString());
            
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registration Successful !!");
            
          
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    }
}
