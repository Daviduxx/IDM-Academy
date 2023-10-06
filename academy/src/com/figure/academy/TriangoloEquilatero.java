package com.figure.academy;

public class TriangoloEquilatero extends Triangolo implements IPoligono {

	public TriangoloEquilatero(double base, double altezza) {
		super(base, altezza);
	}
	
	@Override
	public double calcolaPerimetro() {
		double perimetro = base * 3;
		return perimetro;
	}
	

}
