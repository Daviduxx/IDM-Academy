package com.corso.employee;


import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Iterator; 
 


import com.corso.employee.bean.Employee;

public class EmployeeTest {

	   private static SessionFactory factory; 
	   
	   public static void main(String[] args) {
	      
	      try {
	         factory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      
	      EmployeeTest ME = new EmployeeTest();

	      /* Add few employee records in database */
	      Integer empID1 = ME.addEmployee("Super", "Girl", 3000);
	    //  Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
	    //  Integer empID3 = ME.addEmployee("John", "Paul", 10000);

	      /* List down all the employees */
	    //  ME.listEmployees();

	      /* Update employee's records */
//	      ME.updateEmployee(empID1, 5000);

	      /* Delete an employee from the database */
//	      ME.deleteEmployee(empID2);

	      /* List down new list of the employees */
//	      ME.listEmployees();
	      
	      
	    //  Employee e = findEmployee(1000); 

	      
	   }
	   
	   /* Method to CREATE an employee in the database */
	   public Integer addEmployee(String fname, String lname, int salary){
		  Employee employee = null; 
          Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      
	      try {
	         tx = session.beginTransaction();
	         employee = new Employee(fname, lname, salary);
	         
	        
	         session.persist(employee);
	         

	        // session.update(employee); 
	         
	         
	         tx.commit();
	         
	        
	         
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      
	      
	      return employeeID;
	   }
	   
	   /* Method to  READ all the employees */
	   public void listEmployees( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
	            Employee employee = (Employee) iterator.next(); 
	            System.out.print("First Name: " + employee.getFirstName()); 
	            System.out.print("  Last Name: " + employee.getLastName()); 
	            System.out.println("  Salary: " + employee.getSalary()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   /* Method to UPDATE salary for an employee */
	   public void updateEmployee(Integer EmployeeID, int salary ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
	         employee.setSalary( salary );
			 session.update(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   /* Method to DELETE an employee from the records */
	   public void deleteEmployee(Integer EmployeeID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
	         session.delete(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   /* Method to DELETE an employee from the records */
	   public static Employee findEmployee(Integer EmployeeID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Employee employee = null ;
	      try {
	         tx = session.beginTransaction();
	         
	         
	         
	         employee= (Employee)session.load(Employee.class, EmployeeID); 
	         
		     System.out.println(employee.getId());
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employee; 
	   }
	   
	   
	}