package com.corso.employee.dao;

import java.util.List;

import com.corso.employee.bean.Employee;

public interface EmployeeDAO {
	   public Object create2(Object bean);
	   public Integer create(Employee bean);
	   public void update(Employee bean );
	   public void delete(Employee bean );
	   
	   public Employee find(Integer id);  
	   
	   public List<Employee> findByName(String name); 
	   
	   
}
