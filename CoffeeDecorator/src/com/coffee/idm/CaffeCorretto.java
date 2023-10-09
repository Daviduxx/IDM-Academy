package com.coffee.idm;

public class CaffeCorretto extends CaffeDecorator{
	
	private boolean corretto;

	public CaffeCorretto(Caffe caffe) {
		super(caffe);
		this.corretto = true;
	}

	@Override
	protected double personalizzazione() {
		return 1;
	}

	@Override
	protected String descrizione() {
		return "corretto";
	}

	@Override
	public String toString() {
		return "CaffeCorretto [corretto=" + corretto + ", getPrezzo()=" + getPrezzo() + ", getDescrizione()="
				+ getDescrizione() + "]";
	}
	
	

}
