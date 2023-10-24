package com.idm.builder;

public class Director {
	
	public void getOffRoad(Builder builder) {
		builder.setMarca("JEEP");
		builder.setModello("Wrangler");
		builder.setCavalli(200);
		builder.setCilindrata(2400);
		builder.setKW(90);
		builder.setSeats(6);
		builder.setSport(false);
		builder.setoffRoad(true);
		builder.setMarce(5);
	}
	
	public void getSport(Builder builder) {
		builder.setMarca("FERRARI");
		builder.setModello("California");
		builder.setCavalli(500);
		builder.setCilindrata(400);
		builder.setKW(130);
		builder.setSeats(2);
		builder.setSport(true);
		builder.setoffRoad(false);
		builder.setMarce(7);
	}

}
