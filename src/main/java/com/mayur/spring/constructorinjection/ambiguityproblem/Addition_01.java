package com.mayur.spring.constructorinjection.ambiguityproblem;

public class Addition_01 {

	public Addition_01(double a,double b) {
		System.out.println("In Constructor Addition_01 double");
	}
	
	public Addition_01(int a,int b) {
		System.out.println("In Constructor Addition_01 int");
	}
	
}
