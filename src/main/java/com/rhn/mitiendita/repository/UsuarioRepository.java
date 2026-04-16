package com.rhn.mitiendita.repository;

import org.dizitart.no2.Nitrite;
import static org.dizitart.no2.filters.FluentFilter.where;
import org.springframework.stereotype.Repository;

import com.rhn.mitiendita.entities.Usuario;

@Repository
public class UsuarioRepository extends AbstractNistriteRepository<Usuario>{

    public UsuarioRepository(Nitrite bd) {
        super(bd, Usuario.class);
    }

    public Usuario usuarioLogin(String username,String password){
        return repository.find(where("nombreusuario").eq(username).and(where("password").eq(password))).firstOrNull();
    }


}
