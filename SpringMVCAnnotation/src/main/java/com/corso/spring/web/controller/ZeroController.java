package com.corso.spring.web.controller;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zero")
public class ZeroController {
	
	@RequestMapping( 
			path={"/get.do", "/post.html"},
			method= {RequestMethod.GET, RequestMethod.POST}
	)
	public String home() {
		
		System.out.println("passaggio dal controller metodo home"); 
		
		return "esempio"; 
	}

	@GetMapping("get2.html")
	//@PostMapping("post2.html")
	public String home2() {
		
		System.out.println("passaggio dal controller metodo home 2"); 
		
		return "esempio"; 
	}

	@GetMapping("get3.html")
	//@PostMapping("post2.html")
	public String home3( @WebParam (name="name") String nome ) {
		System.out.println("passaggio dal controller metodo home 2: " + nome); 
		return "esempio"; 
	}
	
	@GetMapping("get4.html")
	//@PostMapping("post2.html")
	public ModelAndView home4( @WebParam String nome, HttpServletRequest request, HttpSession session) {
		System.out.println("passaggio dal controller metodo home 2: " + nome);
		
		ModelAndView mw = new ModelAndView(); 
		
		mw.addObject(nome, "nome");
		mw.setViewName("esempio2");
		
		//mw.addAttribute("nome",nome); 
		
		session.setAttribute("prova", "Prova della Sessione");
		request.setAttribute("prova2", "Prova della Request");
		
		return mw; 
	}
	
	@GetMapping("/get/{id}")
	
	public String getEmployeesById(@PathVariable String id) {
	    return "ID: " + id;
	}
	
}
