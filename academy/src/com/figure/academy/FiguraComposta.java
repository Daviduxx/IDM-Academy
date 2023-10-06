package com.figure.academy;

import java.util.Collections;
import java.util.LinkedList;

public class FiguraComposta extends Figura{
	
	LinkedList<Figura> figuraComposta = new LinkedList<>();

	public FiguraComposta(LinkedList<Figura> figuraComposta) {
		this.figuraComposta = figuraComposta;
	}

	@Override
	public double calcolaArea() {
		double area = 0;
		for(Figura figura : this.figuraComposta) {
			area += figura.calcolaArea();
		}
		return area;
	}
	
	public void print() {
		for(Figura figura : this.figuraComposta) {
			System.out.println(figura.calcolaArea());
		}
	}
	
//	public void ordina() {
//		for(int i = 0; i < this.figuraComposta.size(); i++) {
//			double area = this.figuraComposta.get(i).calcolaArea();
//			if(i > 0) {
//				if(area < this.figuraComposta.get(i-1).calcolaArea()) {
//					this.figuraComposta.set(i-1, this.figuraComposta.get(i));
//					this.figuraComposta.set(i, this.figuraComposta.get(i));
//				} 
////				else {
////					this.figuraComposta.set(i, this.figuraComposta.get(i));
////				}
//			}
//			
//		}
//	}
	
	public void ordina() {
		Collections.sort(this.figuraComposta, new Comparatore());
	}
	

}
