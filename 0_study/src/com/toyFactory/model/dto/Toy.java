package com.toyFactory.model.dto;

import java.util.Set;

public class Toy /*implements Comparable*/{
	
	private String name;
	private int price;
	private String color;
	private int age;
	private String year;
	private Set<String> material;
	
	public Toy() {
	}


	
public Toy(String name, int price, String color, int age, String year, Set<String> material) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.year = year;
		this.material = material;
	}



//	@Override
//	public int compareTo(int age) {
//		
//		return 0;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set<String> getMaterial() {
		return material;
	}

	public void setMaterial(Set<String> material) {
		this.material = material;
	}
	
	public String materialprint() {
		StringBuilder sb = new StringBuilder();
		
		if(material.size()==0) {
			return "없음";
		}
		
		for(String s : material) {
			sb.append(material).append(", ");
		}
		
		sb.setLength(sb.length()-2);
		return sb.toString();
	}

	@Override
	public String toString() {
		String str = "이름 : " + name + " / 가격 : "+ price + " / 색상 : " + color + " / 사용가능연령 : " + age + " /  제조년월일 : " + year + " / 재료 : ";
		return str + materialprint();
	}
	
	

}
