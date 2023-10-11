package com.treno.idm;

import com.exception.idm.CustomException;

public class Fabbrica { // questa è la abstract factory
	
	public Vagone getVagone(char car) throws CustomException {
		
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
			throw new CustomException();
		}
		return v;
	}

}
