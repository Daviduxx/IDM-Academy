package com.treno.idm;

public class RistoranteFabbrica extends Fabbrica {
	
	public static Vagone getVagone() {
		return new Ristorante();
	}

}
