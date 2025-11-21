package com.infoa.ManutencaoMaquinas.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tecnicos")
public class Tecnicos {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String funcional;

    public Tecnicos() {}

    public Tecnicos(String cpf, String nome, LocalDate dataNascimento, String funcional, Integer id) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.funcional = funcional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    
}
