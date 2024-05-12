package com.qa.String.StringBuffer;

public class Test {

	public static void main(String[] args) {
//		String s = new String("Java");
//	     String s1 =  s.concat("selenium");
//	     System.out.println(s); //in S object we can't make changes bcz s with java is already crteated ans string is immutable so we can't change
//		System.out.println(s1);
//		
		String s1 = new String("durga");
		String s2 = new String("DURGA");
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(4));
		System.out.println(s2.length());
		System.out.println(s2.indexOf('r'));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace('g', 'a'));
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.substring(3));
		String s3=new String("aabcaga");
		System.out.println(s3.lastIndexOf('a'));
		
		

}
}