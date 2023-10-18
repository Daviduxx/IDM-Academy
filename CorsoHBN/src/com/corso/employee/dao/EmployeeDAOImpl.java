package com.corso.employee.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.corso.employee.bean.Bean;
import com.corso.employee.bean.Employee;

public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO {
	 
	   public Integer create(Employee bean){
		   return super.create(bean);
	   }
	 
	   
	   public Integer create2(Object bean){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      Integer employeeID = null;
		      
		      try {
		         tx = session.beginTransaction();
		         
		         employeeID = (Integer) session.save(bean);
		         
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		      return employeeID;
		   }
	   
	   
	   public void update(Employee bean ){
		   super.update(bean);
	   }
	   
	   public void delete(Employee bean ){
		   //bean.setValidity(false); 
		   super.update(bean);
	   }

	@Override
	public Employee find(Integer id) {
		
		return (Employee)super.find(Employee.class,id);
	}

	@Override
	public List<Employee> findByName(String name) {
          Session session = factory.openSession();
	      Transaction tx = null;
	      List<Employee> employeeList = null; 
	      try {
	         tx = session.beginTransaction();
	         
	         String hql = "from Employee where firstName = :firstName ";
	         Query<Employee> query = (Query<Employee>) session.createQuery(hql);
	         
	         query.setParameter("firstName", name);
	         
	         
	         employeeList = query.list();
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employeeList;
	   } 
}
	
	
	
	
	   
	   

