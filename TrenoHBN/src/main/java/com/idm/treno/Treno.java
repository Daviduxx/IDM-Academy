package com.idm.treno;

import java.util.ArrayList;
import java.util.List;


public class Treno {
	
	private int id;
	private List<Vagone> vagoni = new ArrayList<>();
	private String marca;
	
	public Treno () {}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Vagone> getVagoni() {
		return vagoni;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setVagoni(List<Vagone> vagoni) {
		this.vagoni = vagoni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Treno [marca=" + marca + ", vagoni=" + vagoni + "]";
	}
	

}
