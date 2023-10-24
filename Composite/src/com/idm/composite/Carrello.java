package com.idm.composite;

public class Carrello implements Ordine{
	
	private int numeroProdotti;
	private int costoSpedizione;

	public Carrello(int numeroProdotti, int costoSpedizione) {
		this.numeroProdotti = numeroProdotti;
		this.costoSpedizione = costoSpedizione;
	}



	@Override
	public int calcolaPrezzo() {
		int tot = this.numeroProdotti + this.costoSpedizione;
		return tot;
	}

}
