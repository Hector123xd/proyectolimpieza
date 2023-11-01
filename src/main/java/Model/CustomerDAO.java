
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
public class CustomerDAO {
    
    MySQLConnection con = new MySQLConnection();
    
    public int createCustomer(Customer customer){
        
        final String query = "INSERT INTO ciente (dni_customer,nombre_customer,direccion_customer,estado_customer) VALUES (?,?,?,?);";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, customer.getDni_customer());
            pst.setString(2, customer.getName_customer());
            pst.setString(3, customer.getAddress_customer());
            pst.setInt(4, customer.getStatus_customer());
            
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
    
    public List readCustomer(){
        
        List<Customer> list = new ArrayList<>();
        final String query = "SELECT * FROM cliente;";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareCall(query);
                ResultSet rs = pst.executeQuery()){
            
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId_customer(rs.getInt("id_customer"));
                customer.setDni_customer(rs.getString("dni_customer"));
                customer.setName_customer(rs.getString("nombre_customer"));
                customer.setAddress_customer(rs.getString("direccion_customer"));
                customer.setStatus_customer(rs.getInt("estado_customer"));
                list.add(customer);
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return list;
    }
    
    public int updateCustomer(Customer customer){
        
        final String query = "UPDATE cliente SET dni_customer = ?,nombre_customer = ?,direccion_customer = ?,estado_customer = ? WHERE id_customer = ?;";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setString(1, customer.getDni_customer());
            pst.setString(2, customer.getName_customer());
            pst.setString(3, customer.getAddress_customer());
            pst.setInt(4, customer.getStatus_customer());
            pst.setInt(5, customer.getId_customer());
            
            int result = pst.executeUpdate();
            if(result > 0){
                return 1;
            }else{
                return 0;
            }
            
        }catch(SQLException s){
            System.out.println(s);
            return 1;
        }
        
    }
    
    public int deleteCustomer(Customer customer){
        
        final String query = "DELETE FROM cliente WHERE id_cliente = ?;";
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setInt(1, customer.getId_customer());
            
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
    
}
