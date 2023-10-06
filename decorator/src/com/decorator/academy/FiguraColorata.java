package com.decorator.academy;

public class FiguraColorata extends FiguraDecorator{
	 
    private Colore colore;
 
    
	public FiguraColorata(Figura figura, Colore colore) {
		super(figura);
		this.colore = colore;
	}


	@Override
	public String toString() {
		return "FiguraColorata [figura=" + this.getFigura() + ", colore=" + colore + "]";
	}

	@Override
	protected double prezzoDecorazione() {
		// TODO Auto-generated method stub
		return this.getFigura().calcolaArea() * 2;
	} 

	
}
