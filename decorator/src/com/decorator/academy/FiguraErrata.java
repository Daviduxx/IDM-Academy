package com.decorator.academy;

public class FiguraErrata extends FiguraDecorator{
	
	
	public FiguraErrata(Figura figura) {
		super(figura);
	}

	@Override
	protected double prezzoDecorazione() {
		return 0;
	}



}
