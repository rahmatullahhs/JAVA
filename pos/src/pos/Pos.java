package pos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DataButil;

public class Pos {
 static PreparedStatement insertPs;
 static setResult rs;
    public static void main(String[] args) {

        DataButil  db=new DataButil();
        String insertSql= "Insert into Customer (Name,Cell,Email,Address,)" + "value(?,?,?,?,?)";
        
        
        
        try {
            insertPs = db.getCon().prepareStatement(insertSql);
            
             insertPs.setString(1,"Rahmat");
        insertPs.setString(2,"01338886477");
        insertPs.setString(3,"Rahmat@gmail.com");
        insertPs.setString(4,"Dhaka");
        
        insertPs.executeUpdate();
        insertPs.close();
        db.getCon().close();
        
        } catch (SQLException ex) {
            Logger.getLogger(Pos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       String selectSql="Select* from Student";
     try {
         insertPs=db.getCon().prepareStatement(insertSql);
         rs=insertPs.executeQuery();
         while (rs.next()) {             
             int  id=rs.getInt("id");
             String name=rs.getString("name");
               String cell=rs.getString("Cell");
                 String mail=rs.getString("Mail");
                   String address=rs.getString("Address");
             
         }
         
     } catch (SQLException ex) {
         Logger.getLogger(Pos.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        
        
        
        
        
        
    }

}
