package com.idm.treno;

public interface VagoneFactory {

	public Vagone costruisciLocomotiva();

	public Vagone costruisciPasseggeri();

	public Vagone costruisciRistorante();

	public Vagone costruisciCargo();

}
