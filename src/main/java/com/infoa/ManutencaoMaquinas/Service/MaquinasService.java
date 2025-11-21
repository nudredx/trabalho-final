package com.infoa.ManutencaoMaquinas.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Maquinas;
import com.infoa.ManutencaoMaquinas.Repository.MaquinasRepository;

@Service
public class MaquinasService {

    private final MaquinasRepository repository;

    public MaquinasService(MaquinasRepository repository) {
        this.repository = repository;
    }

    public List<Maquinas> findAll() {
        return repository.findAll();
    }

    public Maquinas findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Maquinas save(Maquinas maquinas) {
        return repository.save(maquinas);
    }

    public Maquinas update(Integer id, Maquinas maquinas) {
        maquinas.setId(id);
        return repository.save(maquinas);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
