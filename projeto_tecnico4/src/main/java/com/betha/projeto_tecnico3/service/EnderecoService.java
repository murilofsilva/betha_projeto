package com.betha.projeto_tecnico3.service;

import com.betha.projeto_tecnico3.exception.UserNotFoundException;
import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.model.Endereco;
import com.betha.projeto_tecnico3.repo.EmployeeRepo;
import com.betha.projeto_tecnico3.repo.EnderecoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.UUID;

@Service
public class EnderecoService {
    private final EnderecoRepo enderecoRepo;

    @Autowired
    public EnderecoService(EnderecoRepo enderecoRepo) {
        this.enderecoRepo = enderecoRepo;
    }

    public Endereco addEndereco(Endereco endereco)
    {
        return enderecoRepo.save(endereco);
    }

    public Endereco findEnderecoById(Long id)
    {
        return enderecoRepo.findEnderecoById(id).orElseThrow(()-> new UserNotFoundException("Endereco" +
                "de id = " + id + " nao foi encontrado"));
    }
}
