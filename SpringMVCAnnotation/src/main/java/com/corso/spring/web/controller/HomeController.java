package com.corso.spring.web.controller;


import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.corso.spring.dao.CategoriaDao;
import com.corso.spring.dao.impl.CategoriaDaoImpl;
import com.corso.spring.model.Categoria;
import com.corso.spring.service.CategoriaHyService;
import com.corso.spring.service.impl.CategoriaHyServiceImpl;



/*
import com.corso.spring.Beans;
import com.corso.spring.dao.CategoriaDao;
import com.corso.spring.model.Categoria;
import com.corso.spring.service.CategoriaHyService;
import com.corso.spring.service.impl.CategoriaHyServiceImpl;
*/
@Controller
@RequestMapping(path={"/","/web"})
public class HomeController {
	
	/**
	 * esempi di url:
	 * http://localhost:8080/Web01/index
	 * http://localhost:8080/Web01/home
	 * */
	
	@ResponseBody
	@RequestMapping(path={"/home", "/index"})
	public String home () {
		
		
		CategoriaHyService service = new CategoriaHyServiceImpl();
		
		Categoria c1 = service.getCategoria(); 
		
		System.out.println(c1);
		
		return "Contenuto della Home!";
	}
	
	/**
	 * esempi di url: 
	 * http://localhost:8080/CorsoSpringWeb/get?nome=Mario&cognome=Rossi
	 * oppure:
	 * http://localhost:8080/CorsoSpringWeb/post?nome=Mario&cognome=Rossi
	 * 
	 * il metodo viene eseguito solo in presenza dei due parametri con lo stesso valore. 
	 * 
	 */
	@ResponseBody
	@RequestMapping( 
			path={"/get", "/post"},
			method= {RequestMethod.GET, RequestMethod.POST},
			params = {"nome=Mario", "cognome=Rossi"}
	)
	public String provaGEToPOST () {
		return "Contenuto per la richiesta di Mario Rossi...";
	}

	/**
	 * esempi di url: 
	 * http://localhost:8080/CorsoSpringWeb/get?nome=Mario&cognome=Rossi
	 * oppure:
	 * http://localhost:8080/CorsoSpringWeb/post?nome=Mario&cognome=Rossi
	 * 
	 * il metodo viene eseguito solo in presenza dei due parametri con lo stesso valore. 
	 * 
	 */
	@ResponseBody
	@RequestMapping(
			path={"/get", "/post"},
			method= {RequestMethod.GET, RequestMethod.POST},
			params = {"nome!=Mario", "cognome!=Rossi"}
	)
	public String provaGEToPOSTNot () {
		return "Contenuto per la richiesta ...";
	}	
	
	

	
	@GetMapping(path={"/colore"})
	public String provaBeanDiUnAltroProgetto (@WebParam int r,@WebParam int g, @WebParam int b ) {
	     
		//Colore colore = new Colore(r,g,b);    
	    //System.out.println(colore);
	    
		return "colore";
	}
	
	
	@GetMapping(path={"/rgb"})
	public String provaBeanDiUnAltroProgetto (@WebParam int r,@WebParam int g, @WebParam int b, Model model ) {
	    
		com.corso.bean.Colore colore = new com.corso.bean.Colore(r,g,b);    
	    System.out.println(colore);
	    model.addAttribute("r", r);
	    model.addAttribute("g", g);
	    model.addAttribute("b", b);
	    
	    
	    model.addAttribute(colore);
	    
	    return "colore";
	}

	@GetMapping(path={"/categoria"})
	public String provaBeanDiUnAltroProgetto2 (@WebParam int id, Model model, HttpServletRequest request ) {
	   
	//	HttpSession s = request.getSession(); 
		
		// cosi (con new) manca entity man ager prchè non funziona Autowired
		CategoriaDao dao = new CategoriaDaoImpl();    
	    Categoria categoria = dao.find(id); 
		
		System.out.println(categoria);

	    Categoria c1 = com.corso.spring.test.FindCategoria.testFindCategoriaDao(id); 

	    model.addAttribute("categoria", c1);
	    
	    return "categoria";
	}
	
	
	@GetMapping("/immagine")
	public String provaImmagine () {
		return "immagine";
	}
}
