package com.qa.java.oop;

import java.util.ArrayList;

public class Product {
	public int id;
	public String name;
	float price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	static public ArrayList<Product> allProducts = new ArrayList<Product>();
	
	public Product(int id, String name, float price, String category, float rating, float discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
		allProducts.add(this);
	}
	
	public void displayProductDetails() {
		System.out.println("Id is: " + id);
		System.out.println("name is: " + name);
		System.out.println("price is: " + price);
		System.out.println("category is: " + category);
		System.out.println("rating is: " + rating);
		System.out.println("discountPercentage is: " + discountPercentage);
		System.out.println("isAvailable is: " + isAvailable);
	}

	

}
