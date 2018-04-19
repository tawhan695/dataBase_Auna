
package Code;

import java.sql.Statement;
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
           Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tawhan", "tawhan as SYSDBA","695");
           
            if (connection !=null) {
                System.out.println("เชื่อต่อเรียบร้อย "+connection.getSchema());
              
            }else System.out.println("not connection");
             
            //เพิ่มเข้าในตาราง
           /* ********************************************************************
            Statement sm=connection.createStatement();
            String sql = "INSERT INTO customer " 
                   
              sm.execute(sql);
            sm.close();
             //select*************************************************************
             ResultSet rec = sm.executeQuery(sql);
            while((rec!=null) && (rec.next())){
            System.out.print(rec.getString("CUSTOMERID"));
            }**********************************************************************
            สร้างชุดคำสั่งของ SQL ไว้สำหรับการ Update ข้อมูล

            s.execute(sql);
            *********************************************************************
            	String sql = "UPDATE customer " +
					"SET BUDGET = '5000000' " +
					" WHERE CUSTOMERID = 'C005' ";
             s.execute(sql);
            *********************************************************************
            DELEte
            String sql = "DELETE FROM customer " +
					" WHERE CUSTOMERID = 'C005' ";
             s.execute(sql);
            *********************************************************************
            */
          
           /*
          
           */
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