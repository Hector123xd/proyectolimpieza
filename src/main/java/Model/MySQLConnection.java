
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
    private final String url = "url"; //heres ur host
    private final String user = "user";  //heres ur user
    private final String pass = "password"; //your password    
    public Connection getConnection(){
        
        try{
            System.out.println(")");
            connection = DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException s){
            System.out.println(s);
            
        }
        return connection;
    }
    
}
