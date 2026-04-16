package com.rhn.mitiendita.dto.productosdto;

import java.util.List;

public class ResponseProductoDTO {

    private String mensaje;

    private List<ProductoDTO> productos;

    public ResponseProductoDTO() {
    }
    public ResponseProductoDTO(String mensaje) {
        this.mensaje = mensaje;
    }
    public ResponseProductoDTO(String mensaje, List<ProductoDTO> productos) {
        this.mensaje = mensaje;
        this.productos = productos;
    }

    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public List<ProductoDTO> getProductos() {
        return productos;
    }


    public void setProductos(List<ProductoDTO> productos) {
        this.productos = productos;
    }
    


}
