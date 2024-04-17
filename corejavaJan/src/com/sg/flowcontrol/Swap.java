package com.sg.flowcontrol;

public class Swap {

	public static void main(String[] args) {

		// Initial numbers
		int a = 5;
		int b = 10;

		// Swapping without using a temporary variable
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);

	}

}
