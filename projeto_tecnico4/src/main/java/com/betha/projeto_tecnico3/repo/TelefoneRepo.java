package com.betha.projeto_tecnico3.repo;

import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TelefoneRepo extends JpaRepository<Telefone, Long> {

    Optional<Telefone> findTelefoneById(Long id);
}
