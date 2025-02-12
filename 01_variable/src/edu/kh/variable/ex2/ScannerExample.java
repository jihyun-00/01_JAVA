package edu.kh.variable.ex2;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); //정수를 입력받는 것
		//스캐너를 통해 입력받은 정수를 input1 변수에 대입
		
//		System.out.println(input1);
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);

	}

}
