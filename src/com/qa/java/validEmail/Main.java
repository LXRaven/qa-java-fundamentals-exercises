package com.qa.java.validEmail;

public class Main {

	public static void main(String[] args) {
		String[] emails= {"abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		
		System.out.println("The number of valid email addresses is: "+ EmailValidation.numOfValidAddresses(emails));
		System.out.println();
		System.out.println("The number of invalid email addresses is: "+ EmailValidation.numOfInvalidAddresses(emails));
		System.out.println();
		System.out.println("The valid addresses are:");
		EmailValidation.printValidAddresses(emails);
		
		System.out.println();
		
		System.out.println("The invalid addresses are:");
		EmailValidation.printInvalidAddresses(emails);
		
		
	}
}
