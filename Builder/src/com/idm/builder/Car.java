package com.idm.builder;

public abstract class Car {
	
	protected String marca;
	protected String modello;
	protected int seats;
	protected int cavalli;
	protected int cilindrata;
	protected int kw;
	protected boolean offRoad;
	protected boolean sport;
	protected int marce;
	
	
	
	public Car() {
	}

	public Car(String marca, String modello, int seats, int cavalli, int cilindrata, int kw, boolean offRoad,
			boolean sport, int marce) {
		this.marca = marca;
		this.modello = modello;
		this.seats = seats;
		this.cavalli = cavalli;
		this.cilindrata = cilindrata;
		this.kw = kw;
		this.offRoad = offRoad;
		this.sport = sport;
		this.marce = marce;
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + ", modello=" + modello + ", seats=" + seats + ", cavalli=" + cavalli
				+ ", cilindrata=" + cilindrata + ", kw=" + kw + ", offRoad=" + offRoad + ", sport=" + sport + ", marce="
				+ marce + "]";
	}
	
	
	
	

}
