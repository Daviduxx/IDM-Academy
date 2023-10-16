package com.idm.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.idm.setup.Arredo;
import com.idm.setup.StudioFactory;

@Component("studio")
public class SetupImpl {
	
	private Arredo scrivania;
	private Arredo sedia;
	private Arredo lampada;
	
	@Autowired
	public SetupImpl(StudioFactory sf) {
		this.scrivania = sf.costruisciScrivania();
		this.sedia = sf.costruisciSedia();
		this.lampada = sf.costruisciLampada();
	}


	@Override
	public String toString() {
		return "SetupImpl [scrivania=" + scrivania + ", sedia=" + sedia + ", lampada=" + lampada + "]";
	}
	
	
	
	

}
