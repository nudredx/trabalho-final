package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TecnicosService {

    private final TecnicosRepository repository;

    public TecnicosService(TecnicosRepository repository) {
        this.repository = repository;
    }

    public List<Tecnicos> findAll() { return repository.findAll(); }

    public Tecnicos findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Tecnicos save(Tecnicos tecnicos) {
        return repository.save(tecnicos);
    }

    public Tecnicos update(Long id, Tecnicos tecnicos) {
        tecnicos.setId(id);
        return repository.save(tecnicos);
    }

    public void delete(Long id) { repository.deleteById(id); }
}
