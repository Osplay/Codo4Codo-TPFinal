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
import java.util.List;

/**
 *
 * @author Ryzen
 */
public class TicketDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    
    public int GenerarTicket(Ticket ticket){
        
        String sql = "INSERT INTO ticket(nombre,apellido,cantidad,categoria,total) VALUES (?,?,?,?,?)";
        
        try {
            
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, ticket.getNombre());
            ps.setString(2, ticket.getApellido());
            ps.setInt(3, ticket.getCantidad());
            ps.setInt(4, ticket.getCategoria());
            ps.setInt(5, ticket.getTotal());
            
            r = ps.executeUpdate();
            
            ps.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return r;
        
    }
    
    public List<Ticket> ObtenerTickets() {
        
        String sql = "SELECT * FROM ticket";
        
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<Ticket> lista = new ArrayList();
            
            while(rs.next()){
                Ticket t = new Ticket();
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                t.setApellido(rs.getString(3));
                t.setCantidad(rs.getInt(4));
                t.setCategoria(rs.getInt(5));
                t.setTotal(rs.getInt(6));
                
                lista.add(t);
            }
            
            return lista;
            
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
        
        
    }
    
}
