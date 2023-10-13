package com.idm.casa;

public class CreatorCampagna extends Creator{
	
	public static Casa getCasa() {
		
		Giardino g = new Giardino(3);
		return new CasaCampagna(100,"via rossi 1", 200000, g);
	}
	
	

}
