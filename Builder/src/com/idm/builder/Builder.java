package com.idm.builder;

public class Builder extends Car implements CarBuilder{
	
	public Car getCar() {
		return new OffRoadCar(marca, modello, cavalli, cilindrata, kw, seats, offRoad, sport, marce);
	}

	public Builder(String marca, String modello, int seats, int cavalli, int cilindrata, int kw, boolean offRoad,
			boolean sport, int marce) {
		super(marca, modello, seats, cavalli, cilindrata, kw, offRoad, sport, marce);
		// TODO Auto-generated constructor stub
	}
	
	public Builder () {}

	@Override
	public  void setMarca(String marca) {
		this.marca = marca;
		
	}

	@Override
	public void setModello(String modello) {
		this.modello = modello;
		
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
		
	}

	@Override
	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
		
	}

	@Override
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
		
	}

	@Override
	public void setKW(int kw) {
		this.kw = kw;
		
	}

	@Override
	public void setoffRoad(boolean offRoad) {
		this.offRoad = offRoad;
		
	}

	@Override
	public void setSport(boolean sport) {
		this.sport = sport;
		
	}

	@Override
	public void setMarce(int marce) {
		this.marce = marce;
		
	}
	

}
