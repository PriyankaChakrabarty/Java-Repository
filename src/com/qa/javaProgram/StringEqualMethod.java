package com.qa.javaProgram;

public class StringEqualMethod {

	public static void main(String[] args) {
		String s1= new String("durga");
		String s2= new String("software");
		String s3= new String("durga");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		String s4="durga";
		String s5="dur"+"ga";
		System.out.println(s5);
		System.out.println(s4==s5);
	}

}
