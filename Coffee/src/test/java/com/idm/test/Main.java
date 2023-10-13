package com.idm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.idm.bean.CaffeConcreto;


public class Main {

	public static void main(String[] args) {
		
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");  
		//context.registerShutdownHook();
		
		CaffeConcreto c = (CaffeConcreto) context.getBean("caffeConcreto");
		
		System.out.println(c);

	}

}
