package com.manso.cursomc.services;

import com.manso.cursomc.domain.Categoria;
import com.manso.cursomc.domain.Cliente;
import com.manso.cursomc.exception.ObjectNotFoundException;
import com.manso.cursomc.repositories.CategoriaRepository;
import com.manso.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()
        ));
    }

}
