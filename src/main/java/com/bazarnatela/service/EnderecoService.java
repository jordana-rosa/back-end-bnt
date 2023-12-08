package com.bazarnatela.service;
import org.springframework.stereotype.Service;
import com.bazarnatela.model.Endereco;
import com.bazarnatela.repository.EnderecoRepository;
import java.util.List;

@Service
public class EnderecoService {
    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public List<Endereco> getAllEnderecos() {
        return repository.findAll();
    }

    public Endereco saveEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    public void deleteEndereco(Long idEndereco) {
        repository.deleteById(idEndereco);
    }

    
}
