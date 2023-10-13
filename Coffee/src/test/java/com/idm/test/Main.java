package com.idm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.idm.bean.Caffe;
import com.idm.bean.CaffeConcreto;
import com.idm.decorator.CaffeCorretto;
import com.idm.decorator.Caffeina;
import com.idm.decorator.TipoCaffe;
import com.idm.decorator.Variante;


public class Main {

	public static void main(String[] args) {
	
		String ordine = "corretto";
		
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");  
		//context.registerShutdownHook();
		
		Caffe c = (Caffe) context.getBean(ordine);
		
		System.out.println(c);
		
//		Caffe c1 = (Caffe) context.getBean("tipoCaffe");
//		
//		System.out.println(c1);
//		
//		Caffe c2 = (Caffe) context.getBean("corretto");
//		
//		System.out.println(c2);
//		
//		Caffe c3 = (Caffe) context.getBean("americanoCorretto");
//		
//		System.out.println(c3);

	}

}
