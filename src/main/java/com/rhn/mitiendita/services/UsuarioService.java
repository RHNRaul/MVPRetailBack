package com.rhn.mitiendita.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rhn.mitiendita.dto.logindto.ResponseLoginDTO;
import com.rhn.mitiendita.entities.Usuario;
import com.rhn.mitiendita.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void insert(Usuario usuario) {
        repository.insert(usuario);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public ResponseLoginDTO hazLogin(String username, String password) {
        return Optional
                .ofNullable(repository.usuarioLogin(username, password))
                .map(ResponseLoginDTO::new)
                .orElseGet(() -> null);
    }

}
