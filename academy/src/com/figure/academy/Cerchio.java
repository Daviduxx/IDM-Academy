package com.figure.academy;

public class Cerchio extends Figura {
	
	public double raggio;

	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		double area = Math.PI * Math.pow(raggio, 2);
		return area;
	}
	



}
