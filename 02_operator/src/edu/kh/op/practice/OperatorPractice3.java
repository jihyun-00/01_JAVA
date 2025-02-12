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
		
		double result = member=="true" ? (price*0.90) : (price*0.95);
		System.out.printf("할인을 포함한 최종 금액 : %.1f원", result);
		
	}

}
