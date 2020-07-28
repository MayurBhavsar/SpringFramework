package com.mayur.spring.constructorinjection.ambiguityproblem;

public class Addition_02 {

	public Addition_02(double a, double b) {
		System.out.println("In Constructor Addition_02 double");
	}

	public Addition_02(int a, int b) {
		System.out.println("In Constructor Addition_02 int");
	}

	public Addition_02(String a, String b) {
		System.out.println("In Constructor Addition_02 String");
	}
}
