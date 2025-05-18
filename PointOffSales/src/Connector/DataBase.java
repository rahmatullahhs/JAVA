

package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBase {
  private Connection conect=null;
  private String url="jdbc:mysql://localhost:3306/pointoffsale";
   private String user="root";
   private String password="1234";
   private String driver="com.mysql.cj.jdbc.Driver";
   
    
 public Connection getConect(){
      try {
          Class.forName(driver);
          conect=DriverManager.getConnection(url, user, password);
          
          
          
      } catch (ClassNotFoundException |SQLException ex) {
          Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
      }
return conect;
 }
    
 
}
