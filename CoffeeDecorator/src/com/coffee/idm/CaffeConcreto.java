package com.coffee.idm;

public class CaffeConcreto extends Caffe {
	
	private String descrizione;
	
	public CaffeConcreto(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public double getPrezzo() {
		return 1;
	}

	@Override
	public String getDescrizione() {
		return this.descrizione;
	}

	@Override
	public String toString() {
		return "CaffeConcreto [descrizione=" + descrizione + ", getPrezzo()=" + getPrezzo() + "]";
	}
	
	

}
