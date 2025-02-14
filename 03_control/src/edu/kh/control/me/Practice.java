package edu.kh.control.me;
import java.util.Scanner;

public class Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		String result = "";
		
		System.out.print("소프트웨어 설계 : ");
		int a = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int b = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		int c = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용 : ");
		int d = sc.nextInt();
		
		System.out.print("벙보시스템 구축 관리 : ");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		
		if( a<8 || b<8 || c<8 || d<8 || e <8) {
			result = "불합격입니다.";
		} else if(sum>=60) {
			result = "합격입니다.";
		} else {
			result = "불합격입니다.";
		}
		System.out.println(result);
	}
	
	public void practice2() {

		System.out.print("금액을 입력하세요 : ");
		int price = sc.nextInt();

		if (price > 0) {
			System.out.println("메뉴를 고르세요.");
			System.out.println("1.아우터(700원)");
			System.out.println("2.이구동성(1000원)");
			System.out.println("3.에그몽(500원)");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				if (price < 700) {
					System.out.println("돈이 부족해요");
					System.out.print("잔돈 : " + price + "원");
					break;
				} else {
					int a = price - 700; // price -=price
					int ten1 = a / 1000;
					int five1 = a % 1000 / 500;
					int zero1 = a % 1000 % 500 / 100;

					System.out.println("잔돈 : " + a + "원");
					System.out.println("천원 : " + ten1 + "개");
					System.out.println("오백원 : " + five1 + "개");
					System.out.println("백원 : " + zero1 + "개");
					break;
				}
			case 2:
				if (price < 1000) {
					System.out.println("돈이 부족해요");
					System.out.print("잔돈 : " + price + "원");
					break;
				} else {
					int b = price - 1000;
					int ten2 = b / 1000;
					int five2 = b % 1000 / 500;
					int zero2 = b % 1000 % 500 / 100;

					System.out.println("잔돈 : " + b + "원");
					System.out.println("천원 : " + ten2 + "개");
					System.out.println("오백원 : " + five2 + "개");
					System.out.println("백원 : " + zero2 + "개");
					break;
				}
			case 3:
				if (price < 500) {
					System.out.println("돈이 부족해요");
					System.out.print("잔돈 : " + price + "원");
					break;
				} else {
					int c = price - 500;
					int ten3 = c / 1000;
					int five3 = c % 1000 / 500;
					int zero3 = c % 1000 % 500 / 100;

					System.out.println("잔돈 : " + c + "원");
					System.out.println("천원 : " + ten3 + "개");
					System.out.println("오백원 : " + five3 + "개");
					System.out.println("백원 : " + zero3 + "개");
					break;
				}
			default:
				System.out.println("잘못 입력한 값입니다.");

			}

		} else {
			System.out.println("잘못 입력한 값입니다.");
		}

	}
}
