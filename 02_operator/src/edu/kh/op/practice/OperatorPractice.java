package edu.kh.op.practice;
import java.util.Scanner;

//기능제공형 클래스
public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", candy/person);
		System.out.printf("남은 사탕 개수 : %d\n", candy%person);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만): ");
		int clss = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(남학생/여학생) : ");
		String s = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, clss, num, name, s, score);
		
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korea = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		double avg = (korea + english + math)/3.0;
		
		System.out.printf("합계 : %d\n", korea + english + math);
		System.out.printf("평균 : %.1f\n", avg);
		
		//각 과목이 40점 이상, 평균 60점 이상이어야 합격
		//그 외는 불합격 출력
		
		boolean result = (korea >=40) && (english>=40) && (math>=40) && (avg>=60);
		
		System.out.println(result  ? "합격입니다." : "불합격입니다.");
		
	}
}
