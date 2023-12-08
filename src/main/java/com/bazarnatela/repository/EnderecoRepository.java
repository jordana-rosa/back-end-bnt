package com.bazarnatela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazarnatela.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
}
