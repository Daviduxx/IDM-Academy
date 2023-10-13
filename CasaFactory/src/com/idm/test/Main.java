package com.idm.test;

import com.idm.casa.Casa;
import com.idm.casa.Creator;

public class Main {

	public static void main(String[] args) {
		
		
		Creator c = new Creator();
		
		Casa campagna = c.creaCasa("campagna");
		Casa citta = c.creaCasa("citta");
		
		System.out.println(campagna);
		System.out.println(citta);

	}

}
