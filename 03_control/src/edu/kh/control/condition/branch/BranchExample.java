package edu.kh.control.condition.branch;
import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);

	//1~10까지 1씩 증가하며 출력
	//5를 출력하면 반복문 종료
	// 1 2 3 4 5
	
	public void ex1() {
		
		for (int i = 1; 1 <= 10; i++) {
			
			System.out.println(i + " ");
			
			if (i == 5) {
				break;
			}
			

		}
	}
	
	public void ex2() {
		//입력받은 모든 문자열 누적
		//단 "exit@" 입력 시 문자열 누적을 종료하고 결과 출력
		
		String str = "";
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			//자바에서 문자열(String) 비교는 == 연산자 사용 불가!
			//비교연산자(==)는 보통 기본자료형끼리의 연산에서만 가용 가능
			//String은 기본 자료형이 아닌 참조형
			
			
			
			//문자형1.equals(문자열2)
			
			if(input.equals("exit@")) {
				break;
			}
			str +=input + "\n";
			
		}
		
		System.out.println("========================");
		System.out.println(str);
		
	}
	
	public void ex3() {
		//continue : 다음 반복으로 넘어감
		//1~10까지 1씩 증가
		//단 3의 배수는 제외
		
		//1 2 4 5 7 8 10
		
		for(int i=1; i<=10; i++) {
			
			if(i%3==0) {
				continue;
			}
			
			System.out.print(i + " ");
			
		}
	}
	
	public void ex4() {
		// 1~100까지 1씩 증가하며 출력
		// 단 5의 배수 건너뛰고
		// 증가하는 값이 40이 되엇을 때 멈춤
		// 1
		// 2
		// 3
		// ...
		// 39

		for (int i = 1; i <= 100; i++) {
			if (i == 40) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);

		}
	}
	
	public void ex5() {
		//가위바위보 게임
		//몇판 입력받기
		//입력받은 판수만큼 반복
		
		//컴퓨터 : Math.random()
		//1~3 사이 난수 생성
		
		//1이면 가위, 2이면 바위, 3이면 보 지정
		//컴퓨터와 플레이어 가위바위보 판별
		//플레이어 승! / 졌습니다. // 비겼습니다.
		//매판마다 - 현재기록 : 2승 1무 0패
		
		System.out.println("[가위바위보 게임~!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		//승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose =0;
		
		for(int i=1; i<=round; i++) {
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1 ); //1이상 4미만 정수
			
			//스위치로 랜덤값을 문자열로 바꾸기
			String com = null;
			
			switch(random) {
			case 1 : com="가위" ; break;
			case 2 : com="바위" ; break;
			case 3 : com="보" ; break;
			
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			//컴퓨터와 플레이어 가위바위보 판별
			//비긴경우
			if(input.equals(com)) {
			
				System.out.println("비겼습니다.");
				draw++;
				
			} else { //이기거나 진 경우
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다.");
					lose++;
				}
			}
			
			 System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw,lose);
		}
	}
	
	public void game2() {
		System.out.println("[가위바위보 게임~!");
		System.out.print("몇 판? ");
		int round = sc.nextInt();
		sc.nextLine();
		
		int win=0;
		int draw=0;
		int lose=0;
		
		for(int i=1; i<=round; i++) {
			int computer = (int)(Math.random()*3+1);
			
			 System.out.println();
			System.out.println(i + "번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String answer = sc.nextLine();
			
			
			if(computer==1) {
				System.out.println("컴퓨터는 [가위]를 선택했습니다.");
			} else if(computer==2) {
				System.out.println("컴퓨터는 [바위]를 선택했습니다.");
			} else if(computer==3) {
				System.out.println("컴퓨터는 [보]를 선택했습니다.");
			}
			
			// 이긴 경우
			if(answer.equals("가위") && computer==3) {
				System.out.println("이겼습니다.");
				win++;
			}
			if(answer.equals("바위") && computer==1) {
				System.out.println("이겼습니다.");
				win++;
			}
			if(answer.equals("보") && computer==2) {
				System.out.println("이겼습니다.");
				win++;
			}
			//비긴 경우
			if(answer.equals("가위") && computer==1) {
				System.out.println("비겼습니다.");
				draw++;
			}
			if(answer.equals("바위") && computer==2) {
				System.out.println("비겼습니다.");
				draw++;
			}
			if(answer.equals("보") && computer==3) {
				System.out.println("비겼습니다.");
				draw++;
			}
			//진 겨우
			if(answer.equals("가위") && computer==2) {
				System.out.println("졌습니다.");
				lose++;
			}
			if(answer.equals("바위") && computer==3) {
				System.out.println("졌습니다.");
				lose++;
			}
			if(answer.equals("보") && computer==1) {
				System.out.println("졌습니다.");
				lose++;
			}
			
			System.out.println("현재 기록 : " + win + "승" + draw + "무" + lose + "패");
		}
	}
	

		
}
