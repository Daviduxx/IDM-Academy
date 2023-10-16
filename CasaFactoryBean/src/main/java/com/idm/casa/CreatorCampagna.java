package com.idm.casa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.idm.config.BeanConfig;

public class CreatorCampagna extends Creator{
	
	
	
	public static Casa getCasa(Giardino g) {
		
		CasaCampagna c = new CasaCampagna(100,"via rossi 1", 200000);
		c.setGiardino(g);
		return c;
	}

	
	
	

}
