package edu.kh.generics;

public class Run {
	
	public static void main(String[] args) {
		// String 타입으로 Box 객체 생성
		Box<String> stringBox = new Box<>();
		// T가 String으로 대체됨
		// -> 필드도 String 타입, 
		//getter/setter에서 사용하는 타입도 String
		stringBox.setItem("안녕 제네릭?");
		System.out.println(stringBox.getItem());
		
		Box<Integer> intBox = new Box<>();
		
		intBox.setItem(5);
		System.out.println(intBox.getItem());
		
		// 제네릭은 객체(Reference Type)만 허용
		// -> 제네릭은 기본자료형(primitive type)인 int, double, char 같은
		//	  타입은 사용할 수 없다
		// -> 대신 Wrapper 클래스를 사용
		/*
		 * byte Byte
		 * short Short
		 * int Integer
		 * long Long
		 * float Float
		 * double Double
		 * char Character
		 * boolean Boolean
		 * 
		 */
		int num = 10;
		Integer num1 = num; // 오토박싱(Auto-Boxing) : 기본형->래퍼클래스 자동변환
		
		int num2 = num1; //오토언박싱(Auto-unBoxing) : 래퍼클래스 -> 기본형 자동변환
		
		int number = Integer.parseInt("100");
		
		
	}

}
