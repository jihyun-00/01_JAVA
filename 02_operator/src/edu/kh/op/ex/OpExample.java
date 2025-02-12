package edu.kh.op.ex;
import java.util.Scanner;

//예제 코드 작성용 클래스(기능용/메서드용)
public class OpExample {
	
	//ex1() method : OpExample 클래스에 포함된 메서드
	public void ex1() {

		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		//전위 연산
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		
		//후위 연산
		int temp2 = 3;
		System.out.println(temp2-- + 2);
		
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		System.out.printf("%d, %d, %d", a, b, c);
		                  //4  4  7
	}
	
	
	public void ex2() {
		//비교연산자 : >, <, >=, <=, ==, !=
		//- 비교연산자의 결과는 항상 논리값(true, false)
		
		int a = 10;
		int b = 20;
		
		System.out.println( (a == b) == false);
		
		int c = 4;
		int d = 5;
		
		System.out.println( (++c != d ) == (--c != d) );
		                   // false    ==  true -> false
		
		System.out.println(100 > 99);
		System.out.println(100 >= 100);
		System.out.println(99 < 64);
	}
	
	public void ex3() {		
		//논리연산자 : &&(AND), ||(OR)
		
		int a = 101;
		//a는 100 이상이면서 짝수인가?
		System.out.println( (a >=100) && (a%2 == 0));
		
		int b = 5;
		//b는 1~10 숫자에 포함?
		//1~10->b는 1보다 크거나 같으면서, 10보다 작거나 같다
		
		System.out.println( (b >=1) && (b<=10) );
		
		int c = 10;
		
		//c는 10을 초과하거나 짝수?
		
		System.out.println( (c>10) || (c%2==0));
	}
	
	public void ex4() {
		int num = 30;
		//num이 30보다 크면 "num은 30보다 큰 수이다."
		//아니면 "num은 30이하의 수이다" 출력
		
		String result = num>30 ? "num은 30보다 큰 수이다." : "num은 30이하의 수이다.";
		System.out.println(result);
		
		//입력받은 정수가 음수 양수인지 구분
		//단, 0은 양수 처리
		
		//Scanner 생성
		
		// 정수 입력 : 4
		//양수입니다.
		
		//정수 입력 : -5
		//음수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result2 = input<0 ? "음수입니다." : "양수입니다.";	
		System.out.println(result2);
	}

}
