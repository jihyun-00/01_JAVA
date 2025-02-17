package edu.kh.control.practice;
import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice01() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");

			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice02() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; 1 <= i; i--) {
				System.out.print(i + " ");

			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice03() {

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;

			if (i == num) {
				System.out.print(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}

		}
	}

	public void practice04() {

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public void practice05() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.printf("==== %d단 ====\n", num);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void practice06() {

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {

			for (int i = num; i <= 9; i++) {
				System.out.printf("==== %d단 ====\n", i);
				for (int a = 1; a <= 9; a++) {
					System.out.printf("%d * %d = %d\n", num, a, num * a);
				}
			}
		}
	}

	public void practice07() { // 공부하기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice08() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice09() { // 공부하기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int k = num - 1; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();

		}

	}

	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void practice11() {      //공부하기

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int k = num - 1; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2*i-1; j++) {
				System.out.printf("*");
			}
			System.out.println();

		}


	}
	
	public void practice12() {      //if 활용해서 풀어보기

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int a = 1; a <= num; a++) {
			System.out.print("*");
		}
		
		
		System.out.println();
		
		for (int b = 1; b <= num - 2; b++) {
			System.out.print("*");

			for (int c = 1; c <= num - 2; c++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		
		for (int a = 1; a <= num; a++) {
			System.out.print("*");
		}

	}
	
	public void practice13() {

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.printf("count : %d", count);

	}

}
	
