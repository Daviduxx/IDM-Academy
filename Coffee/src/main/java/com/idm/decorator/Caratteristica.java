package com.idm.decorator;

public class Caratteristica {
	
	public String caratteristica;

	public Caratteristica(String caratteristica) {
		this.caratteristica = caratteristica;
	}

	@Override
	public String toString() {
		return "Caratteristica [caratteristica=" + caratteristica + "]";
	}


}
