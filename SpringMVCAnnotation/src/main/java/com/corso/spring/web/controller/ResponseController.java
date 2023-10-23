package com.corso.spring.web.controller;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corso.bean.Rettangolo;

@Controller
@RequestMapping("/res")
public class ResponseController {
		
	
	@GetMapping("/checkRequest")
    public String paeseInputRequest(HttpServletRequest request){
		String input = request.getParameter("input"); 
		System.out.println("input:" + input);
		
		request.setAttribute("messaggio", "Ho trovato una soluzione per " + input);
		
		return "result"; 
	}	
	
	
	@GetMapping("/check")
    public String paeseInput(@WebParam String input, @WebParam String algoritmo, Model model){
		//String input = request.getParameter("input"); 
		System.out.println("input:" + input);
		System.out.println("algoritmo:" + algoritmo);
		
		model.addAttribute("messaggio", "soluzione non trovata per l'input " + input + " con l'algoritmo " + algoritmo ); 	
		
		return "result"; 
	}
	

	
	@GetMapping("/viewRettangolo")
	public String paeseInputVariable( Model model){
				
		model.addAttribute("rettangolo", new Rettangolo(4,6));
		
		
		
		return "viewRettangolo"; 
	}
	
	
	
}
