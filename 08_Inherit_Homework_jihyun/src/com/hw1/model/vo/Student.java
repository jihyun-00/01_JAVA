package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	@Override
	public String information() {
		return super.information() + " / 학년 : " + grade + " / 전공 : " + major;
	}
	
	

}
