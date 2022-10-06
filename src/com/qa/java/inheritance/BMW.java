package com.qa.java.inheritance;

public class BMW extends Car {
	byte noOfCylinders;
	int maxTorque;
	
	
	public BMW(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear, byte noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
	this.noOfCylinders = noOfCylinders;
	this.maxTorque = maxTorque;
	}

	@Override
	public void displayCarDetails(){
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Engine CC's: "+ engineCC);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("Manufacturing year: "+ manufacturingYear);
		System.out.println("Number of Cylinders: "+ noOfCylinders);
		System.out.println("Max Torque "+ maxTorque);
	}
}
