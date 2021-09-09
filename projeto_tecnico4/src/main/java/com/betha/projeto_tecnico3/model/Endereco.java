package com.betha.projeto_tecnico3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Endereco")
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String dados;
    @Column(nullable = false, updatable = false)
    private int id_user;

   public Endereco()
   {

   }

    public Endereco(Long id, String dados, int id_user) {
        this.id = id;
        this.dados = dados;
        this.id_user = id_user;
    }

    public Long getId() {
        return id;
    }

    public String getDados() {
        return dados;
    }

    public int getId_user() {
        return id_user;
    }


}
