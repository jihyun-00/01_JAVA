package edu.kh.variable.ex2;
import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		//nextInt() 사용 후 nextLine() 사용시 문제점
		System.out.print("nextInt() 입력 : ");
		int iNum = sc.nextInt(); //정수값 입력 -> 정수값과 엔터(\n)가 입력버퍼에 들어감
		//->nextInt()는 정수값만을 수집 -> 입력버퍼에는 \n만 남은 상태
		
		sc.nextLine();
		
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine();
		
	}

}
