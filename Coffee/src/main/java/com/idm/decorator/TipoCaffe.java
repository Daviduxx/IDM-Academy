package com.idm.decorator;

import com.idm.bean.Caffe;

public class TipoCaffe extends CaffeDecorator {
	
	private String tipo;
	
	public TipoCaffe(Caffe caffeConcreto, String tipo) {
		super(caffeConcreto);
		this.tipo = tipo;
		System.out.println("DI usando il costruttore");
		System.out.println(this);
	}

	@Override
	protected double personalizzazione() {	
		return 0;
	}

	@Override
	protected String descrizione() {
		return this.tipo;
	}
	
	@Override
	public String toString() {
		return "TipoCaffe [getPrezzo()=" + getPrezzo() + ", getDescrizione()=" + getDescrizione() + "]";
	}
	

	
	
}
