package com.exception.idm;

public class RestaurantException extends Exception{
	
	public RestaurantException() {
		super("Attenzione! E' già presente un ristorante! Toglierne uno");
	}
	
	public RestaurantException(String msg) {
		super(msg);
	}

}
