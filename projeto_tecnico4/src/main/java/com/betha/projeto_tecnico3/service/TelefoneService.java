package com.betha.projeto_tecnico3.service;

import com.betha.projeto_tecnico3.exception.UserNotFoundException;
import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.model.Telefone;
import com.betha.projeto_tecnico3.repo.EmployeeRepo;
import com.betha.projeto_tecnico3.repo.TelefoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.UUID;

@Service
public class TelefoneService {
    private final TelefoneRepo telefoneRepo;

    @Autowired
    public TelefoneService(TelefoneRepo telefoneRepo) {
        this.telefoneRepo = telefoneRepo;
    }

    public Telefone addTelefone(Telefone telefone)
    {
        return telefoneRepo.save(telefone);
    }

    public Telefone findTelefoneById(Long id)
    {
        return telefoneRepo.findTelefoneById(id).orElseThrow(()-> new UserNotFoundException("Telefone" +
                "de id = " + id + " nao foi encontrado"));
    }
}
