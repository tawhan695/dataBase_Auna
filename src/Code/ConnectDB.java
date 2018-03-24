
package Code;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectDB {

    
 public static Connection connectDB(){
  //  Connection connection=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:DBtawhan", "C##","123654");
            //jdbc:oracle:thin:@localhost:1521:DBTawhan [C## on Default schema]
            if (connection !=null) {
                System.out.println("เชื่อต่อเรียบร้อย"+connection.getSchema());
               JOptionPane.showMessageDialog(null, "เชื่อมต่อเรียบร้อย");
            }else System.out.println("not connection");
            return connection;
            
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
       return null;
    }
  
   
    public static void main(String[] args) {
        connectDB();
    }
    
   
}
