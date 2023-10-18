package com.corso.employee.service;

import java.util.List;

import com.corso.employee.bean.Employee;
import com.corso.employee.dao.EmployeeDAO;
import com.corso.employee.dao.EmployeeDAOImpl;

public class EmployeeService {
	
	private EmployeeDAO dao = new EmployeeDAOImpl(); 
		
	public void crea (Employee employee) {
		Integer id = dao.create(employee); 
		System.out.println("creato l'impiegato con id: " + id);
	} 
	
	public void update (Employee employee) {
		dao.update(employee); 
		System.out.println("modificato l'impiegato con id: " + employee.getId());
	} 	
	
	public void aumentaSalario (Employee employee) {
		
		int salary = (int) (employee.getSalary()*1.1 + 0.5) ; 
		employee.setSalary(salary);
		dao.update(employee); 
		
		System.out.println("modificato l'impiegato con id: " + employee.getId());
	}

	public Employee find(int id) {
		return dao.find(id);
	} 
	

	public List<Employee> findByName(String name) {
		return dao.findByName(name);
	} 
	
}
