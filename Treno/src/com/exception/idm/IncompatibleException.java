package com.exception.idm;

public class IncompatibleException extends Exception{
	
	public IncompatibleException() {
		super("Attenzione! Vagone Cargo e vagone passeggeri sono incompatibili!");
	}

}
