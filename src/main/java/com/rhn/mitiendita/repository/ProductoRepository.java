package com.rhn.mitiendita.repository;

import org.dizitart.no2.Nitrite;
import org.springframework.stereotype.Repository;
import static org.dizitart.no2.filters.FluentFilter.where;

import com.rhn.mitiendita.entities.Producto;
@Repository
public class ProductoRepository extends AbstractNistriteRepository<Producto>{
    
    public ProductoRepository(Nitrite bd) {
        super(bd, Producto.class);
    }

    public Producto findById(String id){
        return repository.find(where("codigobarras").eq(id)).firstOrNull();
    }
}
