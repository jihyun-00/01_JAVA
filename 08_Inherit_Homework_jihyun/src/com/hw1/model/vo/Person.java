package com.hw1.model.vo;

public class Person {
	
	protected String name;
	//상속받은 후손클래스에서 직접 접근 가능
	
	private int age;
	private double height;
	private double weight;
	
	//private 필드는 상속을 통해 자식클래스가
	//부모클래스의 필드를 물려받더라도
	//getter/setter를 이용하여 간접 접근 가능
	
	public Person() {
	}

	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
				name, age, height, weight);
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
