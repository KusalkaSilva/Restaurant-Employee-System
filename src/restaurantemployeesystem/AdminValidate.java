/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantemployeesystem;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdminValidate extends javax.swing.JFrame {

    /**
     * Creates new form AdminValidate
     */
    public AdminValidate() {
        initComponents();
        
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);
        btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        txtUserName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_icon = new javax.swing.JLabel();
        lblAdminValidation = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usericon.png"))); // NOI18N
        getContentPane().add(user_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        lblAdminValidation.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        lblAdminValidation.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminValidation.setText("Admin Validation");
        getContentPane().add(lblAdminValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        lblUserName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name :");
        getContentPane().add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        btnOK.setBackground(new java.awt.Color(204, 204, 204));
        btnOK.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        txtUserName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 190, 30));

        txtPassword.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 30));

        lblPassword.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password :");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brown.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
      
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
       if(txtUserName.getText().length()<1 && txtPassword.getText().length()<1)
        {
            JOptionPane.showMessageDialog(null, "Fill up the fields");
        }
        else if(txtUserName.getText().length()<1)
        {
            JOptionPane.showMessageDialog(null, "Enter Username");
        }
        else if(txtPassword.getText().length()<1)
        {
            JOptionPane.showMessageDialog(null, "Enter Password");
        }
        else
        {
            Database db = new Database();
            db.getDatabaseConnection();
            
            adminvalidate(txtUserName.getText(), txtPassword.getText());
            
            
            db.closeDatabaseConnection();
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SignUp signup = new SignUp();
        signup.setVisible(true);
        signup.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AdminValidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminValidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminValidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminValidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminValidate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblAdminValidation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables
 
    
    
    private void adminvalidate(String UserName, String Password) {
        try
        {
            PreparedStatement ps = Database.con.prepareStatement
        ("SELECT UserType = 'Administrator' FROM login WHERE Username = '"+UserName+"' AND Password = '"+Password+"'");
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                signup(txtUserName.getText(), txtPassword.getText());
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Login");
            }
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
                    
        }
        
        
    }

    private void signup(String Username, String Password) {
        
        try
        {
            
            PreparedStatement ps1 = Database.con.prepareStatement("INSERT INTO login(UserName, Password, UserType) VALUES(?,?,?)");
            ps1.setString(1,SignUp.txtsUserName.getText());
            ps1.setString(2,SignUp.txtsPassword.getText());
            ps1.setString(3,SignUp.comboUserType.getSelectedItem().toString());
            
            
            ps1.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Sign Up Successful");
            
            Registration reg = new Registration();
            reg.setVisible(true);
            reg.setLocationRelativeTo(null);
            this.dispose();
           
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
                    
        }
        
        
    }
}
