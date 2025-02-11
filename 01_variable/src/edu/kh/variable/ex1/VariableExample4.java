package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {

		double temp = 3.14;
		int num = (int)temp;
		System.out.println(num);
		System.out.println(temp);
		
		//int->byte
		int iNum=290;
		byte bNum=(byte)iNum;
		System.out.println(bNum);
		System.out.println(iNum);
		
		//char -> int 강제 형변환
		char ch = 'A';
		System.out.println((int)ch);
		
		//int->char 강제형변환
		int a=44085;
		System.out.println((char)a);
		
		//오버플로우 현상은 컴퓨터가 미리 예측 불가! -> 개발자가 미리 예측해야 함
		int i6=2147483647; //int의 최대값
		int result2=i6+1;
		System.out.println(result2);
	}

}
