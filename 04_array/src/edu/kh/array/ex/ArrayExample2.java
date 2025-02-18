package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	public void shallowCopy() { //얕은 복사
		int[] arr = { 1, 2, 3, 4, 5 };
		
		//얕은 복사
		int [] copyarr = arr; //주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr 주소" + arr);
		System.out.println("copy 주소" + copyarr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyarr : " + Arrays.toString(copyarr));
		
		//얕은 복사한 배열의 값 변경
		copyarr[2] = 99;
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyarr : " + Arrays.toString(copyarr));
		
		
		
		
	}
	
	public void deepCopy() { //깊은 복사
		int[] arr = {1,2,3,4,5};
		
		//1. for문을 이용한 깊은 복사
		int[] copyarr = new int[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			copyarr[i] = arr[i];
		}
		
		System.out.println("arr 주소값 : " + arr);
		System.out.println("copyarr 주소값 : " + copyarr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyarr : " + Arrays.toString(copyarr));
		System.out.println("===============================");
		
		
		//2. System.arraycopy(원본배열, 원본복사 시작 인덱스,
		//                   복사배열, 복사배열의 삽입시작 인덱스, 복사의 길이)
		
		int[] copyarr2 = new int[arr.length];
		
		System.arraycopy(arr, 0, copyarr2, 0, arr.length);
		
		System.out.println("copyarr2 : " + Arrays.toString(copyarr2));
		
		
		//3. 복사ㅏ할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("===============================");
		System.out.println(Arrays.toString(copyArr3));
		
		//값 변경 후 확인
		copyarr[4] = 0;
		copyarr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("===============================");
		System.out.println("arr" + Arrays.toString(arr));
		System.out.println("copyarr" + Arrays.toString(copyarr));
		System.out.println("copyarr2" + Arrays.toString(copyarr2));
		System.out.println("copyArr" + Arrays.toString(copyArr3));
		
	}

	
	
	//로또 배열 생성기
	//배열을 이용한 중복데이터 제거 + 정렬
	public void createLottoNumber() {
		
		// 1~45 사이 중복되지 않는 난수 6개 생성
		// 생성된 난수 오름차순 정렬
		// [5, 11, 13, 18, 24, 25] 
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2) 생성된 배열(lotto)을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i=0; i<lotto.length; i++) {
			
			// 3) 1~45사이 난수 생성
			int random = (int)(Math.random() * 45 +1); //1~45
			
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;
			
			// 5) 중복 검사를 위한 for문 작성
			for(int x=0; x<i; x++) {
				
				// 6) 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
				if(random == lotto[x]) {
					i--;
					//i가 1씩 증가할 때마다 난수 하나 생성
					// -> 중복값이 있으면 난수를 새로 하나 더 생성
					// -> i값을 인위적으로 1 감소시켜서 난수 발생의 기회를 한번 더 주는 것
					break;
					//앞쪽에서 중복 데이터를 발견하면 남은 것은 비교할 필요없다.
					//->효율 향상을 위해서 중복 검사용 for문 종료
					
					
				}
			}
		}
		
		//정렬은 되어있지 않지만, 중복 제거가 된 배열이 완성됨
		// 7) 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등 ★★★★★★★★
		//-->자바가 정렬 방법을 미리 만들어서 제공하고 있음
		//Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨

		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
}
