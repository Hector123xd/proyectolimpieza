
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hecto
 */
public class SellerDAO {
    
    MySQLConnection con = new MySQLConnection();
    
    public int createSealer(Seller sealer){
        
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
        List<Seller> list = new ArrayList<>();
        final String query = "SELECT * FROM vendedor;";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query);
                ResultSet rs = pst.executeQuery()){
            
            while(rs.next()){
                Seller sealer = new Seller();
                sealer.setId_sealer(rs.getInt(1));
                sealer.setDni_sealer(rs.getString(2));
                sealer.setName_sealer(rs.getString(3));
                sealer.setNumber_sealer(rs.getString(4));
                sealer.setStatus_sealer(rs.getInt(5));
                list.add(sealer);
            }
                    
        }catch(SQLException s){
            System.out.println(s);
        }
        return list;
    }
    
    public int updateSealer(Seller sealer){
        
        final String query = "UPDATE vendedor SET dni_vendedor = ?,nombre_vendedor = ?, telefono_vendedor = ?, estado_vendedor = ? WHERE id_vendedor = ?;";
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, sealer.getDni_sealer());
            pst.setString(2, sealer.getName_sealer());
            pst.setString(3, sealer.getNumber_sealer());
            pst.setInt(4, sealer.getStatus_sealer());
            pst.setInt(5, sealer.getId_sealer());
            
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
    
    public int deleteSealer(Seller sealer){
        
        final String query = "DELETE FROM vendedor WHERE id_vendedor = ?;";
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setInt(1, sealer.getId_sealer());
            int result = pst.executeUpdate();
            if(result > 0){
                return 1;
            }
            else{
                return 0;
            }
            
        }catch(SQLException s){
            System.out.println(s);
            return 0;
        }
        
        
    }
    
}
