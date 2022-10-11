package com.qa.java.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.qa.java.oop.Product;

public class AddProduct {

	public static void addProduct(Product p, String filePath) throws IOException  {
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)))){
			String input = p.id+","+p.name+","+p.price+","+p.category+","+p.rating+","+p.discountPercentage+","+p.isAvailable;
			pw.println(input);
			pw.flush();
		} 
	}
}
