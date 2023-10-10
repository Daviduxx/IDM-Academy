package com.treno.idm;

import java.util.ArrayList;
import java.util.List;

public class Treno {
	
	private List<Vagone> vagoni;
	private String struttura;

	public Treno(String struttura) throws Exception {
		this.struttura = struttura;
		
		Fabbrica f = new Fabbrica();
		
		List<Vagone> vagoni = new ArrayList<>();
		
		for ( char c : struttura.toCharArray()) {
			Vagone v = f.getVagone(c);
			vagoni.add(v);
		}
		 this.vagoni = vagoni;
	}

	@Override
	public String toString() {
		return "Treno [vagoni=" + vagoni + ", struttura=" + struttura + "]";
	}
	
	
	
	

}
