package com.rhn.mitiendita.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.rhn.mitiendita.dto.productosdto.RequestProductoDTO;
import com.rhn.mitiendita.dto.productosdto.ResponseProductoDTO;
import com.rhn.mitiendita.services.ProductoService;

@RestController
@RequestMapping("/api/producto")    
public class ProductoController {

    private static Logger log = LoggerFactory.getLogger(ProductoController.class);

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }


    @PostMapping("/crear")
    public ResponseEntity<ResponseProductoDTO> crearProducto(@RequestBody RequestProductoDTO request){
        log.debug("Ejecutando peticion de creacion de producto");
        return Optional.ofNullable(productoService.crearProducto(request))
        .map(ResponseEntity.badRequest()::body)
        .orElseGet(()-> ResponseEntity.status(HttpStatus.CREATED).build());
    }

    @PostMapping("/obtenerTodos")
    public ResponseEntity<ResponseProductoDTO> insertaPrueba(){
        return ResponseEntity.ok(productoService.obtenerTodos());
    }


}
