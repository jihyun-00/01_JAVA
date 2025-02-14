package edu.kh.control.loop;
import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void ex2() {
		//영어 A~Z까지 한줄로 출력
		
		for(int i = 'A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println("\n===========================");
		
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i);
		}
	}
	
	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++)
			if (i % 10 == 0) {
				System.out.print(i + " ");
				System.out.println();
			} else {
				System.out.print(i + " ");
			}
	}
	
	public void ex4() {
		//정수 5개를 입력받아 합계구하기
		
		//입력1 : 10
		//입력2 : 20
		//입력3 : 30
		//입력4 : 40
		//입력5 : 50
		//합계 : 150
		
		int sum=0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("입력" + i + " : ");
			int num = sc.nextInt();
			sum+=num;
		} 
		System.out.println("합계 : " + sum);

	}

	public void ex5() {
		//1~20까지 1씩 증가하면서 출력
		
		//입력받은 수의 배수는 양쪽에 ()표시
		
		//괄호를 표시할 배수 : 3
		//1 2 (3) 4 5 (6) 7 8 (9) ... 20
		
		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		
		for(int i=1; i<=20; i++) {
			if(i%input==0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

	public void ex6() {
		// 2~9 사이 수를 하나 입력 받아
		// 해당 단을 출력
		// 입력받은 수가 2~9사이 숫자가 아니라면
		// "잘못 입력하셨습니다." 출력

		// 단 입력 : 5
		// 5*1=5
		// 5*2=10
		// 5*3=15
		// ...
		// 5*9=45
		// ==========
		// 단 입력 : -5
		// 잘못..

		System.out.print("단 입력 : ");
		int input = sc.nextInt();

		if (input >= 2 && input <= 9) {
			for (int i = 1; i <= 9; i++) {
			System.out.println(input + " * " + i + " = " + input * i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void ex7() {
		//1~20까지 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//배수 입력 : 3
		//3 6 9 12 15 18 : 6개
		//3의 배수 합계 : 63
		
		//힌트 : count, sum, result
		
		int sum=0;
		int count = 0;
		
		System.out.print("배수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=20; i++) {
			if(i%num==0) {
				sum+=i;
				System.out.print(i + " ");
				count +=1;
			}
		}
		System.out.println(": " + count + "개");
		System.out.print( num+ "의 배수 합계 : " + sum);
	}
	
	public void ex8() {
		// 구구단 모두 출력

		for (int dan = 2; dan <= 9; dan++) {

			for (int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d =%2d  |  ", dan, num, dan * num);
			}
			System.out.println();
		}

		System.out.println("===============================================");

		// 구구단 역순 출력
		// 곱해지는 수는 정방향

		for (int dan = 9; dan >= 2; dan--) {

			for (int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d =%2d  |  ", dan, num, dan * num);
			}
			System.out.println();
		}

	}
}
