package com.qa.java.io;

import java.text.DecimalFormat;
import java.util.List;

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
	
	public static Product getProductById(List<Product> products, int id) {
		Product p = new Product();
		for(Product searchedProduct : products) {
			if (searchedProduct.getId() == id) {
				p = searchedProduct;
			}
		}
		return p;
	}
	
	public static Product getCheapestProduct(List<Product> products) {
		float minPrice = products.get(0).getPrice();
		Product p = products.get(0);
		for(Product searchedProduct : products) {
			if (searchedProduct.getPrice() < minPrice) {
				p = searchedProduct;
				minPrice = searchedProduct.getPrice();
			}
		}
		return p;
	}
	
	public static Product getMostExpensiveProduct(List<Product> products) {
		float maxPrice = products.get(0).getPrice();
		Product p = products.get(0);
		for(Product searchedProduct : products) {
			if (searchedProduct.getPrice() > maxPrice) {
				p = searchedProduct;
				maxPrice = searchedProduct.getPrice();
			}
		}
		return p;
	}
	
	public static Product getLowestRatingProduct(List<Product> products) {
		float minRating = products.get(0).getRating();
		Product p = products.get(0);
		for(Product searchedProduct : products) {
			if (searchedProduct.getRating() <= minRating) {
				p = searchedProduct;
				minRating = searchedProduct.getRating();
			}
		}
		return p;
	}
	
	public static Product getHighestRatingProduct(List<Product> products) {
		float maxRating = products.get(0).getRating();
		Product p = products.get(0);
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
