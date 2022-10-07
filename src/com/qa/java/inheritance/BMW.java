package com.qa.java.inheritance;

public class BMW implements iCar {
	int id;
	String name;
	int price;
	short engineCC = 0;
	String fuelType = "";
	short manufacturingYear = 0;
	byte noOfCylinders;
	int maxTorque;
	

	public BMW(int id, String name, int price, short engineCC, String fuelType, short manufacturingYear,
			byte noOfCylinders, int maxTorque) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
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
