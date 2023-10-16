package com.idm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.idm.component.Prova;
import com.idm.setup.Arredo;
import com.idm.setup.GamingFactory;
import com.idm.setup.GamingSetup;
import com.idm.setup.Setup;
import com.idm.setup.SetupImpl;
import com.idm.setup.StudioFactory;

public class Main {

	public static void main(String[] args) {
		
		String scelta = "gaming";
		
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");  
		
//		Setup f = null;
//		
//		if(scelta.equals("studio"))
//			f = new StudioFactory();
//		if(scelta.equals("gaming"))
//			f = new GamingFactory();
//		
//		Arredo lampada = f.costruisciLampada();
//		System.out.println(lampada);
		
		GamingSetup setup = (GamingSetup) context.getBean("gaming");
		System.out.println(setup);

	}

}
