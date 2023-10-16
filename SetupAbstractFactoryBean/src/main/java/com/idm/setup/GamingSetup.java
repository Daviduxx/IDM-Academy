package com.idm.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gaming")
public class GamingSetup {
	
	private Arredo scrivania;
	private Arredo sedia;
	private Arredo lampada;
	
	

	public GamingSetup(Arredo scrivania, Arredo sedia, Arredo lampada) {
		this.scrivania = scrivania;
		this.sedia = sedia;
		this.lampada = lampada;
	}



	@Override
	public String toString() {
		return "SetupImpl [scrivania=" + scrivania + ", sedia=" + sedia + ", lampada=" + lampada + "]";
	}

}
