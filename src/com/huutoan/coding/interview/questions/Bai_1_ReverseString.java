package com.huutoan.coding.interview.questions;

import java.util.Scanner;

public class Bai_1_ReverseString {
	
	
	static void reverseString(String s) {
		String result = "";		
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		System.out.println("Affter reverse is: " + result);
	}
	
	static void reverseStringBuffer(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Affter reverse is " + sb.reverse());
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String value = scanner.nextLine();
//		reverseString(value);
		reverseStringBuffer(value);
	}

}
