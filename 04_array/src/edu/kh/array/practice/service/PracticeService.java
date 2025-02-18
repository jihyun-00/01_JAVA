package edu.kh.array.practice.service;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			if (x % 2 == 0) {
				sum += arr[x];
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("짝수번째 인덱스 합 : " + sum);

	}

	public void practice2() {

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}

		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			if (x % 2 == 1) {
				sum += arr[x];
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("홀수번째 인덱스 합 : " + sum);

	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력" + i + " : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x]==search) {
				System.out.println("인덱스 : " + x);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void practice5() {
		
		int count = 0; //i의 개수
		
		
		System.out.print("문자열 : ");
		String text = sc.nextLine();
		
		char[] arr = new char[text.length()];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print(text + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int x=0; x<text.length(); x++) {
			if(arr[x]==ch) {
				System.out.print(x + " ");
				count ++;
			}
		}
		System.out.println();
		System.out.print(ch + " 개수 : " + count);
		
	}
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arr[i] = input;
			sum +=input;
		}
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		
		
		System.out.print("주민등록번호(-포함) : ");
		String include = sc.nextLine();
		
		char[] num = new char[include.length()];
		
		for(int i=0; i<num.length; i++) {
			num[i] = include.charAt(i);
		}
		for(int x=0; x<num.length; x++) {
			if(x<8) {
				System.out.print(num[x]);
			} else {
				System.out.print("*");
			}
			
		}
	}
	
	public void practice8() {

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {

				int[] arr = new int[num];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = i + 1;
					if (i > num / 2) {
						for (int x = 0; x < arr.length; x++) {
							arr[i] = arr[i - 1] - 1;
						}
					}
					
					if(i==num-1) {
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");						
					}
				}

				break;
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}

	}
	
	public void practice910() {

		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	
	public void practice11() {          
		
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);
			arr[i] =random;

			for (int x = 0; x < i; x++) {
				if (random == arr[x]) {
					i--;
					break;
				}
			}
		}
		for(int q=0; q<arr.length; q++) {
			System.out.print(arr[q] + " ");
		}
	}
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			for(int x=0; x<i; x++) {
				if(lotto[x]==random) {
					i--;
					break;
				}
			
			}
		}
		Arrays.sort(lotto);
		for(int y=0; y<6; y++) {
		System.out.print(lotto[y] + " ");
		}
		
		
	}
	
	public void practice13() {
		
		//1. 사용자에게 문자열 입력받기
		System.out.print("문자열  : ");
		String str = sc.nextLine();		
		
		//2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		//3. char 배열에서 중복값 존재할 경우 출력 x
		int count = 0; //문자 개수 세기용
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			boolean flag = true; //중복 체크용 flag 변수
			
			// 중복값이 있는지 검사하는 for
			for(int j=0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false; //중복이 발생했을 때
					break;
				}
			}
			
			if(flag) { //중복이 발생하지 않았을 경우
				
				//if문
				if( i ==0 ) { //첫번째 글자
					System.out.print(arr[i]);
				}else { // 0번 인덱스가 아닌 글자
					System.out.print(", " + arr[i]);
				}
				
				count++; //중복 아닐 때만 count 개수 늘리기
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);

	}
	
	public void practice14() {

		// 1. 첫 배열의 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거

		String[] arr = new String[size];

		// 2. 첫 배열의 저장할 문자열 입력 받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;

		while (true) {
			System.out.print("더 값을 입력하겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);

			// 4. 값을 더 입력할 경우
			if (ch == 'y' || ch == 'Y') {

				// 5. 더 입력받을 개수 입력받기
				System.out.println("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거

				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newarr = new String[arr.length + add];

				// 7. 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < newarr.length; i++) {

					if (i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우(깊은 복사)
						newarr[i] = arr[i]; // 기존 배열 요소값 복사

					} else { // 인덱스의 크기가 기존 배열보다 클 경우(새로운 값 입력받기)
						System.out.println((i + 1) + "번째 문자열 : ");
						newarr[i] = sc.nextLine();
					}
				}

				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newarr 대입(얕은 복사)
				// 더 입력? y
				// 위 코드를 반복할 때 기존 배열인 arr의 길이를 기준으로 새 배열(newarr)의 할당하기 때문에
				arr = newarr;

			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}

		}

		//10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
	}
}

