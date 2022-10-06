package com.qa.java.inheritance;

public class Audi extends Car{
	String model;
	boolean isAvailable;
	
	
	public Audi(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear, String model, boolean isAvailable){
		super(id, name, price, engineCC, fuelType, manufacturingYear);
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
