package decorator;

import com.decorator.academy.Rettangolo;
import com.decorator.academy.Colore;
import com.decorator.academy.FiguraBordoColorato;
import com.decorator.academy.FiguraColorata;
import com.decorator.academy.FiguraErrata;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(3,4);
		System.out.println("Area rettangolo r " + r.calcolaArea());
		
		Colore rosso = new Colore(255,0,0);
		Colore verde = new Colore(0,255,0);
		Colore blu = new Colore(0,0,255);
		
		FiguraColorata rBlu = new FiguraColorata(r, blu);
		FiguraBordoColorato fbc = new FiguraBordoColorato(rBlu, verde);
		FiguraErrata fe = new FiguraErrata(fbc);
		System.out.println(fe + " " + fe.calcolaArea() + " " + fe.prezzo());


	}

}
