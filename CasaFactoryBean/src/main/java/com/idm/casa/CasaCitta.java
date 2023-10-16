package com.idm.casa;

public class CasaCitta extends Casa{
	
	private Terrazzo terrazzo;

	public CasaCitta(int prezzo, String indirizzo, int mQuadrati, Terrazzo terrazzo) {
		super(prezzo, indirizzo, mQuadrati);
		this.terrazzo = terrazzo;
	}

	@Override
	public String toString() {
		return "CasaCitta [terrazzo=" + terrazzo + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
