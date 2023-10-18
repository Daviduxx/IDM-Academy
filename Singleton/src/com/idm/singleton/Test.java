package com.idm.singleton;

public class Test {
	private final static Test t = new Test(1,"nome");
	// final perché una volta che questa prop è stata inizializzata non può più essere riassegnata
	//static perché vuol dire che la prop è condivisa tra tutte le istanze della classe
	
	private int numero;
	private String nome;
	
	private Test(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public static Test getTest() {   	// per forza static perché devo poter accedere a questo metodo indipendentemente dalla creazione dell'istanza, dato che il costruttore è privato
		return t;
	}
	
	
	

}
