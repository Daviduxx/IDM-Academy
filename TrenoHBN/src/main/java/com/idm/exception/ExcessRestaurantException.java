package com.idm.exception;

public class ExcessRestaurantException extends TrenoException{
	
	private int ristorante1;
	private int ristorante2;

	public ExcessRestaurantException(String message, String sigla, int ristorante1, int ristorante2) {
		super(message, sigla);
		this.ristorante1 = ristorante1;
		this.ristorante2 = ristorante2;
	}

	public int getRistorante1() {
		return ristorante1;
	}

	public int getRistorante2() {
		return ristorante2;
	}
	
	

}
