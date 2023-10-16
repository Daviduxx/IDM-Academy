package com.idm.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudioFactory implements Setup{
	
	private ScrivaniaStudio scrivania;
	private SediaStudio sedia;
	private LampadaStudio lampada;
	
	
	@Autowired
	public StudioFactory(ScrivaniaStudio scrivania, SediaStudio sedia, LampadaStudio lampada) {
		this.scrivania = scrivania;
		this.sedia = sedia;
		this.lampada = lampada;
	}

	@Override
	public Arredo costruisciScrivania() {
		// TODO Auto-generated method stub
		return scrivania;
	}

	@Override
	public Arredo costruisciSedia() {
		// TODO Auto-generated method stub
		return sedia;
	}

	@Override
	public Arredo costruisciLampada() {
		// TODO Auto-generated method stub
		return lampada;
	}
	
	

}
