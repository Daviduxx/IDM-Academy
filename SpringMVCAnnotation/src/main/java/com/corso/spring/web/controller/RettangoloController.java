package com.corso.spring.web.controller;

import javax.jws.WebParam;


import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.corso.bean.Rettangolo;
import com.corso.service.RettangoloService;

@Controller
@RequestMapping("/rettangolo")
public class RettangoloController {
	
	RettangoloService service= new RettangoloService();  
	
	
	/*questo metodo non fa nulla, serve per rispettare l'MVC dal controller si apre direttamente la JSP*/
	@GetMapping("/")
	public String avvio( ) {
		System.out.println("pagina di avvio: MVC rispettato!");
		return "creaRettangolo"; 
	}
	 
	
	@GetMapping("/crea")
	public String crea(@WebParam double base, @WebParam double altezza ) {
	    service.crea(base, altezza);
	    System.out.println("creato rettangolo con Get" + base + " "+ altezza );
	    return "creato"; 
	}
	
	@GetMapping("/get")
	@ResponseBody
	public Rettangolo get( ) {
	    return service.getRettangolo(); 
	}
	
	@GetMapping("/area")
	public String calcolaArea(@WebParam double base, @WebParam double altezza, Model model) {
		
		service.crea(base, altezza);
		System.out.println("creato rettangolo in calcola Area" + base + " "+ altezza );
		
		double area = service.area();
		model.addAttribute("area", service.area());
		 System.out.println("calcolo area: " + service.area() );
		return "creaRettangolo"; 
		
	}

	@GetMapping("/aumentaBase")
	public String aumentaBase(@WebParam double base, @WebParam double altezza ) {
		return "w"; 
	}
	
	
}
