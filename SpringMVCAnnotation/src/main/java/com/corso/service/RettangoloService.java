package com.corso.service;

import com.corso.bean.Rettangolo;

public class RettangoloService {

    Rettangolo rettangolo; 	
	
	public Rettangolo getRettangolo() {
		return rettangolo;
	}

	public Rettangolo crea(double base, double altezza) {
			this.rettangolo =  new Rettangolo(base, altezza); 
			return this.rettangolo;
		}
		
		public double area() {
			return rettangolo.area(); 
		}
		
		public void doppioBase() {
			rettangolo.setB(rettangolo.getB()*2); 
		}
		
		public void doppioAltezza() {
			rettangolo.setA(rettangolo.getA()*2); 
		}
}
