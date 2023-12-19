/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Ryzen
 */
public class Usuario {
    
    int id;
    String email;
    String contraseña;
    int privilegio;
    
    
    public Usuario() {
    }

    public Usuario(int id, String email, String contraseña, int privilegio) {
        this.id = id;
        this.email = email;
        this.contraseña = contraseña;
        this.privilegio = privilegio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(int privilegio) {
        this.privilegio = privilegio;
    }
    
    
    
}
