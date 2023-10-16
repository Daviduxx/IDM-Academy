package com.idm.exception;

public class VagoniIncompatibili extends TrenoException {
	
	private int vagone1;
	private int vagone2;
	
	
	public VagoniIncompatibili(String message, String sigla, int vagone1, int vagone2) {
		super(message, sigla);
		this.vagone1 = vagone1;
		this.vagone2 = vagone2;
	}


	public int getVagone1() {
		return vagone1;
	}


	public int getVagone2() {
		return vagone2;
	}



}
