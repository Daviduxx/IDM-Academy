package com.idm.builder;

public class OffRoadBuilder extends Builder implements CarBuilder{

	private String marca;
	private String modello;
	private int seats;
	private int cavalli;
	private int cilindrata;
	private int kw;
	private boolean offRoad;
	private boolean sport;
	private int marce;
	
	public Car getCar() {
		return new OffRoadCar(marca, modello, cavalli, cilindrata, kw, seats, offRoad, sport, marce);
	}

	@Override
	public void setMarca(String marca) {
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
	

	public OffRoadBuilder() {
		// TODO Auto-generated constructor stub
	}

}
