package com.rhn.mitiendita.dto.logindto;

public class RequestLoginDTO {

    private String username;
    private String password;
    private String nombre;
    private String apellidop;
    private String apellidom;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidop() {
        return apellidop;
    }
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getApellidom() {
        return apellidom;
    }
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    
}
