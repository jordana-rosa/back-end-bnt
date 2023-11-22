package com.bazarnatela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazarnatela.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer > { 
    
}
