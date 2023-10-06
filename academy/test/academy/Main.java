package academy;

import com.figure.academy.Figura;
import com.figure.academy.FiguraColorata;
import com.figure.academy.FiguraComposta;

import java.util.LinkedList;

import com.figure.academy.Cerchio;
import com.figure.academy.Colore;
import com.figure.academy.Esagono;
import com.figure.academy.Pentagono;
import com.figure.academy.Quadrato;
import com.figure.academy.Rettangolo;
import com.figure.academy.Stella;
import com.figure.academy.Triangolo;
import com.figure.academy.TriangoloEquilatero;

public class Main {

	public static void main(String[] args) {
		
		//FIGURE SEMPLICI NON COLORATE
		Cerchio c = new Cerchio(3);
		System.out.println("Area cerchio c " + c.calcolaArea());
		
		Rettangolo r = new Rettangolo(3,4);
		System.out.println("Area rettangolo r " + r.calcolaArea());
		
		Quadrato q = new Quadrato(4,4);
		System.out.println("Area quandrato q " + q.calcolaArea());
		System.out.println("Perimetro quandrato q " + q.calcolaPerimetro());
		
		Triangolo t = new Triangolo(5,3);
		System.out.println("Area triangolo t " + t.calcolaArea());
		
		TriangoloEquilatero te = new TriangoloEquilatero(5, 5);
		System.out.println("Area triangolo equilatero te " + te.calcolaArea());
		System.out.println("Perimetro triangolo equilatero te " + te.calcolaPerimetro());
		
		Pentagono p = new Pentagono(5,4);
		System.out.println("Area pentagono p " + p.calcolaArea());
		System.out.println("Perimetro pentagono p " + p.calcolaPerimetro());
		
		Esagono e = new Esagono(6,3);
		System.out.println("Area esagono e " + e.calcolaArea());
		System.out.println("Perimetro esagono e " + e.calcolaPerimetro());
		
		// FIGURE COMPOSTE NON COLORATE
		LinkedList<Figura> casa = new LinkedList<>();
		casa.add(r);
		casa.add(te);
		
		FiguraComposta formaCasa = new FiguraComposta(casa);
		System.out.println("area casa" + formaCasa.calcolaArea());
		
		// FIGURE COMPOSTE DA ALTRE FIGURE COMPOSTE NON COLORATE
		LinkedList<Figura> casaConCancello = new LinkedList<>();
		casaConCancello.add(formaCasa);
		casaConCancello.add(q);
		
		FiguraComposta casa2 = new FiguraComposta(casaConCancello);
		System.out.println("area casa con cancello" + casa2.calcolaArea());  
		//formaCasa.print();
		
		// FIGURE ORDINATE PER GRANDEZZA DELL'AREA
		LinkedList<Figura> quadrati = new LinkedList<>();
		quadrati.add(new Quadrato(1,1));
		quadrati.add(new Quadrato(5,5));
		quadrati.add(new Quadrato(3,3));
		quadrati.add(new Quadrato(2,2));
		
		FiguraComposta formaQuadrati = new FiguraComposta(quadrati);
		formaQuadrati.ordina();
		System.out.println("aree ordinarte:");
		formaQuadrati.print();
		
		// STELLE NON COLORATE
		Stella s = new Stella(5,3,7);
		System.out.println("Area Stella s" + s.calcolaArea());
		
		// COLORI
		Colore rosso = new Colore(255,0,0);
		Colore verde = new Colore(0,255,0);
		Colore blu = new Colore(0,0,255);
		
		// FIGURE SEMPLICI COLORATE
		FiguraColorata pBlu = new FiguraColorata(p, blu);
		System.out.println("Area pentagono coorato di blu:" + pBlu.calcolaArea());
		
		// FIGURE COMPOSTE DA STELLE E ALTRE FIGURE O FIGURE COMPOSTE COLORATE
		Stella s1 = new Stella(6,4,6);
		System.out.println("Area Stella s1" + s1.calcolaArea());
		Rettangolo r1 = new Rettangolo(3,6);
		System.out.println("Area rettangolo r " + r1.calcolaArea());
		LinkedList<Figura> list1 = new LinkedList<>();
		list1.add(s1);
		list1.add(r1);
		FiguraComposta figC1 = new FiguraComposta(list1);
		System.out.println("area figura figC1 (stalla con bastoncino)");
		System.out.println(figC1.calcolaArea());  
		System.out.println("test)");
		
	}

}
