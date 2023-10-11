package com.exception.idm;

public class VagoniIncompatibili extends TrenoException {
	
	private int vagone1;
	private int vagone2;
	
	
	public VagoniIncompatibili(String message, String sigla, int vagone1, int vagone2) {
		super(message, sigla);
		this.vagone1 = vagone1;
		this.vagone2 = vagone2;
	}
	
	

}
