package com.manso.cursomc.repositories;

import com.manso.cursomc.domain.Cidade;
import com.manso.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
