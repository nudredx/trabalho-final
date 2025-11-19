package com.infoa.ManutencaoMaquinas.Models;

import java.time.LocalDate;

public class Ocorrencia {

    private LocalDate data;
    private String gravidade;
    private String solucao;
    private int tempoParaResolucao;

    public Ocorrencia() {}

    public Ocorrencia(LocalDate data, String gravidade, String solucao, int tempoParaResolucao) {
        this.data = data;
        this.gravidade = gravidade;
        this.solucao = solucao;
        this.tempoParaResolucao = tempoParaResolucao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public int getTempoParaResolucao() {
        return tempoParaResolucao;
    }

    public void setTempoParaResolucao(int tempoParaResolucao) {
        this.tempoParaResolucao = tempoParaResolucao;
    }
}
