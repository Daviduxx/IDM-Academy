package com.idm.casa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.idm.config.BeanConfig;

public class CreatorCitta extends Creator{
	
	public static Casa getCasa(Terrazzo t) {
		
		return new CasaCitta(180000,"via verdi 1", 80, t);
	}

}
