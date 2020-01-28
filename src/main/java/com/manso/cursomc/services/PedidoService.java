package com.manso.cursomc.services;

import com.manso.cursomc.domain.Categoria;
import com.manso.cursomc.domain.Pedido;
import com.manso.cursomc.exception.ObjectNotFoundException;
import com.manso.cursomc.repositories.CategoriaRepository;
import com.manso.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()
        ));
    }

}
