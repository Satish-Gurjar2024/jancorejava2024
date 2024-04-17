package com.sg.accessmodifiers;

public class C extends BParents{

	public static void main(String[] args) {

		C c=new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
		
		c.string();
	}

}
