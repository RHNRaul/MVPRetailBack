package com.rhn.mitiendita.dto.productosdto;

public class RequestProductoDTO {

    private String codigobarras;
    private String codigopersonal;
    private String nombre;
    private int cantidad;
    private String precio;
    private boolean agregarIVA;

    public RequestProductoDTO(){}
    public RequestProductoDTO(String codigobarras, String codigopersonal, String nombre, int cantidad, String precio,
            boolean agregarIVA) {
        this.codigobarras = codigobarras;
        this.codigopersonal = codigopersonal;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.agregarIVA = agregarIVA;
    }
    public String getCodigobarras() {
        return codigobarras;
    }
    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }
    public String getCodigopersonal() {
        return codigopersonal;
    }
    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public boolean isAgregarIVA() {
        return agregarIVA;
    }
    public void setAgregarIVA(boolean agregarIVA) {
        this.agregarIVA = agregarIVA;
    }


}
