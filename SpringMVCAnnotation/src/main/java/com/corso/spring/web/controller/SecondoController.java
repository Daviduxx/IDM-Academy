package com.corso.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/j")
public class SecondoController {
	
	@RequestMapping( 
			path={"/get", "/post"},
			method= {RequestMethod.GET, RequestMethod.POST}
	)
	public String home() {
		return "esempio"; 
	}
	
}
