package com.qa.java.inheritance;

public abstract class Car {
	int id;
	String name;
	int price;
	short engineCC;
	String fuelType;
	short manufacturingYear;
	
	public Car(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}

	public abstract void displayCarDetails();
}
