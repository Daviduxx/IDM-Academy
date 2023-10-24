package com.idm.builder;

public class OffRoadCar extends Car{

	public OffRoadCar(String marca, String modello, int seats, int cavalli, int cilindrata, int kw, boolean offRoad,
			boolean sport, int marce) {
		super(marca, modello, seats, cavalli, cilindrata, kw, offRoad, sport, marce);
	}

	@Override
	public String toString() {
		return "OffRoadCar [toString()=" + super.toString() + "]";
	}

	
	
	

}
