package com.rhn.mitiendita.dto.logindto;

import com.rhn.mitiendita.entities.Usuario;

public class ResponseLoginDTO {

    private String username;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private boolean admin;

    public ResponseLoginDTO(){}

    public ResponseLoginDTO(Usuario usuario){
        this.username = usuario.getNombreusuario();
        this.nombre = usuario.getNombre();
        this.apellidop = usuario.getApellidop();
        this.apellidom = usuario.getApellidom();
        this.admin = usuario.isAdmin();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    


}
