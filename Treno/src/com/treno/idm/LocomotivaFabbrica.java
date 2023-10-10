package com.treno.idm;

public class LocomotivaFabbrica extends Fabbrica{
	
	public static Vagone getVagone() {
		return new Locomotiva();
	}

}
