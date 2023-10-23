package com.corso.spring.web.controller;

import java.util.List;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corso.spring.model.Categoria;
import com.corso.spring.service.CategoriaService;

@Controller
@RequestMapping("categoria") 
public class CategoriaController {
	
	@Autowired
	CategoriaService service; 
		
	@GetMapping("cerca")
	public String cerca() {
		return "formCategoria";
	}
	
	@GetMapping("getCategoriaByName")
	public String getCategoriaByName(@WebParam String nome, Model model) {
		
		
		 
		List<Categoria> lista = service.getCategoriaByName("CategoriaPost"); 
		System.out.println(lista); 
		model.addAttribute("categoria", lista.get(0));
		model.addAttribute("lista", lista);
		return "viewCategoria";
	}
	
	@GetMapping("add")
	public String add(@ModelAttribute Categoria categoria, Model model) {
		
		System.out.println(categoria); 

		return "viewCategoria";
	}
	
}
