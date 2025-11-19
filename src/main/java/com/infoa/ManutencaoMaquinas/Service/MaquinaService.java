package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaquinasService {

    private final MaquinasRepository repository;

    public MaquinasService(MaquinasRepository repository) {
        this.repository = repository;
    }

    public List<Maquinas> findAll() {
        return repository.findAll();
    }

    public Maquinas findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Maquinas save(Maquinas maquinas) {
        return repository.save(maquinas);
    }

    public Maquinas update(Long id, Maquinas maquinas) {
        maquinas.setId(id);
        return repository.save(maquinas);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
