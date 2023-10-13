package com.idm.decorator;

import com.idm.bean.Caffe;

public class Caffeina extends CaffeDecorator{
	
	private boolean caffeina;

	public Caffeina(Caffe caffe, boolean caffeina) {
		super(caffe);
		this.caffeina = caffeina;
	}

	@Override
	protected double personalizzazione() {
		if(caffeina)
		return 0;
		else {
			return 0.20;
		}
	}

	@Override
	protected String descrizione() {
		if(caffeina)
			return "normale";
			else {
				return "decaffeinato";
			}
	}

	@Override
	public String toString() {
		return "Caffeina [caffeina=" + caffeina + ", getPrezzo()=" + getPrezzo() + ", getDescrizione()="
				+ getDescrizione() + "]";
	}

	
	
	

}
