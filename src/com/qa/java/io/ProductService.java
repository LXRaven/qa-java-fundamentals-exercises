package com.qa.java.io;

import java.text.DecimalFormat;

public class ProductService {

	public static void displayProductDetails(Product p) {
		System.out.println("Id is: " + p.getId());
		System.out.println("name is: " + p.getName());
		System.out.println("price is: " + p.getPrice());
		System.out.println("category is: " + p.getCategory());
		System.out.println("rating is: " + p.getRating());
		System.out.println("discountPercentage is: " + p.getDiscountPercentage());
		System.out.println("isAvailable is: " + p.isAvailable());
	}
	
	public static Product getProductById(Product[] products, int id) {
		Product p = new Product();
		for(Product searchedProduct : products) {
			if (searchedProduct.getId() == id) {
				p = searchedProduct;
			}
		}
		return p;
	}
	
	public static Product getCheapestProduct(Product[] products) {
		float minPrice = products[0].getPrice();
		Product p = products[0];
		for(Product searchedProduct : products) {
			if (searchedProduct.getPrice() < minPrice) {
				p = searchedProduct;
				minPrice = searchedProduct.getPrice();
			}
		}
		return p;
	}
	
	public static Product getMostExpensiveProduct(Product[] products) {
		float maxPrice = products[0].getPrice();
		Product p = products[0];
		for(Product searchedProduct : products) {
			if (searchedProduct.getPrice() > maxPrice) {
				p = searchedProduct;
				maxPrice = searchedProduct.getPrice();
			}
		}
		return p;
	}
	
	public static Product getLowestRatingProduct(Product[] products) {
		float minRating = products[0].getRating();
		Product p = products[0];
		for(Product searchedProduct : products) {
			if (searchedProduct.getRating() <= minRating) {
				p = searchedProduct;
				minRating = searchedProduct.getRating();
			}
		}
		return p;
	}
	
	public static Product getHighestRatingProduct(Product[] products) {
		float maxRating = products[0].getRating();
		Product p = products[0];
		for(Product searchedProduct : products) {
			if (searchedProduct.getRating() >= maxRating) {
				p = searchedProduct;
				maxRating = searchedProduct.getRating();
			}
		}
		return p;
	}
	
	public static float getFinalPrice(Product p) {
		DecimalFormat df = new DecimalFormat("##.##");
		float finalPrice = Float.parseFloat(df.format(p.getPrice() * (1 - (p.getDiscountPercentage()/100))));
		return finalPrice ;
	}
	
	public static float getDiscountedAmount(Product p) {
		DecimalFormat df = new DecimalFormat("##.##");
		float discountedAmount = Float.parseFloat(df.format(p.getPrice() * (p.getDiscountPercentage()/100)));
		return discountedAmount ;
	}
}
