package com.sg.flowcontrol;

public class SwapANumberTwo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20

		System.out.println("after swapping number value is:" + a);
		System.out.println("after swapping number value is:" + b);
	}

}
