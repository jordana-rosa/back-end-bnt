package com.bazarnatela.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazarnatela.model.Usuario;
import com.bazarnatela.service.UsuarioService;

@RestController 
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;
    UsuarioController (UsuarioService service) {
        this.service = service;


    }
    @GetMapping() 
    public List<Usuario> getLUsuarios (){
      
        return service.getLUsuarios();
    }

    @PostMapping()
    public Usuario saveUsuario (@RequestBody Usuario usuario){
        return service.saveUsuario(usuario);
    }

    @DeleteMapping("/{idInteger}")
    public void delete (@PathVariable ("idInteger") Integer idInteger){
        service.delete(idInteger); 

    }

}
