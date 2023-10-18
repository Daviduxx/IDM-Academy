package com.idm.treno;

public abstract class Vagone { // prodotto generico da creare
	
	private int id;
	private int posti;
	private int lunghezza;
	private int peso;
	
	public Vagone(int posti, int lunghezza, int peso) {
		this.posti = posti;
		this.lunghezza = lunghezza;
		this.peso = peso;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	


	public int getPosti() {
		return posti;
	}


	public void setPosti(int posti) {
		this.posti = posti;
	}


	public int getLunghezza() {
		return lunghezza;
	}


	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Vagone [posti=" + posti + ", lunghezza=" + lunghezza + ", peso=" + peso + "]";
	}
	
	
	

}
