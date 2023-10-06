package com.decorator.academy;

public abstract class FiguraDecorator extends Figura {
	
	private Figura figura;

	public FiguraDecorator(Figura figura) {
		super();
		this.figura = figura;
	}  
	
	public final double calcolaArea() {
		return figura.calcolaArea();
	}

	public Figura getFigura() {
		return figura;
	}
	
	@Override
	public final double prezzo() {
		return this.getFigura().prezzo() + prezzoDecorazione();
	}

	protected abstract double prezzoDecorazione();
	
	
	
}
