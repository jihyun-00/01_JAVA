package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {

		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println();
		
		System.out.print("테스트4");
		
		System.out.println(); //줄바꿈
		
		int iNum1=10;
		int iNum2=5;
		
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));
		
		System.out.printf("%d+%d=%d\n", iNum1,iNum2,iNum1+iNum2);
		System.out.printf("\\\n");
		
		//10+10*5/2=35
		System.out.printf("%d+%d*%d/%d=%d\n", iNum1, iNum1, iNum2, 2, iNum1+iNum1*iNum2/2);
		
		//패턴연습
		int iNum3 = 3;
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);  //5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5d안녕\n", iNum3);  //5칸 확보 후 왼쪽 정렬
		
		//반올림
		System.out.printf("%.2f\n", 10/4.0);
		
		//문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요."; //참조형
		
		// false / 가 / 안녕하세요.
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		// \
		System.out.printf("\\\n");
		System.out.println("\\");
		System.out.println("\\0/");
		
		//\t
		System.out.println("a\tb\tc\t");
		
		//유니코드
		System.out.println("\u0041");
		//65를 16진수로 표현
		//65나누기15 몫 4 나머지1 -> 0041
		
		
		
		
		
	}

}
