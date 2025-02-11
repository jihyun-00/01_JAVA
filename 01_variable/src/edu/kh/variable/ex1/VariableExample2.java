package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		boolean booleanData; //변수 선언
		//메모리에 논리값을 저장할 공간을 1바이트 할당
		//할당된 공간의 이름을 booleanData라고 정하겠다.
		
		booleanData=true; //변수값 대입
		
		System.out.println("booleanData : " + booleanData);
		
		
		byte bNum = 127; //범위가 -128~127이므로 128넣으면 오류
		//선언된 bNum 변수에 처음으로 초기값 127 넣음
		// -->초기화 : 처음 변수에 값을 대입
		
		short sNum = 32767;
		
		//정수 자료형 기본형 ! int
		int iNum = 2147483647;
	   //자료형 변수명 대입연산자 리터럴
		
		long lNum = 10000000000L;
		//100억이라는 값은 int 범위 밖->리터럴 자체를 int로 인식
		
		float fNum = 1.2345f; //double로 인식 ->타입 미스매치
		double dNum = 3.141592;
		
		//문자형(char) 리터럴 표기법 : ''(홑따옴표) ->문자하나
		char ch ='A';
		char ch2=66;
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		//변수 명명 규칙
		//1
		int abcdefg123456789;
		int abcdefG123456789;
		
		//2
		//double final;
		
		//3
		//char 1abc;
		char a1bc;
		
		//6
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		// ---------------------------------------
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 2.33;
		System.out.println(PI_VALUE);
		
		final int MIN_AGE =1;
		
		System.out.println(1+1.3);
		

	}

}
