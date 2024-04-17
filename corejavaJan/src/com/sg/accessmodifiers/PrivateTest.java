package com.sg.accessmodifiers;

public class PrivateTest {
	
	private int id = 2024;
	private void show() {
		
		System.out.println("how are you");
	}
	
	public static void main(String[] args) {
		
		PrivateTest test = new PrivateTest();
		System.out.println(test.id);
		test.show();
	}
	

}
