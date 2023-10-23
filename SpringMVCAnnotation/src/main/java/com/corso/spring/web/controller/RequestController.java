package com.corso.spring.web.controller;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/req")
public class RequestController {
		
	@GetMapping("/check")
    // come vine passato il valore?  
	public String paeseInput(@WebParam String input, @WebParam String algoritmo){
		//String input = request.getParameter("input"); 
		System.out.println("input:" + input);
		System.out.println("algoritmo:" + algoritmo);
		return "esempioParametro"; 
	}
	
	@GetMapping("/checkRequest")
    // Spring utilizza la dipendednce Injection 	
	public String paeseInputRequest(HttpServletRequest request){
		String input = request.getParameter("input"); 
		System.out.println("input:" + input);
		return "esempioParametro"; 
	}
	
	@GetMapping("/checkRequest/{input}/{algoritmo}")
	@ResponseBody
    // Spring utilizza la dipendednce Injection 	
	public String paeseInputVariable(@PathVariable String input, @PathVariable String algoritmo){
		System.out.println("input:" + input);
		System.out.println("algoritmo:" + algoritmo);
		return "esempioParametro" + input + algoritmo; 
	}
	
	/*
	@PostMapping(path={"/checkRequestBean"}, consumes  = {MediaType.APPLICATION_JSON_VALUE})
    // Spring utilizza la dipendednce Injection 	
	public String paeseInputVariable(@RequestBody Rettangolo rettangolo){
		System.out.println("rettanolo:" + rettangolo);
		return "esempioParametro"; 
	}
	*/
	
	
}
