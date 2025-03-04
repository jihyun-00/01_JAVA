package com.toyFactory.model.dto;

public class Toy {
	
	private String Name;
	private int price;
	private String color;
	private int age;
	private String year;
	private String material;
	
	public Toy() {}

	public Toy(String name, int price, String color, int age, String year, String material) {
		super();
		Name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.year = year;
		this.material = material;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s",
				Name, price, color, age, year, material);
	}
	
	

}
