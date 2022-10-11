package com.qa.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

		public static List<Product> getProductsFromFile(String filePath) {
			List<Product> products = new ArrayList<Product>();
			try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
				br.readLine();//headers
				for (int i=1; i<5; i++) {
					String newLine = br.readLine();
					String[] splitLine = newLine.split(",");
					Product product = new Product();
					product.setId(Integer.parseInt(splitLine[0]));
					product.setName(splitLine[1]);
					product.setPrice(Float.parseFloat(splitLine[2]));
					product.setCategory(splitLine[3]);
					product.setRating(Float.parseFloat(splitLine[4]));
					product.setDiscountPercentage(Float.parseFloat(splitLine[5]));
					product.setAvailable(Boolean.parseBoolean(splitLine[6]));;
					products.add(i-1,product);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return products;
		}
}
