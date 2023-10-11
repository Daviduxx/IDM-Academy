package com.treno.idm;

public class TnVagoneFactory  implements VagoneFactory{

	@Override
	public Vagone costruisciLocomotiva() {
		return new TNLocomotiva(50,100,300);
	}

	@Override
	public Vagone costruisciPasseggeri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vagone costruisciRistorante() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vagone costruisciCargo() {
		// TODO Auto-generated method stub
		return null;
	}

}
