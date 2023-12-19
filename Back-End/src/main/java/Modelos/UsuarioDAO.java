/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

/**
 *
 * @author Ryzen
 */
public class UsuarioDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    public Usuario ObtenerUsuario(String email, String contraseña) {
        
        String sql = "SELECT * FROM usuarios WHERE email='"+ email +"' and contrasena='"+ contraseña +"'";
        System.out.println("SQL-> " + sql);
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            
            while(rs.next()){
                Usuario u = new Usuario();
                
                u.setId(rs.getInt(1));
                u.setEmail(rs.getString(2));
                u.setContraseña(rs.getString(3));
                u.setPrivilegio(rs.getInt(4));
                
                rs.close();
                return u;
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return null;
    }
    
    public int ActualizarUsuario(String email, String contraseñavieja, String contraseñanueva){
        
        String sql = "UPDATE usuarios SET contrasena=? WHERE email=? and contrasena=?";
        
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, contraseñanueva);
            ps.setString(2, email);
            ps.setString(3, contraseñavieja);
            
            r = ps.executeUpdate();
           
            
            
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        
        return r;
    }
    
}
