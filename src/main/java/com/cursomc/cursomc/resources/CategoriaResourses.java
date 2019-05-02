package com.cursomc.cursomc.resources;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursomc.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourses {
	 
	@RequestMapping(method=RequestMethod.GET)
	private List<Categoria> listar() {
		Categoria categoria1 = new Categoria(1, "informatica");
		Categoria categoria2 = new Categoria(2, "Informaçao");
		
		List<Categoria> lista = new  ArrayList<>();
		lista.add(categoria1);
		lista.add(categoria2);
		return lista;
	}
}
