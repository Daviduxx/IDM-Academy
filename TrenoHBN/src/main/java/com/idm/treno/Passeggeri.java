package com.idm.treno;

public class Passeggeri extends Vagone{
	
	private String colore;

	public Passeggeri(int posti, int lunghezza, int peso, String colore) {
		super(posti, lunghezza, peso);
		this.colore = colore;
	}

}
