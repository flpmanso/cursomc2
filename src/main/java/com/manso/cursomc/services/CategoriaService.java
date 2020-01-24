package com.manso.cursomc.services;

import com.manso.cursomc.domain.Categoria;
import com.manso.cursomc.repositories.CategoriaRepository;
import com.manso.cursomc.resources.CategoriaResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
