package com.mayur.spring.lifecycle.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hiii() {
		System.out.println("In init method");
	}
	
	public void bye() {
		System.out.println("In destroy method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
