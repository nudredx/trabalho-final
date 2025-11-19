package com.infoa.ManutencaoMaquinas.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaService service;

    public OcorrenciaController(OcorrenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ocorrencia> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Ocorrencia save(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);
    }

    @PutMapping("/{id}")
    public Ocorrencia update(@PathVariable Long id, @RequestBody Ocorrencia ocorrencia) {
        return service.update(id, ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
