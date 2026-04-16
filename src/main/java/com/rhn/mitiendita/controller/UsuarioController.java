package com.rhn.mitiendita.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhn.mitiendita.entities.Usuario;
import com.rhn.mitiendita.services.UsuarioService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private static Logger log = LoggerFactory.getLogger(UsuarioController.class);
  

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/prueba")
    public String getPrueba(){
        return "Hola Mundo";
    }

    @PostMapping("/Pruebadb")
    public ResponseEntity<Void> insertaPrueba(@RequestBody Usuario usuario){
        usuarioService.insert(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("Consulta")
    public ResponseEntity<List<Usuario>> consultaUsuario(){
        log.info("Consultando");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuarioService.findAll());
    }



    

}
