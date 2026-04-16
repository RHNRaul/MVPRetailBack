package com.rhn.mitiendita.utils;

import java.util.List;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.mapper.jackson.JacksonMapperModule;
import org.springframework.stereotype.Component;

import com.rhn.mitiendita.entities.Usuario;




@Component
public class BDConnector implements BDConnectorInterface {

    private JacksonMapperModule jacksonModule = new JacksonMapperModule();
    private Nitrite db = Nitrite.builder()
    .loadModule(jacksonModule)
    .openOrCreate();


    @Override
    public void insertar(Usuario usuario) {
       db.getRepository(Usuario.class).insert(usuario);
    }

    @Override
    public List<Usuario> consultar() {
        return db.getRepository(Usuario.class).find().toList();
    }

}
