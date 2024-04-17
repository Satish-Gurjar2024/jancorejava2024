package com.sg.flowcontrol;

public class FabnocciSeriesDemo {

	public static void main(String[] args) {

		int k = 1;
		int b = 1;
		int temp = 0;
		System.out.println(k + " " + b + " ");
		for (int i = 1; i <= 10; i++) {   //i=1,2

			temp = k + b;
			System.out.print(temp + " ");  

			k = b;  //1,
			b = temp;   //2,
		}

	}

}
