package com.idm.test;

import com.idm.composite.Carrello;
import com.idm.composite.Prodotto;
import com.idm.composite.Totale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Il prezzo totale dell'ordine è:");
		
		Carrello c1 = new Carrello(3,4);
		Prodotto p1 = new Prodotto(3,4,9);
		
		Totale t = new Totale();
		t.add(p1);
		t.add(c1);
		
		System.out.println(t.calcolaPrezzo());

	}

}
