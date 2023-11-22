package com.bazarnatela.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bazarnatela.model.Usuario;
import com.bazarnatela.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> getLUsuarios (){
      
        return repository.findAll();
    }

    public Usuario saveUsuario (Usuario usuario){
        return repository.save(usuario);

    }
    public void delete (Integer idInteger ){
        repository.deleteById(idInteger);

    } 
}
