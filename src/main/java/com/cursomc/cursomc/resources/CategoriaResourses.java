package com.cursomc.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourses {
	
	@RequestMapping(method=RequestMethod.GET)
	private String listar() {
		return "Rest Esta Funcionando";
	}
}
