
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hecto
 */
public class SaleDetailsDAO {
    
    MySQLConnection con = new MySQLConnection();
    
   public Product searchProduct(Integer cod){
        
        Product product = new Product();
        final String query = "SELECT * FROM producto WHERE id_producto = ?;";
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query)){
            
            pst.setInt(1, cod);
            
            try(ResultSet rs = pst.executeQuery()){
                
                if(rs.next()){
                    
                    product.setName_product(rs.getString("nombre_producto"));
                    product.setPrice_product(rs.getInt("precio_producto"));
                    product.setStock_product(rs.getBoolean("stock_producto"));
                    
                }
                
            }catch(SQLException s){
                System.out.println(s);
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return product;
    }
   
   public Customer searchCustomer(Integer cod){
       
       Customer customer = new Customer();
       final String query = "SELECT * FROM cliente WHERE id_customer = ?;";
       try(Connection c = con.getConnection();
               PreparedStatement pst = c.prepareStatement(query)){
           
           pst.setInt(1, cod);
           
           try(ResultSet rs = pst.executeQuery()){
               
               if(rs.next()){
                   
                   customer.setName_customer(rs.getString("nombre_customer"));
                   
               }
               
           }catch(SQLException s){
               System.out.println(s);
           }
           
       }catch(SQLException s){
           System.out.println(s);
       }
       return customer;
   }
   
   public int checkDetails(SaleDetails details){
       
       final String query = "INSERT INTO detalle_venta (id_venta,id_producto,cantidad_detalle_venta,precio_total) VALUES (?,?,?,?);";
       try(Connection c = con.getConnection();
               PreparedStatement pst = c.prepareStatement(query)){
           
           pst.setInt(1, details.getId_sale());
           pst.setInt(2,details.getId_product());
           pst.setInt(3,details.getQuantity() );
           pst.setDouble(4, details.getTotal());
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
