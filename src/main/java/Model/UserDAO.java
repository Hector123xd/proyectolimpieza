
package Model;

import View.Signup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class UserDAO {
    
    MySQLConnection con = new MySQLConnection();
    
    public boolean validateUser(User user){
        
        boolean result = false;
        
        final String query = "SELECT * FROM userdata WHERE user_name = ? AND user_password = ?;";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, user.getName());
            pst.setString(2, user.getPassword());

            try(ResultSet rs = pst.executeQuery()){
                
                if(rs.next()){
                    
                    int id = rs.getInt("user_id");
                    String name = rs.getString("user_name");
                    String password = rs.getString("user_password");
                    getLoginInformation(id);
                    
                    result = true;
                }else{
                    JOptionPane.showMessageDialog(null, "wrong username or password please try again");
                }
                
            }catch(SQLException s){
                System.out.println(s);
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return result;
    }
    
    public int createUser(User user){
        
        final String query = "INSERT INTO userdata (user_name,user_password) VALUES (?,?);";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, user.getName());
            pst.setString(2,user.getPassword());
            
            int result = pst.executeUpdate();
            if(result > 0){
                return 1;
            }else{
                return 0;
            }
            
        }catch(SQLException s){
            System.out.println(s);
            return 0;
        }
        
    }
    
    public void getLoginInformation(int id){
        
        final String query ="INSERT INTO login (user_id) VALUES (?);";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setInt(1, id);
            
            int result = pst.executeUpdate();
            
            if(result > 0){
                
            }else{
                
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        
    }
    
}
