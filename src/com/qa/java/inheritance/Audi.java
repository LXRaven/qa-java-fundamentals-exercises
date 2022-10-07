package com.qa.java.inheritance;

public class Audi implements iCar{
	int id;
	String name;
	int price;
	short engineCC = 0;
	String fuelType = "";
	short manufacturingYear = 0;
	String model;
	boolean isAvailable;



	public Audi(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear, String model,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
		this.model = model;
		this.isAvailable = isAvailable;
	}



	@Override
	public void displayCarDetails(){
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Engine CC's: "+ engineCC);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("Manufacturing year: "+ manufacturingYear);
		System.out.println("Model: "+ model);
		System.out.println("Is available: "+ isAvailable);
		
	}
}
