package com.qa.javaProgram;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a= 30;
      int b= 20;
      System.out.println("Before swapping:");
      System.out.println("a is :"+a);
      System.out.println("b is :"+b);
      
      System.out.println("After swapping: ");
//      int temp;
//      temp=a;//20
//      a=b;//30
//      b=temp;//
//      System.out.println("a is :"+a);
//      System.out.println("b is :"+b);
      
     // Without Temp Vraiable
      
      a=a-b; //10
      b=a+b; //30
      a=b-a; //20
      
      System.out.println("a is :"+a);
      System.out.println("b is :"+b);
      
      
      
		  
	}

}
