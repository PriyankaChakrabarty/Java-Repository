package com.qa.javaProgram;

import java.util.Scanner;

public class StringTrimMethod {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of the city");
		String cityName=sc.nextLine().toLowerCase().trim();
		if(cityName.equals("kolkata")) {
			System.out.println("Hello Bengali-Namaskar");
		}
		else if(cityName.equals("bangalore")) {
			System.out.println("Hello Karnatika");
			}
		else {
			System.out.println("Please enter valid city name");
		}
		
		
		
		

	}

}
