package com.figure.academy;

public class Esagono extends Poligono{
	
	public Esagono(double numeroLati, double lunghezzaLato) {
		super(numeroLati, lunghezzaLato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaArea() {
		double area = Math.pow(lunghezzaLato,2) * 2.598;
		return area;
	}

}
