package com.idm.treno;

public class CargoFabbrica extends Fabbrica{
	
	public static Vagone getVagone() {
		return new Cargo(0,40,350);
	}

}
