package com.idm.casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Creator {
	
	@Autowired @Qualifier("giardino") protected Giardino g;
	@Autowired @Qualifier("terrazzo") protected Terrazzo t;
	
	public Casa creaCasa(String tipo) {
		
		Casa c = null;
		
		if(tipo.equals("campagna"))
			c = CreatorCampagna.getCasa(g);
		if(tipo.equals("citta"))
			c = CreatorCitta.getCasa(t);
		return c;
	}

}
