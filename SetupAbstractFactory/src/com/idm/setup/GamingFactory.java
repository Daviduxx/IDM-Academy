package com.idm.setup;

public class GamingFactory implements Setup{

	@Override
	public Arredo costruisciScrivania() {
		// TODO Auto-generated method stub
		return new ScrivaniaGaming("rosso", 2234, 350);
	}

	@Override
	public Arredo costruisciSedia() {
		// TODO Auto-generated method stub
		return new SediaGaming("rosso", 3490, 120);
	}

	@Override
	public Arredo costruisciLampada() {
		// TODO Auto-generated method stub
		return new LampadaGaming("blu", 4459, 54);
	}

}
