package com.idm.treno;

public class Ristorante extends Vagone{
	
	private String colore;

	public Ristorante(int posti, int lunghezza, int peso, String colore) {
		super(posti, lunghezza, peso);
		this.colore = colore;
	}
	
	

}
