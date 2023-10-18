package com.idm.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.idm.treno.Bean;
import com.idm.treno.Treno;

public abstract class BaseDAO {
	
	protected static SessionFactory factory; 
	 
	 static {
	 try {
       factory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) { 
       System.err.println("Failed to create sessionFactory object." + ex);
       throw new ExceptionInInitializerError(ex); 
    }
	 }
	
	   protected Long create(Bean bean){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Long trenoID = null;
	      
	      try {
	         tx = session.beginTransaction();  
	         trenoID = (Long) session.save(bean);
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return trenoID;
	   }
	   
	   
	   protected void update(Bean bean){
	      Session session = factory.openSession();
	      Transaction tx = null;   
	      try {
	         tx = session.beginTransaction();
	         session.update(bean); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   
	    protected void delete(Long id){
	      Session session = factory.openSession();
	      Transaction tx = null;   
	      try {
	    	 Bean b = session.get(com.idm.treno.Treno.class, id);
	         tx = session.beginTransaction();
	         session.delete(b); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	    
	    
	    protected Bean find(Class classe, Long id){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      Bean bean = null;      
		      try {
		         tx = session.beginTransaction();     
		         bean = (Bean) session.get(classe, id);        
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		      return bean;
		   } 
	    

}
