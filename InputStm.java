package com.basic.pkg;

import java.util.Scanner;

public class InputStm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=scan.nextInt();
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		int c =a+b;
		System.out.println("Addition of a&b is:"+c);
		scan.close();
	}

}
