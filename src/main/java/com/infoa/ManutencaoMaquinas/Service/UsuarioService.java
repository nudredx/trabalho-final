package com.infoa.ManutencaoMaquinas.Service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Long id, Usuario usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
