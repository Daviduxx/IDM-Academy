package com.idm.treno;

import com.idm.tn.TNCargo;
import com.idm.tn.TNLocomotiva;
import com.idm.tn.TNPasseggeri;
import com.idm.tn.TNRistorante;

public class TnVagoneFactory implements VagoneFactory{

	@Override
	public Vagone costruisciLocomotiva() {
		return new TNLocomotiva(5,40,300);
	}

	@Override
	public Vagone costruisciPasseggeri() {
		return new TNPasseggeri(80,26,120,"verde");
	}

	@Override
	public Vagone costruisciRistorante() {
		return new TNRistorante(25,30,180,"verde");
	}

	@Override
	public Vagone costruisciCargo() {
		return new TNCargo(0,40,600);
	}

}
