package com.qa.java.inheritance;

public class Main {

	public static void main(String[] args) {
		Audi a1 = new Audi(54313, "Audi", 35000, (short)3000, "Diesel", (short)2015, "Q7", true);
		BMW b1 = new BMW(23124, "BMW", 38500, (short)3000, "Diesel", (short)2014, (byte)12, 500);
		
		System.out.println("Audi:");
		a1.displayCarDetails();
		
		System.out.println();
		
		System.out.println("BMW:");
		b1.displayCarDetails();
		
		System.out.println();
		
		CarService.service(a1);
		
		System.out.println();
		
		CarService.service(b1);
	}

}
