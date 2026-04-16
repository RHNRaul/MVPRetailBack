package com.rhn.mitiendita.entities;

import org.dizitart.no2.repository.annotations.Entity;
import org.dizitart.no2.repository.annotations.Id;

@Entity
public class Usuario {
     @Id
     private String nombreusuario;
     private String nombre;
     private String apellidop;
     private String apellidom;
     private boolean admin;
     private String password;

    public Usuario(){}
    
    public Usuario(String nombreusuario,String nombre,String apellidop,String apellidom,boolean admin,String password){
        this.nombreusuario = nombreusuario;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.admin = admin;
        this.password = password;
    }


     public String getNombreusuario() {
         return nombreusuario;
     }
     public void setNombreusuario(String nombreusuario) {
         this.nombreusuario = nombreusuario;
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
     public String getPassword() {
         return password;
     }
     public void setPassword(String password) {
         this.password = password;
     }


     
    
    

}
