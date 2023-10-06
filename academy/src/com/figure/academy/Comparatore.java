package com.figure.academy;

import java.util.Comparator;

public class Comparatore implements Comparator<Figura>{

	@Override
	public int compare(Figura o1, Figura o2) {
		
		double area1 = o1.calcolaArea();
        double area2 = o2.calcolaArea();
        

        if (area1 < area2) {
            return -1;
        } else if (area1 > area2) {
            return 1;
        } else {
            return 0;
        }
	}

}
