package com.idm.singleton;

public class Main {

	public static void main(String[] args) {
		
//		Test t = new Test(1,"nome"); il costruttore è privato, quindi non posso creare istanze
		
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		
		System.out.println(t1 == t2);
	}

}
