package com.idm.treno;

public class RistoranteFabbrica extends Fabbrica {
	
	public static Vagone getVagone() {
		return new Ristorante(15, 35, 150, "");
	}

}
