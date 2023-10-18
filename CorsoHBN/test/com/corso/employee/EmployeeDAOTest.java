package com.corso.employee;

import java.util.List;

import com.corso.employee.bean.Employee;
import com.corso.employee.dao.EmployeeDAO;
import com.corso.employee.dao.EmployeeDAOImpl;
import com.corso.employee.service.EmployeeService;

public class EmployeeDAOTest {


	   
	   public static void main(String[] args) {
	      
		   
		  EmployeeService service = new EmployeeService(); 
	      
	      List<Employee> lista = service.findByName("PIPPO");
	      
	      System.out.println(lista.size() + " " + lista); 
	      
	      service.aumentaSalario(lista.get(0));
	   }
	   
	   
	   
	   private static Employee  getEmployee() {
		      Employee e = new Employee(); 
		      e.setFirstName("Giuseppe4");
		      e.setLastName("Visconti4");
		      //e.setFirstName(null);
		      
		      e.setSalary(1000);
		      e.setId(198234792);
		      return e; 
	   }
	   
}
