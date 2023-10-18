package com.idm.dao;

import java.util.List;

import com.idm.treno.Treno;

public interface TrenoDAO {
	
	   public Long create(Treno bean);
	   public void update(Treno bean);
	   public void delete(Long id);
//	   
	   public Treno find(Long id);  
//	   
//	   public List<Treno> findByName(String name); 
	   
	   public List<Treno> findAll();

}
