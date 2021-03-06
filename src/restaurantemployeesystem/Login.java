package restaurantemployeesystem;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        txtUserName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        
        btnsignup.setOpaque(false);
        btnsignup.setContentAreaFilled(false);
        btnsignup.setBorderPainted(false);
        btnsignup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        btnSignIn.setOpaque(false);
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_icon = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usericon.png"))); // NOI18N
        getContentPane().add(user_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        lblSignIn.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(255, 255, 255));
        lblSignIn.setText("Sign In");
        getContentPane().add(lblSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 110, -1));

        lblPassword.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password :");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, 30));

        txtUserName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 190, 30));

        btnSignIn.setBackground(new java.awt.Color(0, 0, 0));
        btnSignIn.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, 30));

        txtPassword.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 190, 30));

        lblUserName.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name :");
        getContentPane().add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        btnsignup.setBackground(new java.awt.Color(0, 0, 0));
        btnsignup.setFont(new java.awt.Font("Bernard MT Condensed", 0, 11)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("Click here to Sign Up!");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loggflipped.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        
        
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
            
            login(txtUserName.getText(), txtPassword.getText());
            db.closeDatabaseConnection();
        }
     
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
       SignUp signup = new SignUp();
       signup.setVisible(true);
       signup.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables

    private void login(String UserName, String Password) 
    {
        try
        {
            PreparedStatement ps = Database.con.prepareStatement
        ("SELECT * FROM login WHERE Username = '"+UserName+"' AND Password = '"+Password+"' AND UserType = 'Employee'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
            }
            
           
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
                    
        }
        
        try
        {
            PreparedStatement ps = Database.con.prepareStatement
        ("SELECT * FROM login WHERE Username = '"+UserName+"' AND Password = '"+Password+"' AND UserType = 'Administrator'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                AdminMenu admenu = new AdminMenu();
                admenu.setVisible(true);
                admenu.setLocationRelativeTo(null);
                this.dispose();
            }
            
        }
        
         catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
                    
        }
        
        try
        {
            PreparedStatement ps = Database.con.prepareStatement
        ("SELECT * FROM login WHERE Username = '"+UserName+"' AND Password = '"+Password+"'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                
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
}
