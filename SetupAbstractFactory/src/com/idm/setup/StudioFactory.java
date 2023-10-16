package com.idm.setup;

public class StudioFactory implements Setup{

	@Override
	public Arredo costruisciScrivania() {
		// TODO Auto-generated method stub
		return new ScrivaniaStudio("nero", 8876, 469);
	}

	@Override
	public Arredo costruisciSedia() {
		// TODO Auto-generated method stub
		return new SediaStudio("nero", 7656, 231);
	}

	@Override
	public Arredo costruisciLampada() {
		// TODO Auto-generated method stub
		return new LampadaStudio("grigio", 2213, 34);
	}
	
	

}
