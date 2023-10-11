package com.exception.idm;

public class LocomotivaException extends Exception{
	
	public LocomotivaException() {
		super("Il primo vagone deve sempre essere una locomotiva!");
	}

}
