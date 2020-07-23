package com.mayur.spring.setterinjection.reftype;

public class Student {

	private Scores scores1;
	private Scores scores2;
	private Scores scores3;
	public Scores getScores1() {
		return scores1;
	}
	public void setScores1(Scores scores1) {
		this.scores1 = scores1;
	}
	public Scores getScores2() {
		return scores2;
	}
	public void setScores2(Scores scores2) {
		this.scores2 = scores2;
	}
	public Scores getScores3() {
		return scores3;
	}
	public void setScores3(Scores scores3) {
		this.scores3 = scores3;
	}
	@Override
	public String toString() {
		return "Student [\nscores1=" + scores1 + ",\nscores2=" + scores2 + ",\nscores3=" + scores3 + "]";
	}
	
	
}
