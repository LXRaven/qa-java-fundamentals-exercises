package com.qa.java.files;

import java.io.*;
import java.util.ArrayList;

import com.qa.java.oop.Product;

public class ProductCSVReader {

	public ArrayList<Product> productCSVReader(String filePath) {
		ArrayList<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
			
			br.readLine();//headers
			String productInfo = br.readLine();
			while(productInfo!=null) {
				String[] splitList = productInfo.split(",");
				int id = Integer.parseInt(splitList[0]);
				String name = splitList[1];
				float price = Float.parseFloat(splitList[2]);
				String category = splitList[3];
				float rating = Float.parseFloat(splitList[4]);
				float discountPercentage = Float.parseFloat(splitList[5]);
				boolean isAvailable = Boolean.parseBoolean(splitList[6]);
				Product product =  new Product(id,name,price,category, rating,discountPercentage,isAvailable);
				products.add(product);
				productInfo = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return products;
		
	}
}
