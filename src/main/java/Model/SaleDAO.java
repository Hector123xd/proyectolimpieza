package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hecto
 */
public class SaleDAO {

    MySQLConnection con = new MySQLConnection();

    public int checkSalePuchase(Sale sale) {

        final String query = "INSERT INTO ventas (id_vendedor,id_customer,numero_venta,monto_venta) VALUES (?,?,?,?)";
        try (Connection c = con.getConnection(); PreparedStatement pst = c.prepareStatement(query)) {

            pst.setInt(1, sale.getId_seller());
            pst.setInt(2, sale.getId_customer());
            pst.setString(3, sale.getSell_number());
            pst.setDouble(4, sale.getTotal());
            int result = pst.executeUpdate();
            if (result > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException s) {
            System.out.println(s);
            return 0;
        }

    }

    public int idSale() {

        int id = 0;
        final String query = "SELECT MAX(id_venta) FROM ventas;";
        
        try(Connection c = con.getConnection();
                PreparedStatement pst = c.prepareStatement(query);
                ResultSet rs = pst.executeQuery()){
            
            if(rs.next()){
                id = rs.getInt(1);
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        
        return id;
    }

}
