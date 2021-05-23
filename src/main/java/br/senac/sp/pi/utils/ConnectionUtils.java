
package br.senac.sp.pi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Gabriela
 */
public class ConnectionUtils 
{
    public static Connection getConnection() throws SQLException, ClassNotFoundException
    {
        Connection connection = null;
        
        String dbURL = "jdbc:mysql://localhost:3306/";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Properties prop = new Properties();
        prop.put("user" , "root");
        prop.put("password" , "");
        prop.put("serverTimezone", "UTC");
        
        
        connection = DriverManager.getConnection(dbURL, prop);
        
        
        return connection;
        
    }
}
