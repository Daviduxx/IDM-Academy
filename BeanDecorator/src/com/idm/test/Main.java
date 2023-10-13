package com.idm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");  
		//context.registerShutdownHook();

	}

}
