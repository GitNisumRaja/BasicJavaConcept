package com.java.core.concept.string;

import java.util.Scanner;

public class StringLengthCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Get Length Count"+ lenghtCount(str));

	}
	
	public static int lenghtCount(String str) {
		return str.length();
	}

}
