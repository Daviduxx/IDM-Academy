package com.idm.setup;

import org.springframework.stereotype.Component;

@Component
public abstract class Arredo {
	
	private String colore;
	private int codice;
	private int prezzo;
	
	
	public Arredo(String colore, int codice, int prezzo) {
		this.colore = colore;
		this.codice = codice;
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Arredo [colore=" + colore + ", codice=" + codice + ", prezzo=" + prezzo + "]";
	}
	
	

}
