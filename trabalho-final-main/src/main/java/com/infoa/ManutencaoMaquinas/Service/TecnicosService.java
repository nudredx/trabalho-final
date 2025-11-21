package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.infoa.ManutencaoMaquinas.Models.Tecnicos;
import com.infoa.ManutencaoMaquinas.Repository.TecnicosRepository;

@Service
public class TecnicosService {

    @Autowired
    private TecnicosRepository tecnicosRepository;

    public List<Tecnicos> findAll() {
        return tecnicosRepository.findAll();
    }

    public Tecnicos findById(Integer id) {
        return tecnicosRepository.findById(id).orElse(null);
    }

    public Tecnicos save(Tecnicos tecnicos) {
        return tecnicosRepository.save(tecnicos);
    }

    public Tecnicos update(Integer id, Tecnicos tecnicos) {
        tecnicos.setId(id);
        return tecnicosRepository.save(tecnicos);
    }

    public void delete(Integer id) {
        tecnicosRepository.deleteById(id);
    }
}
