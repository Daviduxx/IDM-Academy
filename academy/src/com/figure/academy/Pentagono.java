package com.figure.academy;

public class Pentagono extends Poligono implements IPoligono{

	public Pentagono(double numeroLati, double lunghezzaLato) {
		super(numeroLati, lunghezzaLato);
	}

	@Override
	public double calcolaArea() {
		double area = lunghezzaLato * 1.72;
		return area;
	}
	

}
