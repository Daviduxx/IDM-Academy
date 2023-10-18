package com.corso.employee.service;

import com.corso.employee.bean.Libro;
import com.corso.employee.dao.LibroDAO;

public class LibroService {
	private LibroDAO dao = new LibroDAO(); 
		
	public void crea (Libro libro) {
		Integer id = dao.create(libro); 
		System.out.println("creato libro con isbn: " + id);
	} 
	
	public void update (Libro libro) {
		dao.update(libro); 
		System.out.println("modificato il libro con isbn: " + libro.getIsbn());
	} 	
	
	
	public void aggiungiInserto (Libro libro, String inserto) {
		
		libro.setTitolo(libro.getTitolo()+ " inserto " + inserto );
		dao.update(libro); 
		
		System.out.println("modificato il libro con id: " + libro.getIsbn());
	} 
	
}
