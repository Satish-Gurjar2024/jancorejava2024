package com.sg.variable;

public class ArrayVariableUsingForLoop {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 52;
		a[2] = 45;
		a[3] = 62;
		a[4] = 78;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
	}
}
