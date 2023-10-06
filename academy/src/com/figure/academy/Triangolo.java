package com.figure.academy;

public class Triangolo extends Figura{
	
	 double base;
	 double altezza;
	
	
	
	public Triangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}


	@Override
	public  double calcolaArea() {
		double area = (this.base * this.altezza) / 2;
		return area;
	}

}
