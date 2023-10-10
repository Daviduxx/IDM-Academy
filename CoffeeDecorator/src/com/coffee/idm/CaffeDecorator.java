package com.coffee.idm;

public abstract class CaffeDecorator extends Caffe {
	
	private Caffe caffe;
	
	public CaffeDecorator(Caffe caffe) {
		this.caffe = caffe;
	}

	@Override
	public final double getPrezzo() {
		return caffe.getPrezzo() + personalizzazione();
	}
	
	protected abstract double personalizzazione();

	@Override
	public final String getDescrizione() {
		return this.caffe.getDescrizione() + " " + descrizione();
	}
	
	protected abstract String descrizione();

}
