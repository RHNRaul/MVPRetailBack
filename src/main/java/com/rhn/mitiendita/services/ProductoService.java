package com.rhn.mitiendita.services;

import java.util.Optional;

import org.dizitart.no2.exceptions.InvalidIdException;
import org.dizitart.no2.exceptions.UniqueConstraintException;
import org.dizitart.no2.exceptions.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rhn.mitiendita.dto.productosdto.ProductoDTO;
import com.rhn.mitiendita.dto.productosdto.RequestProductoDTO;
import com.rhn.mitiendita.dto.productosdto.ResponseProductoDTO;
import com.rhn.mitiendita.entities.Producto;
import com.rhn.mitiendita.repository.ProductoRepository;

@Service
public class ProductoService {
    private static Logger log = LoggerFactory.getLogger(ProductoService.class);

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public ResponseProductoDTO crearProducto(RequestProductoDTO request){
        Producto producto = new Producto(request.getCodigobarras(), request.getCodigopersonal(), request.getNombre(), request.getCantidad(), request.getPrecio(), request.isAgregarIVA());
        try{
            repository.insert(producto);
            return null;
        }catch(ValidationException ve){
            log.error(ve.getMessage(),ve);
            return new ResponseProductoDTO("El producto no cumple con las validaciones necesarias para ser insertado en la base de datos.");
        }
        catch(InvalidIdException id){
            log.error(id.getMessage(),id);
            return new ResponseProductoDTO("El producto no cuenta con un codigo de barras para ser insertado en la base de datos.");
        }catch(UniqueConstraintException uc){
            log.error(uc.getMessage(),uc);
            if(Optional.ofNullable(repository.findById(producto.getCodigobarras())).isPresent()){
            return new ResponseProductoDTO("El producto con el codigo de barras " + producto.getCodigobarras() + " ya existe en la base de datos.");
            }else {
            return new ResponseProductoDTO("El producto con el codigo personal " + producto.getCodigopersonal() + " ya existe en la base de datos.");
            }
        }
    }

    public ResponseProductoDTO obtenerTodos(){
        return new ResponseProductoDTO("Resultados de la consulta de lista",repository.findAll().stream().map(ProductoDTO::new).toList());
    }








}
