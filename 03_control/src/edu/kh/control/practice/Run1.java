package edu.kh.control.practice;
import java.util.Scanner;

public class Run1 {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		String result = "";

		if (num <= 0) {
			result = "양수만 입력해주세요.";
		} else if (num % 2 != 0) {
			result = "홀수입니다.";
		} else if (num > 0 && num % 2 == 0) {
			result = "짝수입니다.";
		}

		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math  = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		String result="";
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if( kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			result = "축하합니다, 합격입니다!";
		} else {
			result = "불합격입니다.";
		}
		System.out.println(result);
		
	}
	
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.printf("%d월은 31일까지 있습니다.", num); break;
		case 2 : System.out.printf("%d월은 28일까지 있습니다.", num); break;
		case 4 : case 6 : case 9 : case 11 : 
			System.out.printf("%d월은 30일까지 있습니다.", num); break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.", num);
		}
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double bmi = kg / (m * m);
		String result = "";

		if (m < 0 || kg < 0) {
			result = "잘못 입력된 값입니다.";
		} else {
			if (bmi < 18.5) {
				result = "저체중";
				result = "정상체중";
			} else if (bmi >= 23 && bmi < 25) {
				result = "과체중";
			} else if (bmi >= 24 && bmi < 30) {
				result = "비만";
			} else {
				result = "고도 비만";
			}
			System.out.println("BMI 지수 : " + bmi);
		}
		System.out.println(result);
	}
	
	public void practice5() {
		System.out.print("중간고사 점수 : ");
		double middle = sc.nextDouble();

		System.out.print("기말고사 점수 : ");
		double last = sc.nextDouble();

		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble();

		System.out.print("출석 횟수 : ");
		double lazy = sc.nextDouble();

		System.out.println("=======결과======");

		String result = "";

		double score = middle * 0.2 + last * 0.3 + hw * 0.3 + lazy;

		if (lazy<=20*0.7) {
			result = "Fail[출석 횟수 부족(" + (int)lazy + "/20)]";

		} else {
			System.out.println("중간 고사 점수(20) : " + middle * 0.2);
			System.out.println("기말 고사 점수(30) : " + last * 0.3);
			System.out.println("과제 점수(30) : " + hw * 0.3);
			System.out.println("출석 점수(20) : " + lazy * 1.0);

			System.out.println("총점 : " + score);
			
			if (score >= 70) {
				result = "Pass";

			} else if (score < 70) {
				result = "Fail[점수 미달]";
			}
		}
		System.out.println(result);

	}
}
