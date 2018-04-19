
package Code;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*

     try {
                
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tawhan","sys as SYSDBA","695");
        if(cn !=null){
            System.out.println("connceted  "+cn.getSchema());
        }
        } catch (Exception e) {
        }
*/

public class ConnectDB {

    
 public static Connection connectDB(){
 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tawhan", "sys as SYSDBA","695");
           
            if (connection !=null) {
                System.out.println("เชื่อต่อเรียบร้อย "+connection.getSchema());
              
            }else System.out.println("not connection");
                     
        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }
       return null;
    }
  
  /* 

    public static void main(String[] args) {
   
connectDB();
} */
}