package com.infoa.ManutencaoMaquinas.Controller;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/maquinas")
public class MaquinasController {

    private final MaquinasService service;

    public MaquinasController(MaquinasService service) {
        this.service = service;
    }

    @GetMapping
    public List<Maquinas> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Maquinas findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Maquinas save(@RequestBody Maquinas maquinas) {
        return service.save(maquinas);
    }

    @PutMapping("/{id}")
    public Maquinas update(@PathVariable Long id, @RequestBody Maquinas maquinas) {
        return service.update(id, maquinas);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
