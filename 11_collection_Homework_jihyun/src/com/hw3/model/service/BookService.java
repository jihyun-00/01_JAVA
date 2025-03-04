package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;


public class BookService {
	
	// 필드
	private Scanner sc = new Scanner(System.in); //값을 입력받기 위한 Scanner 객체 생성
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	// 부모타입  참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List 
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		// BookService 객체가 생성될 때 library List에 5개 도서 등록
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베개", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
		
	}
	
	
	// 메서드
	public void displayMenu() {
		
		try { //try catch문 사용, try 코드 수행 중 오류 발생시 catch로 오류 잡기
			
			int menuNum = 0; //원하는 도서 목록 프로그램 번호 받을 변수 선언 및 초기화
			
			do { //do while문, 최소 한번은 실행됨
				System.out.println("===도서 목록 프로그램===");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴를 입력하세요 : "); //원하는 목록 번호 입력하라는 문구 출력
				
				menuNum = sc.nextInt(); //원하는 번호 int형으로 받기
				
				switch(menuNum) { //munuNum 번호에 따라 그에 맞는 메서드를 수행하기 위해 switch문 사용
				case 1 : System.out.println(addBook()); break; //1. 도서등록 선택시 addBook() 메서드 실행
				case 2 : showBookList(library); break; //2. 도서조회 선택시 showBookList(library); 메서드 실행
				
				case 3 : System.out.println(editBook()); break; //3. 도서수정 선택 시 editBook() 메서드 실행 
				
				case 4 : System.out.println(deleteBook()); break; //4. 도서삭제 선택 시 deleteBook() 메서드 실행
				
				case 5 : addFavorite(); break; //5. 즐겨찾기 추가 선택 시 addFavorite() 메서드 실행
				case 6 : deleteFavorite(); break; //6. 즐겨찾기 삭제 선택 시 deleteFavorite() 메서드 실행
				
				
				case 7 : showBookList(favList); break; //7. 즐겨찾기 조회 선택 시 showBookList(favList) 메서드 실행
				
				case 8 : randomBook(); break; //8. 추천도서 뽑기 선택 시 randomBook() 메서드 실행
			
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
	
	/** 도서 등록 메서드
	 * 
	 */
	public String addBook() {
		
		System.out.println("========도서 등록=========");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(title, writer, price, publisher, bookNum); //입력받은 도서 정보들 담기
		
		library.add(newBook); //library list에 새로 입력받은 도서 등록 
		
		return "등록 완료"; //String형이므로 String으로 반환
		
	}
	
	
	/** 도서 목록 조회용 메서드
	 * 
	 * @param List<Book>
	 * 
	 */
	public void showBookList(List<Book> list) { //list 보여주는 메서드
		
		if(list.isEmpty()) { //list가(도서 목록이) 비어있다면
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!"); //해당 문구 출력
		} else { //비어있지 않다면
			
			// list를 순회하면서 각 Book 객체를 출력
			for(Book temp : list) {
				System.out.println(temp); // Book.toString();
			}
			
		}
		
	}
	
	
	/** 도서 수정용 메서드
	 * @return
	 */
	public String editBook() {
		
		showBookList(library); // 등록된 도서목록 출력하기
		
		System.out.println("======도서 수정========");
		
		int editMenu = 0; // 수정 메뉴 선택용 변수 선언 및 초기화
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		 
		for(Book temp : library) { //library 리스트에 있는 도서들 순회
			
			if(temp.getNum() == bookNum) {  //수정할 도서 번호와 순회 중인 리스트 도서번호 일치하다면
				// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
				flag = false; //flag는 false
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				switch(editMenu) { //수정할 도서 정보 번호에 따라 메서드 수행
				case 1 : 
					System.out.println("===도서명 수정===");
					System.out.print("수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();
					temp.setName(title);
					break;
					
				case 2 :
					System.out.println("===도서 저자 수정===");
					System.out.print("수정할 저자명을 입력하세요 : ");
					String writer = sc.nextLine();
					temp.setAuthor(writer);
					break;
					
				case 3 :
					System.out.println("===도서 가격 수정===");
					System.out.print("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					temp.setPrice(price);
					break;
					
				case 4 :
					System.out.println("===도서 출판사 수정===");
					System.out.print("수정할 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					temp.setCom(publisher);
					break;
					
				case 0 : System.out.println("종료합니다..."); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
				}
				
			}
		}
		
		if(flag) { //true라면
			return "일치하는 도서 번호가 없습니다."; //이 문구 반환
		}
		
		return "수정 완료"; //flag가 flase일 때 코드 수행 후 이 문구 반환
	}
	
	
	/** 도서 삭제용 메서드
	 * @return
	 */
	public String deleteBook() {
		System.out.println("====도서 삭제=====");
		
		showBookList(library); //도서 목록 보여주기
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp : library) { //library 리스트 순회
			
			if(temp.getNum() == deleteNum) { //순회할 때 입력한 삭제 도서 번호와 순회중인 리스트 도서번호가 일치하다면
				int index = library.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				if(answer == 'Y') { //Y라면
					library.remove(index); //library list의 해당 인덱스 삭제
					break; //빠져나가기
				} else { //아니라면
					return "삭제를 진행하지 않습니다"; //해당 문구 반환
				}
			}
			
		}
		
		return "삭제 끝"; 
	}
	
	/** 즐겨찾기 추가용 메서드
	 * 
	 */
	public void addFavorite() {
		
		showBookList(library);

		System.out.println("========즐겨찾기 도서 추가=========");

		System.out.print("즐겨찾기 할 도서 번호 : ");
		int bookNum = sc.nextInt();

		for (Book temp : library) { // library 리스트에 있는 도서들 순회

			if (temp.getNum() == bookNum) {
				// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
				favList.add(temp);
				System.out.println("즐겨찾기에 추가되었습니다.");
				System.out.println(temp); // Book.toString();
			}

		}
	}
	
	/** 즐겨찾기 삭제용 메서드
	 * 
	 */
	public String deleteFavorite() {
		
		System.out.println("====즐겨찾기 도서 삭제=====");
		
		showBookList(favList); //즐겨찾기 도서 목록 보여주기
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp : favList) { //favList 리스트 순회
			
			if(temp.getNum() == deleteNum) { //순회할 때 입력한 삭제 도서 번호와 순회중인 리스트 도서번호가 일치하다면
				int index = favList.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				if(answer == 'Y') { //Y라면
					favList.remove(index); //library list의 해당 인덱스 삭제
					break; //빠져나가기
				} else { //아니라면
					return "삭제를 진행하지 않습니다"; //해당 문구 반환
				}
			}
			
		}
		
		return "삭제 끝"; 
	}

	
	/** 추천 도서 뽑기
	 * 
	 */
	public void randomBook() {
		
		int max = library.size(); //max 변수 선언, max는 library 리스트 크기
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막인데스번호
		
		System.out.println( library.get(random).getName() );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}