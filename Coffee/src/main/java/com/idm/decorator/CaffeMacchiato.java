package com.idm.decorator;

import com.idm.bean.Caffe;

public class CaffeMacchiato extends CaffeDecorator {
	
	private boolean macchiato;
	
	public CaffeMacchiato(Caffe caffe) {
		super(caffe);
		this.macchiato = true;
	}

	@Override
	protected double personalizzazione() {
		return 0.50;
	}

	@Override
	protected String descrizione() {
		return "macchiato";
	}

	@Override
	public String toString() {
		return "CaffeMacchiato [macchiato=" + macchiato + ", getPrezzo()=" + getPrezzo() + ", getDescrizione()="
				+ getDescrizione() + "]";
	}

	
	
	

}
