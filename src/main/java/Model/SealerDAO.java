
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hecto
 */
public class SealerDAO {
    
    MySQLConnection con = new MySQLConnection();
    
    public int createSealer(Sealer sealer){
        
        final String query = "ISNERT INTO vendedor (dni_vendedor,nombre_vendedor,telefono_vendedor,estado_vendedor) VALUES (?,?,?,?);";
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, sealer.getDni_sealer());
            pst.setString(2, sealer.getName_sealer());
            pst.setString(3, sealer.getNumber_sealer());
            pst.setInt(4, sealer.getStatus_sealer());
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
    
    public List readSealer(){
        List<Sealer> list = new ArrayList<>();
        
    }
    
    public int updateSealer(Sealer sealer){
        
    }
    
    public int deleteSealer(Sealer sealer){
        
    }
    
}
