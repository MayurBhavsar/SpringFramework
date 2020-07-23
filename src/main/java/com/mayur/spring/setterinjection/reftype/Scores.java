package com.mayur.spring.setterinjection.reftype;

public class Scores {

	private Double math;
	private Double sicence;
	private Double english;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getSicence() {
		return sicence;
	}

	public void setSicence(Double sicence) {
		this.sicence = sicence;
	}

	public Double getEnglish() {
		return english;
	}

	public void setEnglish(Double english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", sicence=" + sicence + ", english=" + english + "]";
	}
}
