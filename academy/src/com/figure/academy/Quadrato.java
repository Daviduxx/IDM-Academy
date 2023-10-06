package com.figure.academy;

public class Quadrato extends Rettangolo implements IPoligono{
	
	public Quadrato(double base, double altezza) {
		super(base, altezza); 
	}
	

	@Override
	public double calcolaPerimetro() {
		double perimetro = base * 4;
		return perimetro;
	}

}
