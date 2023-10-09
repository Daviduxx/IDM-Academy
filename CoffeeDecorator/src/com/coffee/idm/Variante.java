package com.coffee.idm;

public class Variante extends CaffeDecorator{
	
	private EVariante variante;

	public Variante(Caffe caffe, EVariante variante) {
		super(caffe);
		this.variante = variante;
	}

	@Override
	protected double personalizzazione() {
		// TODO Auto-generated method stub
		return 1.5;
	}

	@Override
	protected String descrizione() {
		// TODO Auto-generated method stub
		return this.variante.name();
	}

	@Override
	public String toString() {
		return "Variante [variante=" + variante + ", getPrezzo()=" + getPrezzo() + ", getDescrizione()="
				+ getDescrizione() + "]";
	}
	
	

}
