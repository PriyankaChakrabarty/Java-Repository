package com.qa.java;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+10);
	    int i =	Integer.parseInt(s);
	    System.out.println(i);
	    
	    String s1 = "True";
	    boolean b =   Boolean.parseBoolean(s1);
	    System.out.println(b);
	    
	    int j = 500;
	    System.out.println(j+30);
	    String s2 = String.valueOf(j);
	    System.out.println(s2+30);
	    
	    
	    
	    
	


	}

}
