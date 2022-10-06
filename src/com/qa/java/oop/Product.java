package com.qa.java.oop;

public class Product {
	int id;
	String name;
	float price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	
	public Product(int id, String name, float price, String category, float rating, float discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	public void viewDetails() {
		System.out.println("Id is: " + id);
		System.out.println("name is: " + name);
		System.out.println("price is: " + price);
		System.out.println("category is: " + category);
		System.out.println("rating is: " + rating);
		System.out.println("discountPercentage is: " + discountPercentage);
		System.out.println("isAvailable is: " + isAvailable);
	}

	

}
