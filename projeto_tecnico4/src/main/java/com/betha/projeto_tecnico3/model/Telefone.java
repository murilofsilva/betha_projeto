package com.betha.projeto_tecnico3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Telefone")
public class Telefone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String numero;
    @Column(nullable = false, updatable = false)
    private int id_user;

    public Telefone(Long id, String numero, int id_user) {
        this.id = id;
        this.numero = numero;
        this.id_user = id_user;
    }

    public Telefone(){

    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
