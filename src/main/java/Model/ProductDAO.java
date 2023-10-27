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
public class ProductDAO {

    MySQLConnection con = new MySQLConnection();

    public List listProducts() {

        List<Product> list = new ArrayList<>();
        final String query = "SELECT * FROM producto";

        try (Connection c = con.getConnection(); PreparedStatement pst = c.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                Product product = new Product();
                product.setId_product(rs.getInt("id_producto"));
                product.setName_product(rs.getString("nombre_producto"));
                product.setPrice_product(rs.getFloat("precio_producto"));
                product.setCategory_product(rs.getInt("id_categoria"));
                product.setStock_product(rs.getBoolean("stock_producto"));
                list.add(product);

            }

        } catch (SQLException s) {
            System.out.println(s);
        }
        return list;
    }

    public int updateProduct(Product product) {

        final String query = "UPDATE producto SET stock_producto = ? WHERE id_producto = ?;";
        try (Connection c = con.getConnection(); PreparedStatement pst = c.prepareStatement(query)) {

            pst.setBoolean(1, product.getStock_product());
            pst.setInt(2, product.getId_product());

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("proceso statement");
                return 1;
            } else {
                System.out.println("error");
                return 0;
            }

        } catch (SQLException s) {
            System.out.println(s);
            return 0;
        }

    }

    public List productOutOfStock() {

        List<Product> list = new ArrayList<>();
        final String query = "SELECT * FROM producto WHERE stock_producto = false;";
        try (Connection c = con.getConnection(); PreparedStatement pst = c.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                Product product = new Product();
                product.setId_product(rs.getInt("id_producto"));
                product.setName_product(rs.getString("nombre_producto"));
                product.setPrice_product(rs.getFloat("precio_producto"));
                product.setCategory_product(rs.getInt("id_categoria"));
                product.setStock_product(rs.getBoolean("stock_producto"));
                list.add(product);

            }

        } catch (SQLException s) {
            System.out.println(s);
        }
        return list;
    }

}
