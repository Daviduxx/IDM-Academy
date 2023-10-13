package com.idm.casa;

public class CreatorCitta extends Creator{
	
	public static Casa getCasa() {
		Terrazzo t = new Terrazzo(false);
		return new CasaCitta(180000,"via verdi 1", 80, t);
	}

}
