package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Ocorrencia;
import com.infoa.ManutencaoMaquinas.Repository.OcorrenciaRepository;

import java.util.List;

import org.springframework.lang.NonNull;

@Service
public class OcorrenciaService {

    private final OcorrenciaRepository repository;

    public OcorrenciaService(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<Ocorrencia> findAll() {
        return repository.findAll();
    }

    public Ocorrencia BuscarPorId(Integer id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Não existe essa ocorrencia"));
    }

    @NonNull
    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public Ocorrencia update(Integer id, Ocorrencia ocorrencia) {
        ocorrencia.setId(id);
        return repository.save(ocorrencia);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
