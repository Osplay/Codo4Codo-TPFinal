/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Ryzen
 */

public class Ticket {
    
    int id;
    String Nombre;
    String Apellido;
    int Cantidad;
    int Categoria;
    int Total;
    
    public Ticket(){
    }

    public Ticket(int id, String Nombre, String Apellido, int Cantidad, int Categoria, int Total) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cantidad = Cantidad;
        this.Categoria = Categoria;
        this.Total = Total;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
    
    
}
