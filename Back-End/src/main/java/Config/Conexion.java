/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ryzen
 */
public class Conexion {
    
    Connection con;
    String url = "jdbc:mysql://db4free.net:3306/codoacodoenzo";
    String user = "testeo";
    String pass = "testeotesteo";
    
    public Connection getConnection() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) { 
            System.out.println("Class name not found!");
        }
        
        return con;
    }
    
}
