package com.mayur.spring.constructorinjection.ambiguitysolution;

public class Addition {

	public Addition(double a,double b) {
		System.out.println("In Constructor double");
	}
	
	public Addition(int a,int b) {
		System.out.println("In Constructor int");
	}
	
	public Addition(String a,String b) {
		System.out.println("In Constructor String");
	}
}
