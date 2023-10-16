package com.idm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.idm.casa.Casa;
import com.idm.casa.Creator;
import com.idm.config.BeanConfig;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory context = new AnnotationConfigApplicationContext(BeanConfig.class); 
		
		Creator c = (Creator) context.getBean("creator");

//		Creator c = new Creator();
//		
		Casa campagna = c.creaCasa("campagna");
		Casa citta = c.creaCasa("citta");
		
		System.out.println(campagna);
		System.out.println(citta);

	}

}
