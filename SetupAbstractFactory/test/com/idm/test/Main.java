package com.idm.test;

import com.idm.setup.Arredo;
import com.idm.setup.GamingFactory;
import com.idm.setup.Setup;
import com.idm.setup.StudioFactory;

public class Main {

	public static void main(String[] args) {
		
		String scelta = "gaming";
		
		Setup f = null;
		
		if(scelta.equals("studio"))
			f = new StudioFactory();
		if(scelta.equals("gaming"))
			f = new GamingFactory();
		
		Arredo lampada = f.costruisciLampada();
		System.out.println(lampada);
	}

}
