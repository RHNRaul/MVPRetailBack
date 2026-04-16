package com.rhn.mitiendita.configurations;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.mapper.jackson.JacksonMapperModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rhn.mitiendita.entities.Producto;
import com.rhn.mitiendita.entities.Usuario;

import jakarta.annotation.PreDestroy;

@Configuration
public class NitriteConnector {

    private Nitrite db;
    @Bean
    Nitrite generaConexion() {
        db = Nitrite.builder()
                .loadModule(new JacksonMapperModule())
                .openOrCreate();
                 db.getRepository(Usuario.class).insert(new Usuario("demo","demo","demo","demo",true,"demo"));
                 db.getRepository(Usuario.class).insert(new Usuario("democomun","usuario","algo","si",false,"democomun"));
                 db.getRepository(Producto.class).insert(new Producto("123456789","P1", "Producto de prueba", 100, "100.0",false));
                 db.getRepository(Producto.class).insert(new Producto("987654321","P2", "Producto de prueba 2", 100, "100.0",false));
        return db;
    }

    @PreDestroy
    public void closeDatabase() {
        if (db != null && !db.isClosed()) {
            db.close();
        }
    }

    

}
