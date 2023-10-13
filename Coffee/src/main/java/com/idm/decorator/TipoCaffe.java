package com.idm.decorator;

import com.idm.bean.Caffe;

public class TipoCaffe extends CaffeDecorator {
	
	private String tipo;
	
	public TipoCaffe(Caffe caffe, String tipo) {
		super(caffe);
		this.tipo = tipo;
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
