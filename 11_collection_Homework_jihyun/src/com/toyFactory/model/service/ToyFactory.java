package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	
		// 필드
		private Scanner sc = new Scanner(System.in); //값을 입력받기 위한 Scanner 객체 생성
		
		
		private Map<Integer, String> map = new HashMap<Integer, String>();
		// 부모타입  참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
		
		Set<Toy> toyset;


		private Object year;
		
		public ToyFactory() {
			
			toyset = new HashSet<>();
			
			
			map.put(1, "면직물");
			map.put(2, "플라스틱");
			map.put(3, "유리");
			map.put(4, "고무");
			
			toyset.add(new Toy("키시미시", 15000, "분홍색", 5, "19940505", "면직물", "플라스틱"));
			toyset.add(new Toy("캣냅", 27000, "보라색", 8, "19960128", "면직물", "플라스틱"));
			toyset.add(new Toy("파피", 57000, "빨간색", 12, "19931225", "고무", "면직물", "플라스틱"));
			toyset.add(new Toy("허기워기", 12000, "파란색", 5, "19940312", "면직물", "플라스틱"));
			toyset.add(new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", "고무", "면직물"));
			
		}
		
		
		// 메서드
		public void displayMenu() {
			
			try { //try catch문 사용, try 코드 수행 중 오류 발생시 catch로 오류 잡기
				
				int menuNum = 0; //원하는 도서 목록 프로그램 번호 받을 변수 선언 및 초기화
				
				do { //do while문, 최소 한번은 실행됨
					System.out.println();
					System.out.println("<<플레이타입 공장>>");
					System.out.println("1. 전체 장난감 조회하기");
					System.out.println("2. 새로운 장난감 만들기");
					System.out.println("3. 장난감 삭제하기");
					System.out.println("4. 장난감 제조일 순으로 조회하기");
					System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
					System.out.println("6. 재료 추가");
					System.out.println("7. 재료 제거");

					System.out.print("선택 : "); //원하는 목록 번호 입력하라는 문구 출력
					
					menuNum = sc.nextInt(); //원하는 번호 int형으로 받기
					System.out.println();
					
					switch(menuNum) {
					case 1 : showToySet(); break; 
					case 2 : System.out.println(addToy());break;
					
					case 3 : System.out.println(deleteToy()); break;
					
					case 4 : showByYear(); break; 
					
					case 5 : showByAge(); break;
					
					case 6 : addMaterial(); break;
					
					case 7 : deleteMaterial();; break;

					case 0 : System.out.println("종료되었습니다."); break; //0. 프로그램 종료 선택 시 프로그램 종료 후 해당 문구 출력
					default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break; //0~8번 외의 다른 문구 입력 시 해당 문구 출력
					}
					
				}while(menuNum != 0); //menuNum이 0이 아닐 동안 계속 실행
				
			} catch (Exception e) {
				// Exception : 예외 클래스의 최상위 클래스
				System.out.println("예외 발생");
				e.printStackTrace(); // 예외추적
			}
			
		}
		
		/** 전체 장난감 조회용 메서드
		 * 
		 * 
		 * 
		 */
		public void showToySet() {
			
			if(toyset.isEmpty()) { 
				System.out.println("장난감이 없습니다. 장난감을 만들어주세요!"); //해당 문구 출력
			} else { //비어있지 않다면
				
				System.out.println("<전체 장난감 목록>");
				
				
				int num=1;
				
				for(Toy temp : toyset) {
					System.out.println(temp);
				}
				
			}
			
		}
		
		/** 새로운 장난감 만들기 메서드
		 * 
		 */
		public String addToy() {
			
			Set<String> mat = new HashSet<>();
			
			System.out.println("<새로운 장난감 추가>");
			
			System.out.print("장난감 이름 : ");
			String name = sc.next();
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
			
			System.out.print("사용 가능 연령 : ");
			int age = sc.nextInt();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("색상 : ");
			String color = sc.next();
			
			System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
			String year = sc.next();
			
			while (true) {

				System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요 : ");
				String material = sc.next();

				if (material.equals("q")) {
					break;
				} else {
					mat.add(material);
					continue;
				}
			}
			toyset.add(new Toy(name, price, color, age, year, mat));
			
			
			return "등록 완료";
			
		}
		


		/** 장난감 삭제용 메서드
		 * @return
		 */
		public String deleteToy() {
			System.out.println("<장난감 삭제>");
			
			showToySet();
			System.out.println();
			System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
			String delete = sc.next();
			
			for(Toy temp : toyset) {
				
				if(temp.getName().equals(delete)) { //순회할 때 입력한 삭제 도서 번호와 순회중인 리스트 도서번호가 일치하다면
					
					System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
					
					char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
					
					if(answer == 'Y') { //Y라면
						toyset.remove(temp); 
						break; //빠져나가기
					} else { //아니라면
						return "삭제를 진행하지 않습니다"; //해당 문구 반환
					}
				}
				
			}
			
			return "장난감이 삭제되었습니다."; 
		}
		
		/** 제조일순 조회용 메서드
		 * 
		 */
		public void showByYear() {
			

			Set<Toy> year = new TreeSet<>();

			for(Toy temp : toyset) {
				year.add(temp);
			}
			
			
			
			System.out.println( year );
		}
		
		/** 연령별 사용가능한 장난감 조회용 메서드
		 * 
		 */

		public void showByAge() {
			
			if(toyset.isEmpty()) {
				System.out.println("장난감이 없습니다. 장난감을 만들어주세요!"); //해당 문구 출력
			} else { //비어있지 않다면
				
				System.out.println("<연령별로 사용 가능한 장난감>");
				
				
				System.out.println("[연령 : 5세]");
				for(Toy temp : toyset) {
					if(temp.getAge()==5) {
						System.out.println(temp);
						
					}
				}
				System.out.println("[연령 : 8세]");
				for(Toy temp : toyset) {
					if(temp.getAge()==8) {
						System.out.println(temp);
					}
				}
				System.out.println("[연령 : 12세]");
				for (Toy temp : toyset) {
					if (temp.getAge() == 12) {
						System.out.println(temp);
					}
				}

			}

		}
		
		/** 재료 추가 메서드
		 * 
		 */
		public void addMaterial() {

			System.out.println("<재료 추가>");
			System.out.println("*** 현재 등록된 재료***");
			System.out.println(map);
			
			System.out.println("**********************");
			System.out.print("재품 고유번호(key) 입력 : ");
			int num = sc.nextInt();
			
			System.out.print("재료명 입력 : ");
			String m = sc.next();
			
			
			if(map.containsKey(num)){
				System.out.println("이미 해당 키에 재료가 등록되어있습니다.");
				System.out.print("덮어쓰시겠습니까?(Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				if(answer == 'Y') { //Y라면
					map.put(num, m);
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				} else { //아니라면
					System.out.println("재료를 추가하지 않습니다.");
				}
			} else {
				map.put(num, m);
				System.out.println(map);
				System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
			}
		}
			
			
		
		
		/**재료 제거용 메서드
		 * 
		 */
		public void deleteMaterial() {

			System.out.println("<재료 삭제>");

			System.out.println("*** 현재 등록된 재료***");
			System.out.println(map);

			System.out.print("삭제할 재료명 입력 : ");
			String m = sc.next();

				for (Entry<Integer, String> entry : map.entrySet()) {
					if (entry.getValue().equals(m)) {
						map.remove(entry.getKey()); // 해당 key를 이용해 map에서 제거
						System.out.println(map);
						System.out.println("재료 '" + m + "'이(가) 성공적으로 제거되었습니다.");
					} else {
						System.out.println("해당 이름이 재료가 존재하지 않습니다.");
					}

				}

		}
}