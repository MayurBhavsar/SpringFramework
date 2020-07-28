package com.mayur.spring.constructorinjection;

import java.util.List;
import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private float sal;
	private List<String> skills;
	private Map<String, String> family;
	private Address address;

	public Employee(int id, String name, float sal, List<String> skills, Map<String, String> family, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skills = skills;
		this.family = family;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", skills=" + skills + ", family=" + family
				+ ", address=" + address + "]";
	}

}
