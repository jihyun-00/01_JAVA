package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice2 {
	
	public void practice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		String result1 = age>=20 ? "저는 성인입니다." : "저는 미성년입니다.";
		System.out.println(result1);
		
		String result2 = ( (age>=13) && (age<=19) ) ? "true" : "false";
		System.out.printf("청소년입니까? %s\n", result2);
		
		String result3 = ( (age>=65) || (age<=12) ) ? "true" : "false";
		System.out.printf("노인이거나 어린이입니까? %s\n", result3);
		
		
	}

}
