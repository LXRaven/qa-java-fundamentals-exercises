package com.qa.java.fundamentals;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int num1;
		num1 = 1234;
		
		int num2;
		num2 = 5681;
		
		int sum1;
		sum1 = 0;
		int sum2;
		sum2 = 0;
		
		int tempNum1;
		tempNum1 = num1;
		
		int tempNum2;
		tempNum2 = num2;
		
		while (tempNum1 > 0) {
			sum1 += tempNum1 % 10;
			tempNum1 /= 10;
		}
		while (tempNum2 > 0) {
			sum2 += tempNum2 % 10;
			tempNum2 /= 10;
		}
		
		System.out.println("The sum of the digits for "+ num1+" is: "+ sum1);
		System.out.println("The sum of the digits for "+ num2+" is: "+ sum2);
	}
}
