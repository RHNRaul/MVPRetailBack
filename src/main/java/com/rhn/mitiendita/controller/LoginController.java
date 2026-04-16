package com.rhn.mitiendita.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhn.mitiendita.dto.logindto.RequestLoginDTO;
import com.rhn.mitiendita.dto.logindto.ResponseLoginDTO;
import com.rhn.mitiendita.services.UsuarioService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final UsuarioService usuario;

    public LoginController(UsuarioService usuario){
        this.usuario = usuario;
    }

    @PostMapping("/iniciasesion")
    public ResponseEntity<ResponseLoginDTO> hazLogin(@RequestBody RequestLoginDTO request){
       return Optional
       .ofNullable(usuario.hazLogin(request.getUsername(),request.getPassword()))
       .map(ResponseEntity::ok)
       .orElseGet(()-> ResponseEntity.notFound().build());
    }
    
    @PostMapping("/consultaUsario")
    public ResponseEntity<ResponseLoginDTO> consultaUsuario(@RequestBody RequestLoginDTO request){
        return null;
    }


}
