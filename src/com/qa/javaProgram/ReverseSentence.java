package com.qa.javaProgram;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "I Love java programming";
		String wordArr[] = sentence.split(" ");
		for (int i = wordArr.length - 1; i >= 0; i--) {
			System.out.print(wordArr[i] + " ");

			// StringBuffer sb = new StringBuffer("I Love java programming");
			// System.out.print(sb.reverse());
		}

	}
}
