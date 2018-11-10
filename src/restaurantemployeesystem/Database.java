package restaurantemployeesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    
    public static final String url = "jdbc:mysql://localhost:3308/restaurant employee system";
    public static final String user = "root";
    public static final String password = "123";
    
    static Connection con = null;
    
    
   public void getDatabaseConnection()
   {
       try
       {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection(url,user,password);
       }
       
       catch(ClassNotFoundException | SQLException ex){
           JOptionPane.showMessageDialog(null, "Database Not Connected\n" +ex, "ERROR", JOptionPane.ERROR_MESSAGE);
           
           System.exit(0);
       }
      
   }
   
   public void closeDatabaseConnection()
   {
       try
       {
           con.close(); 
       }
       
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null, "ERROR");
       }
   }
   
   
    
}
