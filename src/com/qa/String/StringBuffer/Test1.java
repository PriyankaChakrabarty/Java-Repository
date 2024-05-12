package com.qa.String.StringBuffer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("");
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("qs");
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer();
		sb1.append("priyanka is a girl");
		sb1.append(3.5);
		sb1.append("it is exactly");
		sb1.append(true);
		System.out.println(sb1);
		System.out.println(sb.charAt(3));
		sb.setCharAt(2, 'c');
		System.out.println(sb);
		sb.insert(0, "abc");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.delete(1, 3));

	}

}
