package com.rhn.mitiendita.repository;

import java.util.List;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.common.WriteResult;
import org.dizitart.no2.repository.ObjectRepository;

public abstract class AbstractNistriteRepository<T> {

    protected final ObjectRepository<T> repository;

    protected AbstractNistriteRepository(Nitrite db,Class<T> clase){
            repository = db.getRepository(clase);
    }
    @SuppressWarnings("unchecked")
    public WriteResult insert(T entity) {
    return repository.insert(entity); 
    }

    public WriteResult update(T entity) {
        return repository.update(entity, true); 
    }

    public List<T> findAll() {
        return repository.find().toList();
    }

}
