package com.sg.variable;

import com.sg.accessmodifiers.ProtectedTest;

public class MainTest extends ProtectedTest {

	public static void main(String[] args) {

		MainTest main = new MainTest();
		System.out.println(main.id);
		main.display();
	}

}
