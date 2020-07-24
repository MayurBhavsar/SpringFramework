package com.mayur.spring.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void hiii() {
		System.out.println("In init method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("In destroy method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
