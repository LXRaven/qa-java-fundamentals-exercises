package com.qa.java.io;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
			List<Product> allProducts = ProductRepository.getProductsFromFile("C:\\Users\\Alex TJ\\Desktop\\desktop\\QA Bootcamp 2022\\Java Fundamentals\\java.exercises\\src\\com\\qa\\java\\io\\products.csv");
			
			//printing all products from a csv file
			for (Product product : allProducts) {
				ProductService.displayProductDetails(product);
				System.out.println();
			}
			
			//get product by id
			Product pByID = ProductService.getProductById(allProducts, 1);
			System.out.print("The product with the id of 1 is:");
			System.out.println(pByID);
			System.out.println();
			
			//get cheapest item
			Product pCheapest = ProductService.getCheapestProduct(allProducts);
			System.out.print("The cheapest product is: ");
			System.out.println(pCheapest);
			System.out.println();
			
			//get most expensive item
			Product pMostExpensive = ProductService.getMostExpensiveProduct(allProducts);
			System.out.print("The most expensive product is: ");
			System.out.println(pMostExpensive);
			System.out.println();
			
			//get lowest rating item
			Product pLowestRating = ProductService.getLowestRatingProduct(allProducts);
			System.out.print("The lowest rating product is: ");
			System.out.println(pLowestRating);
			System.out.println();
			
			//get highest rating item
			Product pHighestRating = ProductService.getHighestRatingProduct(allProducts);
			System.out.print("The highest rating product is: ");
			System.out.println(pHighestRating);
			System.out.println();
			
			//get discounted amount for all items
			for(Product p : allProducts) {
			System.out.println("The discounted amount for "+ p + " is: " + ProductService.getDiscountedAmount(p));
			System.out.println();
			}
			
			//get final price for all items
			for(Product p : allProducts) {
			System.out.println("The final price for "+ p + " is: " + ProductService.getFinalPrice(p));
			System.out.println();
			}
		}
}
