package com.treno.idm;

public class Fabbrica { // questa è la abstract factory
	
	public Vagone getVagone(char car) throws Exception {
		
		Vagone v = null;
		
		switch (car) {
		case 'h':
			v = LocomotivaFabbrica.getVagone();     //ritorna una locomotiva
			break;
		case 'p':
			v = PasseggeriFabbrica.getVagone();		//ritorna un vagone passeggeri
			break;
		case 'r':
			v = RistoranteFabbrica.getVagone();		// ritorna un vagone ristorante
			break;
		case 'c':
			v = CargoFabbrica.getVagone();		// ritorna un vagone cargo
			break;
		default:
			throw new Exception("Questo tipo di vagone non esiste!");
		}
		return v;
	}

}
