package com.idm.composite;

import java.util.ArrayList;
import java.util.List;

public class Totale implements Ordine{
	
	private List<Ordine> ordine = new ArrayList<>();
	private int costoTotale = 0;
	
	public void add(Ordine ordine) {
		this.ordine.add(ordine);
	}

	@Override
	public int calcolaPrezzo() {
		for(Ordine o : ordine) {
			this.costoTotale += o.calcolaPrezzo();
			System.out.println(this.costoTotale);
		}
		return this.costoTotale;
	}

}
