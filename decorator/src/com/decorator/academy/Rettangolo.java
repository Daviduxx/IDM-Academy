package com.decorator.academy;

public class Rettangolo extends Figura{
	
	 double base;
	 double altezza;
	
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}



	@Override
	public double calcolaArea() {
		double area = (this.base * this.altezza);
		return area;
	}



	@Override
	public double prezzo() {
		// TODO Auto-generated method stub
		return calcolaArea();
	}



	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
	
}
