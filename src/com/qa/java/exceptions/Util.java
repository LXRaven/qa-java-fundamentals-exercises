package com.qa.java.exceptions;

import com.qa.java.oop.Product;

public class Util {

	//ex2
	public static int div(int no1, int no2) {
			int res = no1 / no2;
			return res;
		}
	
	//ex3
	public static void getProductDetails(Product product) {
		try {
			product.displayProductDetails();
		} catch (NullPointerException e) {
			System.out.println("Product is null");
		}
	}
	
	//ex4
	public static Product getProductById(int id) throws ProductNotFoundException{
		Product p  = null;
		for (Product product : Product.allProducts) {
			if (id == product.id) {
				p = product;
				}
	}
		if (p==null) throw new ProductNotFoundException("Product not found");
		else return p;
	}
	
	
	public static void main(String[] args) {
		
		//division error handling
		try{
			System.out.println(div(20,0));
		} catch (ArithmeticException e) {
			System.out.println("Division by 0 cannot be done");
		}
		
		Product p1;
		p1 = null;
		getProductDetails(p1);
		
		try {
			System.out.println(getProductById(3));
		} catch (ProductNotFoundException e) {
			System.out.println("Product not found");;
		}
		
	}

}
