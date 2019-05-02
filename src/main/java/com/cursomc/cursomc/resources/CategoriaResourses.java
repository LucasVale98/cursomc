package com.cursomc.cursomc.resources;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourses {
	 
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	private ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = categoriaService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
