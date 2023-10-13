package com.idm.casa;

public class CasaCampagna extends Casa{
	
	private Giardino giardino;

	public CasaCampagna(int prezzo, String indirizzo, int mQuadrati, Giardino giardino) {
		super(prezzo, indirizzo, mQuadrati);
		this.giardino = giardino;
	}

	@Override
	public String toString() {
		return "CasaCampagna [giardino=" + giardino + ", toString()=" + super.toString() + "]";
	}
	
	

}
