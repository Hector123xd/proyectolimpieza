
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
                }
                
            }catch(SQLException s){
                System.out.println(s);
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return result;
    }
    
    public void getLoginInformation(int id){
        
        final String query ="INSERT INTO login (user_id) VALUES (?);";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setInt(1, id);
            
            int result = pst.executeUpdate();
            
            if(result > 0){
                
                System.out.println("done");
            }else{
                System.out.println("error found");
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        
    }
    
}
