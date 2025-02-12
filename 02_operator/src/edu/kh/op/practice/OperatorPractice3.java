package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("멤버십 있으세요?(있으면 true / 없으면 false 입력) : ");
		String member = sc.nextLine();
		
		double result = member=="false" ? (price*0.90) : (price*0.95);
		System.out.printf("할인을 포함한 최종 금액 : %.1f원", result);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int priceatm = sc.nextInt();
		
		System.out.printf("50000원 : %d\n10000원 : %d\n5000원 : %d\n1000원 : %d\n", 
				priceatm/50000, priceatm%50000/10000, priceatm%50000%10000/5000, priceatm%50000%10000%5000/1000);
		
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		String result0 = num1%num2==0 ? "배수입니다." : "배수가 아닙니다.";
		System.out.printf(result0);
		
	}
}
