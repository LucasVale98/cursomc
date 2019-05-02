package com.cursomc.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	private Categoria buscar(Integer id) {
		Categoria obj = categoriaRepository.saveAll(id);
		return obj;
	}
	
	
}
