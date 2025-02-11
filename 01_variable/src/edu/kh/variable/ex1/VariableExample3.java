package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {

		
		//형변환(Casting) : 값의 자료형을 변환하는 것(단, boolean 제외)
		
		
		int num1=10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1+num2));
		
		//int->long 형변환
		int i2=2_100_000_000; //21억
		long l2 = 10000000000L; //100억
		
		long result = i2 + l2;
		System.out.println(result);
		
		//char -> int 형변환
		//char 자료형은 문자형이지만 실제 저장하는 값은 정수형
		
		char ch3 = 'V';
		int i3=ch3;
		System.out.println(i3);
		
		char ch4='각';
		int i4=ch4;
		System.out.println(i4);
		
	}

}
