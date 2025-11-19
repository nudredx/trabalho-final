package com.infoa.ManutencaoMaquinas.Models;

import jakarta.persistence.*;

@Entity
public class Maquinas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String categoria;
    private String funcionalidade;

    public Maquinas() {}

    public Maquinas(Long id, String modelo, String categoria, String funcionalidade) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.funcionalidade = funcionalidade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getFuncionalidade() { return funcionalidade; }
    public void setFuncionalidade(String funcionalidade) { this.funcionalidade = funcionalidade; }
}

