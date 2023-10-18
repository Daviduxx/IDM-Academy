package com.idm.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.idm.treno.Treno;

public class TrenoDAOImpl extends BaseDAO implements TrenoDAO{

	  public Long create(Treno bean){
		   return super.create(bean);
	   }
  
	   
	   public void update(Treno bean ){
		   super.update(bean);
	   }
	   
	   public void delete(Long id){
		   super.delete(id);
	   }

	@Override
	public Treno find(Long id) {
		return (Treno)super.find(Treno.class,id);
	}

	@Override
	public List<Treno> findAll() {
         Session session = factory.openSession();
	      Transaction tx = null;
	      List<Treno> trenoList = null; 
	      try {
	         tx = session.beginTransaction();
	         String hql = "from " + com.idm.treno.Treno.class.getName();
	         Query<Treno> query = (Query<Treno>) session.createQuery(hql);
  
	         trenoList = query.list();
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return trenoList;
	   } 

}
