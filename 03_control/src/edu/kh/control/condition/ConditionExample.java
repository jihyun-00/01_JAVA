package edu.kh.control.condition;
import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in); //필드
	
	//생성자
	
	
	//메서드
	public void ex1() {
		
		//if문
		//조건식이 true일 때만
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다." 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input>0) {
			System.out.println("양수입니다.");
		}
		
		if(input<=0) {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void ex2() {

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input % 2 == 1) {
			System.out.println("홀수입니다.");
		} else if (input == 0) {
			System.out.println("0입니다.");
		} else // if(input%2==0) {
			System.out.println("짝수입니다.");
	}
	
	public void ex3() {
		//if else 양수 정수 0 판별
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다.");
		} else if (input < 0) {
			System.out.println("음수입니다.");
		} else
			System.out.println("0입니다.");
	}
	
	public void ex4() {
		
		//달에 따른 계절 판별
		//겨울 12~2월  -15 이하 :"한파 경보"  -12이하 : "한파주의보"
		//여름 6~8월  35도 이상 : "폭염 경보"  33도 이상 : "폭염주의보"
		//1~12가 아닐 땐 "해당하는 계절이 없습니다."
		
		System.out.print("달 입력 : ");
		int mon = sc.nextInt();
		
		String season;
		
		if( (mon==1) || (mon==2) || (mon==12) ) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			double tem = sc.nextDouble();
			
			
			if(tem<=-15) {
				season +="한파경보";
				
			} else if(tem<=-12) {
				season +="한파주의보";
			}
			System.out.println(season);
			
		} else if ( (mon>=3) && (mon<=5)) {
			season="봄";
			System.out.println(season + "입니다.");
			
		} else if( (mon>=6) && (mon<=8)) {
			season="여름";
			
			System.out.print("온도 입력 : ");
			double tem1 = sc.nextDouble();
			
			if(tem1>=35) {
				season +="폭염경보";
				
			} else if (tem1>=33) {
				season +="폭염주의보";
			}
			System.out.println(season);
			
		} else if ((mon >= 9) && (mon <= 11)) {
			season = "가을";
			System.out.println(season + "입니다.");
			
			
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

	public void ex5() {
		
		//나이 입력받아 13세 이하면 "어린이입니다."
		//13세초과 19세이하면 "청소년입니다."
		//19세 초과시 "성인입니다."
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if (age <= 13)
			result = "어린이입니다.";
		else if (age <= 19)
			result ="청소년입니다.";
		else
			result ="성인입니다.";
		
		System.out.println(result);
	}
	
	public void ex6() {
		//90이상 :A
		//80이상 90미만 : B
		//70이상 80미만 : C
		//60점이상 70미만 : D
		//60미만 : F
		//0점 미만, 100점 초과 : "잘못 입력"
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String result;
		
		if ((score < 0) || (score > 100)) {
			result = "잘못 입력하셨습니다.";
		} else if (score >= 90) {
			result = "A";
		} else if ((score >= 80) && (score < 90)) {
			result = "B";
		} else if ((score >= 70) && (score < 80)) {
			result = "C";
		} else if ((score >= 60) && (score < 70)) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}
	
	public void ex7() {
		//놀이기구 탑승 제한 검사
		//나이 12이상, 키140이상 "탑승 가능"
		//나이 12미만 "적정 연령이 아닙니다."
		//키 140.0미만 "적정 키가 아닙니다ㅣ."
		//나이 0미만, 120초과 "잘못 입력하셨습니다."
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		
		
		if ((age < 0) || (age > 120)) {
			result = "잘못 입력하셨습니다.";
		} else {
			System.out.print("키 입력 : ");
			double h = sc.nextDouble();
			
			if ((age >= 12) && (h >= 140.0)) {
				result = "탑승 가능";
			} else if ((age < 12)) {
				result = "적정 연령이 아닙니다";
			} else {
				result = "적정 키가 아닙니다.";
			}
			
		}
		System.out.println(result);	
	}
	
	public void ex8() {

		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		String result="";

		if ((age < 0) || (age > 120)) {
			result = "잘못 입력하셨습니다.";
		} else {
			System.out.print("키 입력 : ");
			double h = sc.nextDouble();

			if ((h < 0) || (h > 250.0)) {
				result = "키를 잘못 입력하셨습니다.";
			} else {
				if ((age >= 12) && (h >= 140)) {
					result = "탑승 가능!";
					
				} else if ((age >= 12) && (h < 140)) {
					result = "나이는 적절하나, 키가 적절하지 않음";
					
				} else if ((age < 12) && (h >= 140)) {
					result = "키는 적절하나, 나이는 적절치 않음";
					
				} else if ((age < 12) && (h < 140)) {
					result = "나이와 키 모두 적절치 않음";
				}
			}
		}
		System.out.println(result);
	}
	
	public void ex9() {
		//switch
		
		//요일 번호 입력(1~7) : 3
		//수요일
		
		System.out.print("요일 번호 입력(1~7) : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		case 7 : System.out.println("일요일"); break;
		default : System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void ex10() {
		
		//점수 입력(0~100) : 85
		//학점 B
		
		System.out.print("점수 입력(0~100) : ");
		//점수 범위 벗어난건 생각 안함
		
		int scr = sc.nextInt();
		
		switch(scr/10) { //점수를 10으로 나눈 몫을 기준으로 학점 구분
		case 10 : 
		case 9 : System.out.println("학점 : A"); break;
		case 8 : System.out.println("학점 : B"); break;
		case 7 : System.out.println("학점 : C"); break;
		case 6 : System.out.println("학점 : D"); break;
		default : System.out.println("학점 : F");
		}
		
	}


}
