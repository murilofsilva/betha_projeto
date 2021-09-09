package com.betha.projeto_tecnico3.repo;

import com.betha.projeto_tecnico3.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnderecoRepo extends JpaRepository<Endereco, Long> {

    Optional<Endereco> findEnderecoById(Long id);
}
