/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Ryzen
 */
public class OradorDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    
    public int GenerarOrador(Orador orador) {
        
        String sql = "INSERT INTO oradores(nombre,apellido,descripcion,javascript,react,negocios,startups,foto) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, orador.getNombre());
            ps.setString(2, orador.getApellido());
            ps.setString(3, orador.getDescripcion());
            ps.setBoolean(4, orador.getJavascript());
            ps.setBoolean(5, orador.getReact());
            ps.setBoolean(6, orador.getNegocios());
            ps.setBoolean(7, orador.getStartups());
            ps.setString(8, orador.getFoto());
            
            r = ps.executeUpdate();
            
            ps.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return r;
        
    }
    
    public List ObtenerOradores() {
        
        String sql = "SELECT * FROM oradores";
        List<Orador> lista = new ArrayList();
        
        
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            
            while(rs.next()) {
                
                Orador orador = new Orador();
                
                orador.setId(rs.getInt(1));
                orador.setNombre(rs.getString(2));
                orador.setApellido(rs.getString(3));
                orador.setDescripcion(rs.getString(4));
                orador.setJavascript(rs.getBoolean(5));
                orador.setReact(rs.getBoolean(6));
                orador.setNegocios(rs.getBoolean(7));
                orador.setStartups(rs.getBoolean(8));
                orador.setFoto(rs.getString(9));
                
                lista.add(orador);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
    public int BorrarOrador(int id){
        
        String sql = "DELETE FROM oradores WHERE id=" + id;
        
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate(sql);
            rs = ps.executeQuery(sql);
            rs.close();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return r;
        
    }
}
