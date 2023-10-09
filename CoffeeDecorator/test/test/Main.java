package test;

import com.coffee.idm.Caffe;
import com.coffee.idm.CaffeConcreto;
import com.coffee.idm.CaffeCorretto;
import com.coffee.idm.CaffeMacchiato;
import com.coffee.idm.CaffeZuccherato;
import com.coffee.idm.Caffeina;
import com.coffee.idm.Caratteristica;
import com.coffee.idm.EVariante;
import com.coffee.idm.TipoCaffe;
import com.coffee.idm.Variante;

public class Main {

	public static void main(String[] args) {
		
		
		CaffeConcreto c = new CaffeConcreto("Caffe Normale");
		System.out.println(c);

		
		TipoCaffe c1 = new TipoCaffe(c, "moka");
		System.out.println(c1);
		
		Caffeina c2 = new Caffeina(c1, true);
		System.out.println(c2);
		
		CaffeZuccherato c3 = new CaffeZuccherato(c2, 1);
		System.out.println(c3);
		
		TipoCaffe c4 = new TipoCaffe(c, "espresso");
		CaffeMacchiato c5 = new CaffeMacchiato(c4);
		System.out.println(c5);
		
		Caffeina c6 = new Caffeina(c4, false);
		System.out.println(c6);
		CaffeMacchiato c7 = new CaffeMacchiato(c6);
		System.out.println(c7);
		
		CaffeCorretto c8 = new CaffeCorretto(c7);
		System.out.println(c8);
		
		CaffeZuccherato c9 = new CaffeZuccherato(c2, 2);
		Variante c10 = new Variante(c5, EVariante.AMERICANO);
		System.out.println(c10);

	}

}
