package com.idm.treno;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Treno implements Bean{
	
	
	private Long id;
	private List<Vagone> vagoni = new ArrayList<>();
	private String marca;
	private String nome;
	private int peso;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Treno [marca=" + marca + ", vagoni=" + vagoni + "]";
	}
	

}
