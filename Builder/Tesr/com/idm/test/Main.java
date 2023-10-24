package com.idm.test;

import com.idm.builder.Builder;
import com.idm.builder.Car;
import com.idm.builder.CarBuilder;
import com.idm.builder.Director;
import com.idm.builder.OffRoadBuilder;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Benvenuto nel builder delle auto");
		
		Director d = new Director();
		Builder b = new Builder();
		d.getOffRoad(b);
		d.getSport(b);
		
		Car jeep = b.getCar();
		Car ferrari = b.getCar();
		
		System.out.println(jeep);
		System.out.println(ferrari);

	}

}
