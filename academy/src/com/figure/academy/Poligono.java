package com.figure.academy;

public abstract class Poligono extends Figura implements IPoligono{
	
	 double numeroLati;
	 double lunghezzaLato;

	public Poligono(double numeroLati, double lunghezzaLato) {
		super();
		this.numeroLati = numeroLati;
		this.lunghezzaLato = lunghezzaLato;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = this.lunghezzaLato * this.numeroLati;
		return perimetro;
	}

}
