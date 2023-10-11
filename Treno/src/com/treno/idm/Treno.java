package com.treno.idm;

import java.util.ArrayList;
import java.util.List;

import com.exception.idm.CustomException;
import com.exception.idm.IncompatibleException;
import com.exception.idm.LocomotivaException;
import com.exception.idm.RestaurantException;

public class Treno {
	
	private List<Vagone> vagoni = new ArrayList<>();
//	private String struttura;
	private String marca;
	
	public Treno () {}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
		
		
//		for ( int i = 0; i < this.struttura.toCharArray().length; i ++) {
//			if(this.struttura.toCharArray()[0] != 'h') {
//				throw new LocomotivaException();
//			}
//			if(this.struttura.charAt(i) == 'c') {
//				for ( int j = 0; i < this.struttura.toCharArray().length; j++) {
//					if(this.struttura.charAt(j) == 'p') {
//						throw new IncompatibleException();
//					}
//				}
//			}
//			if(this.struttura.charAt(i) == 'r') {
//				if(i < (struttura.length()) / 2 || i > (struttura.length()) / 2 )
//					throw new RestaurantException("Attenzione! Il ristorante non si trova in una posizione centrale. Cambiare la posizione del ristorante.");
//				for ( int k = i + 1; k < this.struttura.toCharArray().length; k++) {
//					if(this.struttura.charAt(k) == 'r') {
//						throw new RestaurantException();
//					}
//				}
//			}
////			Vagone v = f.getVagone(this.struttura.toCharArray()[i]);
////			vagoni.add(v);
//		}




	@Override
	public String toString() {
		return "Treno [marca=" + marca + ", vagoni=" + vagoni + "]";
	}


	public List<Vagone> getVagoni() {
		return vagoni;
	}
	
	
	
	

}
