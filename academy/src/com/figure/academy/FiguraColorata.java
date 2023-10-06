package com.figure.academy;

public class FiguraColorata extends Figura{
	
	private Figura figura;  
    private Colore colore;
 
    
	public FiguraColorata(Figura figura, Colore colore) {
		super();
		this.figura = figura;
		this.colore = colore;
	}

	@Override
	public double calcolaArea() {
		return figura.calcolaArea();
	} 


}
