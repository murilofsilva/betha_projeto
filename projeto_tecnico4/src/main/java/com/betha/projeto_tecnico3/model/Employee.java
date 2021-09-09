package com.betha.projeto_tecnico3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Usuario")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String nome;
    @Column(nullable = false, updatable = false)
    private String cpf;
    @Column(nullable = false, updatable = false)
    private String senha;
    @Column(nullable = false, updatable = false)
    private String endereco_principal;

    public Employee(Long id, String nome, String cpf, String senha, String endereco_principal) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco_principal = endereco_principal;
    }

    public Employee(){
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco_principal() {
        return endereco_principal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco_principal(String endereco_principal) {
        this.endereco_principal = endereco_principal;
    }
}
