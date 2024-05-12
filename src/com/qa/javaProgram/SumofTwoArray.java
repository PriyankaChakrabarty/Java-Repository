package com.qa.javaProgram;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String batsmen[]={"Sourav", "Sachin", "Kohli", "Rohit", "Yuvi"};
     String bowlers[]= {"Anil", "Hardick", "Zahir", "Rahul", "Narin"};
     Stream<String> sbats=Arrays.stream(batsmen);
     Stream<String> sbowls=Arrays.stream(bowlers);
     Stream.concat(sbats, sbowls).toArray();
     
     
     }
	}


