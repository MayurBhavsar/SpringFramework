package com.mayur.spring.setterinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private float sal;
	private Set<String> skills;
	private Map<String,String> family;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getFamily() {
		return family;
	}
	public void setFamily(Map<String, String> family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", skills=" + skills + ", family=" + family
				+ "]";
	}
	
}
