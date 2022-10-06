package com.qa.java.fundamentals;

public class ReversedNumber {
	public static void main(String[] args) {
		int num1;
		num1 = 1234;
		
		int num2;
		num2 = 879;
		
		int newNum1;
		newNum1 = 0;
		
		int newNum2;
		newNum2 = 0;
		
		int tempNum1;
		tempNum1 = num1;
		
		int tempNum2;
		tempNum2 = num2;
		
		while (tempNum1 > 0) {
			newNum1 *= 10;
			newNum1 += tempNum1 % 10;
			tempNum1 /= 10;
		}
		while (tempNum2 > 0) {
			newNum2 *= 10;
			newNum2 += tempNum2 % 10;
			tempNum2 /= 10;
		}
		
		System.out.println("The reverse of "+ num1+" is: "+ newNum1);
		System.out.println("The reverse of "+ num2+" is: "+ newNum2);
	}
}
