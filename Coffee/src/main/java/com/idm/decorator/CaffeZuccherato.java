package com.idm.decorator;

import com.idm.bean.Caffe;

public class CaffeZuccherato extends CaffeDecorator{

	private int zucchero;
	
	public CaffeZuccherato(Caffe caffe, int zucchero) {
		super(caffe);
		this.zucchero = zucchero;
	}

	@Override
	protected double personalizzazione() {
		if(zucchero == 0) {
			return 0;			
		}
		else if (zucchero == 1) {
			return 0.20;
		}
		else {
			return 0.40;
		}
	}

	@Override
	protected String descrizione() {
		// TODO Auto-generated method stub
		return this.zucchero + " di zucchero";
	}

	@Override
	public String toString() {
		return "CaffeZuccherato [zucchero=" + zucchero + ", getPrezzo()=" + getPrezzo() + ", getDescrizione()="
				+ getDescrizione() + "]";
	}
	
	

}
