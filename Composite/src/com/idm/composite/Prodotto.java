package com.idm.composite;

public class Prodotto extends Carrello implements Ordine{
	
	private int prezzo;

	public Prodotto(int numeroProdotti, int costoSpedizione, int prezzo) {
		super(numeroProdotti, costoSpedizione);
		this.prezzo = prezzo;
	}

}
