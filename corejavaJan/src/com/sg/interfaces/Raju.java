package com.sg.interfaces;

import java.util.Scanner;

public class Raju implements Client {

	String name;
	Double Salary;

	public void input() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Username:  ");
		r.nextLine();

		System.out.println("Enter Salary:  ");
		r.nextDouble();
	}

	public void output() {
		System.out.println(name + "  " + Salary);
	}

	public static void main(String[] args) {
		Client c = new Raju();
		c.input();
		c.output();

	}

}
