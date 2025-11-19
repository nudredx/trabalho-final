package com.infoa.ManutencaoMaquinas.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tecnicos")
public class TecnicosController {

    @GetMapping
    public List<Tecnicos> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Tecnicos findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Tecnicos save(@RequestBody Tecnicos tecnicos) {
        return service.save(tecnicos);
    }

    @PutMapping("/{id}")
    public Tecnicos update(@PathVariable Long id, @RequestBody Tecnicos tecnicos) {
        return service.update(id, tecnicos);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

