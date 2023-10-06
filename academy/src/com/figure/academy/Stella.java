package com.figure.academy;

public class Stella extends Figura{
	
	private int numeroPunte;
	private int raggioInterno;
	private int raggioEsterno;
	
	
	public Stella(int numeroPunte, int raggioInterno, int raggioEsterno) {
		super();
		this.numeroPunte = numeroPunte;
		this.raggioInterno = raggioInterno;
		this.raggioEsterno = raggioEsterno;
	}


	@Override
	public double calcolaArea() {
		double areaInterna = Math.PI * Math.pow(raggioInterno, 2);
		double base = (Math.PI * raggioInterno * 2) / numeroPunte;
		double areaEsterna = ((base * (raggioEsterno - raggioInterno)) / 2) * numeroPunte;
		double area = areaInterna + areaEsterna;
		return area;
	}

}
