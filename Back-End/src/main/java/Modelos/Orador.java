/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;



public class Orador {
    
    private int id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private Boolean javascript;
    private Boolean react;
    private Boolean negocios;
    private Boolean startups;
    private String foto;
    
    public Orador(){   
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    

    public Orador(int id, String nombre, String apellido, String descripcion, Boolean javascript, Boolean react, Boolean negocios, Boolean startups, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.javascript = javascript;
        this.react = react;
        this.negocios = negocios;
        this.startups = startups;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getJavascript() {
        return javascript;
    }

    public Boolean getReact() {
        return react;
    }

    public Boolean getNegocios() {
        return negocios;
    }

    public Boolean getStartups() {
        return startups;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setJavascript(Boolean javascript) {
        this.javascript = javascript;
    }

    public void setReact(Boolean react) {
        this.react = react;
    }

    public void setNegocios(Boolean negocios) {
        this.negocios = negocios;
    }

    public void setStartups(Boolean startups) {
        this.startups = startups;
    }
    
    
    
    
    
    
}
