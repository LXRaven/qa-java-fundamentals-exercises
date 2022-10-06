package com.qa.java.validEmail;

public class EmailValidation {
	public static boolean isValid(String address) {
		String validEmailPattern = "^[a-z0-9\\._]+@[a-z]+\\.com";
		return address.matches(validEmailPattern);
	}
	
	public static int numOfValidAddresses(String[] emails) {
		byte numValidEmails;
		numValidEmails = 0;
		for (String address : emails) {
			if (isValid(address)) {
				numValidEmails++;
			}
		}
		return numValidEmails;
	}
	
	public static int numOfInvalidAddresses(String[] emails) {
		byte numInvalidEmails;
		numInvalidEmails = 0;
		for (String address : emails) {
			if (!isValid(address)) {
				numInvalidEmails++;
			}
		}
		return numInvalidEmails;
	}
	
	public static void printValidAddresses(String[] emails){
		for (String address : emails) {
			if (isValid(address)) System.out.println(address);
		}
	}
	
	public static void printInvalidAddresses(String[] emails){
		for (String address : emails) {
			if (!isValid(address)) System.out.println(address);
		}
	}
	
}
