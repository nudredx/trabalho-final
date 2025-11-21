package com.infoa.ManutencaoMaquinas.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Maquinas {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String modelo;
    private String categoria;
    private String funcionalidade;

    public Maquinas() {}

    public Maquinas(Integer id, String modelo, String categoria, String funcionalidade) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.funcionalidade = funcionalidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }


}

