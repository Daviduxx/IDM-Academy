package com.idm.treno;

public class ConcreteBuilder extends TrenoBuilder{
	
	private VagoneFactory factory;

	public ConcreteBuilder(VagoneFactory factory) { //nel costruttore, quando istanzio il builder concreto vado a dire che tipo di factory  voglio
		this.factory = factory;						// Ogni factory implementa un interfaccia, quindi è obbligata ad implementare tutti i metodi necessarti alla costruzione del treno
	}

	@Override
	protected Vagone costruisciLocomotiva() {
		return factory.costruisciLocomotiva();
	}

	@Override
	protected Vagone costruisciPasseggeri() {
		return factory.costruisciPasseggeri();
	}

	@Override
	protected Vagone costruisciRistorante() {
		return factory.costruisciRistorante();
	}

	@Override
	protected Vagone costruisciCargo() {
		return factory.costruisciCargo();
	}

	@Override
	protected String impostaMarca() {
		return factory.getClass().getSimpleName();
	}

}
