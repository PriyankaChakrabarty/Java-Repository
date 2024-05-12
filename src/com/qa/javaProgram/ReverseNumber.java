package com.qa.javaProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int number= 12345;
		int rev=0;
		while(number!=0) {
			int n=number%10; //5//4//3//2
			rev= rev*10+n; //5//54//543//54321
			number=number/10;
		}
		System.out.println("reverse number is " + rev);
		
	}

}
