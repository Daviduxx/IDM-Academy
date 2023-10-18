package com.idm.service;

import java.util.ArrayList;
import java.util.List;

import com.idm.dao.TrenoDAOImpl;
import com.idm.treno.Treno;
import com.idm.dao.TrenoDAO;

public class TrenoService {
	
	private TrenoDAO dao = new TrenoDAOImpl(); 
	
	public void crea (Treno treno) {
		Long id = dao.create(treno); 
		System.out.println("Creato il treno con id: " + id);
	} 
	
//	public void update (Employee employee) {
//		dao.update(employee); 
//		System.out.println("modificato l'impiegato con id: " + employee.getId());
//	} 	
//	
//	public void aumentaSalario (Employee employee) {
//		
//		int salary = (int) (employee.getSalary()*1.1 + 0.5) ; 
//		employee.setSalary(salary);
//		dao.update(employee); 
//		
//		System.out.println("modificato l'impiegato con id: " + employee.getId());
//	}

	public Treno find(Long id) {
		Treno t = dao.find(id);
		if(t != null) {
			System.out.println("Trovato il treno con id: " + id);
			System.out.println(t);			
		}
		return t;
	} 
	

	public List<Treno> findAll() {
		List<Treno> lista = dao.findAll();
		System.out.println("Ho trovato i seguenti treni:");
		for ( Treno t : lista) {
			System.out.println(t);
		}
		return lista;
	} 
	
	
	public void delete (Long id) {
		dao.delete(id);
		System.out.println("Eliminato il treno con id: " + id);
	}

}
