package com.qa.javaProgram;

public class SumOfStringNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s= "12CDS34";
          int sum=0;
          for(int i=0; i<s.length(); i++) {
        	  char c= s.charAt(i);
        	  if(Character.isDigit(c)) {
        		  int a=Integer.parseInt(String.valueOf(c));
        		  sum=sum+a;
        	  }
          }
          System.out.println(sum);
	}

}
