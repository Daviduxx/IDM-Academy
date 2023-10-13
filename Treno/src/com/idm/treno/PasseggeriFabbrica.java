package com.idm.treno;

public class PasseggeriFabbrica extends Fabbrica{
	
	public static Vagone getVagone() {
		return new Passeggeri(50, 20, 100, "");
	}

}
