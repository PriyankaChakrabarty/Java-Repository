package com.qa.java;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		int a = obj.sum();
		System.out.println(a);
		
		String b = obj.test1();
		System.out.println(b);
	}
	//Non static Method: Always have to call by object reference variable
public void test() {
	System.out.println("Test Method");
}
	public int sum() {
		System.out.println("sum method");
		int x=10;
		int y= 20;
		int z= x+y;
		return z;
	}
	public String test1() {
		System.out.println("Test 1 method");
		String s = "Selenium";
		return s;
		
	}
}

