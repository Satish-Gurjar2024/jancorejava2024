package com.sg.flowcontrol;

public class ArrayDemo3 {

	public static void main(String[] args) {

		System.out.println("character"+"-"+"score");
		
		int[] score= {500,400,300,200};
		String[]names= {"raja","mantri","sipani","chor"};
		
		for(int i=0; i<4; i++) {
			System.out.println(names[i]+"-"+score[i]);
		}
	}

}
