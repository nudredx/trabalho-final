package com.infoa.ManutencaoMaquinas.Models;

import java.time.LocalDate;

public class Tecnico {

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String funcional;

    public Tecnico() {}

    public Tecnico(String cpf, String nome, LocalDate dataNascimento, String funcional) {
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
}
