package com.decorator.academy;

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
	
	@Override
	public double prezzo() {
		// TODO Auto-generated method stub
		return calcolaArea();
	}



}
