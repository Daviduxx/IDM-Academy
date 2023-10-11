package com.exception.idm;

public class TrenoException extends RuntimeException{
	
	private String sigla;
	
	public TrenoException(String message, String sigla) {
		super(message);
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}

}
