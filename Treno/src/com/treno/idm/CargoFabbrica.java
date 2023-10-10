package com.treno.idm;

public class CargoFabbrica extends Fabbrica{
	
	public static Vagone getVagone() {
		return new Cargo();
	}

}
