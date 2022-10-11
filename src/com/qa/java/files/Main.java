package com.qa.java.files;

import java.util.ArrayList;

import com.qa.java.oop.Product;

public class Main {

	public static void main(String[]args) {
		String filePath = "C:\\Users\\Alex TJ\\Desktop\\desktop\\QA Bootcamp 2022\\Java Fundamentals\\java.exercises\\src\\com\\qa\\java\\files\\products.csv";
		ProductCSVReader reader = new ProductCSVReader();
		ArrayList<Product> products = reader.productCSVReader(filePath);
		
		for (Product product : products) {
			product.displayProductDetails();
			System.out.println();
		}
	}
}
