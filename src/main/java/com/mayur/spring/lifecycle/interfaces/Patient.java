package com.mayur.spring.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In init method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy method");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
