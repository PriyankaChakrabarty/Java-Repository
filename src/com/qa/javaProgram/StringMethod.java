package com.qa.javaProgram;

public class StringMethod {

	public static void main(String[] args) {
		String s1=new String("Durga");
		s1.concat("software");
		System.out.println(s1);
		int i=s1.length();
		System.out.println(i);
		String s2="ababab";
		System.out.println(s2.replace('a', 'b'));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toCharArray());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(4));
		
		}

}
