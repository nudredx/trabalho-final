package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OcorrenciaService {

    private final OcorrenciaRepository repository;

    public OcorrenciaService(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<Ocorrencia> findAll() {
        return repository.findAll();
    }

    public Ocorrencia findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public Ocorrencia update(Long id, Ocorrencia ocorrencia) {
        ocorrencia.setId(id);
        return repository.save(ocorrencia);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
