package com.idm.casa;

public class Creator {
	
	public Casa creaCasa(String tipo) {
		
		Casa c = null;
		
		if(tipo.equals("campagna"))
			c = CreatorCampagna.getCasa();
		if(tipo.equals("citta"))
			c = CreatorCitta.getCasa();
		return c;
	}

}
