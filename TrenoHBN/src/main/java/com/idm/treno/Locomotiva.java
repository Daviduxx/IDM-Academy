package com.idm.treno;

public class Locomotiva extends Vagone{
	
	private int pesoTrainabile;

	public Locomotiva(int posti, int lunghezza, int peso, int pesoTrainabile) {
		super(posti, lunghezza, peso);
		this.pesoTrainabile = pesoTrainabile;
	}

	@Override
	public String toString() {
		return "Locomotiva [pesoTrainabile=" + pesoTrainabile + ", toString()=" + super.toString() + "]";
	}

	public int getPesoTrainabile() {
		return pesoTrainabile;
	}

	
	
	

}
