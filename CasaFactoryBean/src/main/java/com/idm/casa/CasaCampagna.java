package com.idm.casa;

public class CasaCampagna extends Casa{
	
	private Giardino giardino;

	public CasaCampagna(int prezzo, String indirizzo, int mQuadrati) {
		super(prezzo, indirizzo, mQuadrati);
		
	}

	@Override
	public String toString() {
		return "CasaCampagna [giardino=" + giardino + ", toString()=" + super.toString() + "]";
	}

	public void setGiardino(Giardino giardino) {
		this.giardino = giardino;
	}

	
	
	

}
