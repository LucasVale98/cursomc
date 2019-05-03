package com.cursomc.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursomc.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
