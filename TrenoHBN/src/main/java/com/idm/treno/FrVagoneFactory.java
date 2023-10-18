package com.idm.treno;

import com.idm.fr.FRCargo;
import com.idm.fr.FRLocomotiva;
import com.idm.fr.FRPasseggeri;
import com.idm.fr.FRRistorante;

public class FrVagoneFactory implements VagoneFactory{

	@Override
	public Vagone costruisciLocomotiva() {
		return new FRLocomotiva(4,50,400, 20000);
	}

	@Override
	public Vagone costruisciPasseggeri() {
		return new FRPasseggeri(90,35,220,"rosso");
	}

	@Override
	public Vagone costruisciRistorante() {
		return new FRRistorante(30,30,250,"rosso");
	}

	@Override
	public Vagone costruisciCargo() {
		return new FRCargo(0,50,500);
	}

	@Override
	public String impostaMarca() {
		return "Freccia Rossa";
	}

}
