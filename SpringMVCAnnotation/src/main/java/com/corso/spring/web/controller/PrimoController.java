package com.corso.spring.web.controller;



import javax.jws.WebParam;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimoController {
	
	private boolean validaDati() {
		return true; 
	}
	
	
	//@ResponseBody
	@RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, path={"/home","/"})
	@GetMapping("/home")
	@PostMapping("/home")
	public String home() {
		return "hello";  
	}
	
	


	//@ResponseBody
	@RequestMapping(method=RequestMethod.GET, path="/index")
	public String index() {
		return "hello";  
	}
	
	
	
	
	@GetMapping("/t2.html")
	@ResponseBody
	public String creaTreno( @WebParam(name = "soglia") String soglia, HttpSession session) {
		
		//String soglia = request.getParameter("soglia");
		//....
		
		return "stai cercando di costruire un treno con soglia " + soglia + " " + session.getId();  
	}
	
	
	
	@GetMapping("/treno.html")
	public String creaUnTreno( @WebParam(name = "sigla") String sigla, Model model) {
		
		//String soglia = request.getParameter("soglia");
		//....
		
		model.addAttribute("sigla", sigla); 
		
		return "treno" ;  
	}
	
	
	
	
	
	
	
	
	/**
	 * esempi di url:
	 * http://localhost:8080/CorsoSpringWeb/
	 * http://localhost:8080/CorsoSpringWeb/hello
	 * */
	
	
	
	
	
	//@ResponseBody
	//@RequestMapping(method=RequestMethod.GET, path="/")
	//@DeleteMapping
	//@PostMapping
	@GetMapping("/h") 
	public String hello() {
		return "hello";  
	}
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello2() {
		return "hello2";  
	}

	
	
	
	
	
	@GetMapping("/t")
	@ResponseBody
	public String getTreno() {
		
		
		
	
		    return "hello2";  
	}
	
	@DeleteMapping("/d")
	@ResponseBody
	public String deleteTreno() {
		return "hello2-delete";  
	}
	
	
	
	
	@PostMapping("/utente")
	@ResponseBody
	public String creaUtente() {
		// ...
		return "hello2-crea";  
	}
	@PutMapping("/utente")
	@ResponseBody
	public String modificaUtente() {
		return "hello2-update";  
	}
	@DeleteMapping("/utente")
	@ResponseBody
	public String deleteUtente() {
		return "hello2-delete";  
	}
	@GetMapping("/utente")
	@ResponseBody
	public String viewUtente() {
		return "hello2-get";  
	}
	
	
}
