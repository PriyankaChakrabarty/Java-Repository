package com.qa.java;

public class StaticVsNonstatic {

	public String name = "Priyanka";
	public static double height = 5.6;

	public static void main(String[] args) {

		StaticVsNonstatic obj = new StaticVsNonstatic();
		
		//there are two ways to call static methods and variables
		//calling static variable directly
		System.out.println(height);
		//calling static variable with class name
		System.out.println(StaticVsNonstatic.height);
		//calling static method directly
		payment();
		//calling static variable with class name
		StaticVsNonstatic.payment();
		//we can call static methods and variables with obj reference variable also but that time it will display a warning like
		//satic method and variable should be called in a static way
		System.out.println(obj.name);
		obj.login();

	}
	// TODO Auto-generated method stub

	public void login() {
		System.out.println("login method");
	}

	public static void payment() {
		System.out.println("Payment method");

	}

}
