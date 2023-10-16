package com.idm.casa;

public abstract class Casa {
	
	private int prezzo;
	private String indirizzo;
	private int mQuadrati;
	
	
	public Casa(int prezzo, String indirizzo, int mQuadrati) {
		this.prezzo = prezzo;
		this.indirizzo = indirizzo;
		this.mQuadrati = mQuadrati;
	}


	@Override
	public String toString() {
		return "Casa [prezzo=" + prezzo + ", indirizzo=" + indirizzo + ", mQuadrati=" + mQuadrati + "]";
	}
	
	

}
