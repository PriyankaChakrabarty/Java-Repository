package com.qa.java;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(12.5, 10.6);
		obj.sum(50, 60);

	}
	
	//Method Overloading: when u r using same method with different arguments or input parameters, with different datatypes inside the same class
	//we can't create a method inside a method
	//Duplicate methods- same method name with same number of input parameters are not allowed
	//we can override main method also
public void sum() {
	System.out.println("Sum Method");
}
public void sum(int a, int b) {
	System.out.println("Sum Method");
	System.out.println(a+b);
}
 public void sum(double i, double j) {
	 System.out.println("Sum Method");
	 System.out.println(i+j);
	
}
}
