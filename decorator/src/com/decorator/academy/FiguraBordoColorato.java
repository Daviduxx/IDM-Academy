package com.decorator.academy;

public class FiguraBordoColorato extends FiguraDecorator{
	
    private Colore colore;
 
    
	public FiguraBordoColorato(Figura figura, Colore colore) {
		super(figura);
		this.colore = colore;
	}


	@Override
	public String toString() {
		return "FiguraBordoColorato [figura=" + this.getFigura() + ", colore=" + colore + "]";
	}


	@Override
	protected double prezzoDecorazione() {
		// TODO Auto-generated method stub
		return 1.5;
	} 
	
	

}
