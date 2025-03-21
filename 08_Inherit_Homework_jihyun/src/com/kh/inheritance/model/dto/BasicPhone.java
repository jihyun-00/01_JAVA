package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	private boolean hasPhysicalKeyboard = true;
	
	public BasicPhone() {
	}

	
	
	public void checkKeyboard() {
		if(hasPhysicalKeyboard=true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	

}
