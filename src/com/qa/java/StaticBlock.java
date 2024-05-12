package com.qa.java;

public class StaticBlock {
	
	static{
		System.out.println("Static 2");
	}
	static{
		System.out.println("Static 1");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}

}
