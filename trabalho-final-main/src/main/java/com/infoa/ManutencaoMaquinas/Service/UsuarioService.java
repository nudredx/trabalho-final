package com.infoa.ManutencaoMaquinas.Service;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.infoa.ManutencaoMaquinas.Models.Usuario;
import com.infoa.ManutencaoMaquinas.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }
    @NonNull
    public Usuario buscarPorid(Integer id) {
        return repository.buscarPorid(id);

    }
    @NonNull
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Integer id, Usuario usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
