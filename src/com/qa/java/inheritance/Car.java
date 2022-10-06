package com.qa.java.inheritance;

public class Car {
	int id;
	String name;
	int price;
	short engineCC;
	String fuelType;
	short manufacturingYear;
	
	
	
	public Car(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}



	public void displayCarDetails(){
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Engine CC's: "+ engineCC);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("Manufacturing year: "+ manufacturingYear);
	}
}
