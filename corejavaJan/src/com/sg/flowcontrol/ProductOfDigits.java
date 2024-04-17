package com.sg.flowcontrol;

public class ProductOfDigits {

	public static void main(String[] args) {

		int num=786;
		int pro=1;
		int temp=0;
		
		while(num>0) {
			temp=num%10;
			pro=pro*temp;
			num=num/10;
			
		}
		System.out.println(pro);
	}

}
