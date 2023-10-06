package com.figure.academy;

public class Rettangolo extends Figura implements IQuadrilatero{
	
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

}
