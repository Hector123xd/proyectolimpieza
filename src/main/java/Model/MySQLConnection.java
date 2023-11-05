
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hecto
 */
public class MySQLConnection {
    
    Connection connection = null;
    private final String url = "url";
    private final String user = "user";
    private final String pass = "password";
    
    public Connection getConnection(){
        
        try{
            
            connection = DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return connection;
    }
    
}
