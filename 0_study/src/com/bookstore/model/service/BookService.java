package com.bookstore.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookstore.model.dto.Book;

public class BookService {

	Scanner sc = new Scanner(System.in);
	List<Book> bookList = new ArrayList<>();
	List<Book> likeList = new ArrayList<>();

	public void dispalyMenu() {

		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

		int menuNum = -1;
		do {
			System.out.println("\n===도서 목록 프로그램===");
			System.out.println("\n1. 도서 등록");
			System.out.println("\n2. 도서 조회");
			System.out.println("\n3. 도서 수정");
			System.out.println("\n4. 도서 삭제");
			System.out.println("\n5. 즐겨찾기 추가");
			System.out.println("\n6. 즐겨찾기 삭제");
			System.out.println("\n7. 즐겨찾기 조회");
			System.out.println("\n8. 추천도서 뽑기");
			System.out.println("\n0. 프로그램 종료");

			System.out.print("\n메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1: addBook(); break;
			case 2: viewBook(); break;
			case 3: System.out.println( editBook() ); break;
			case 4: deleteBook();
			//case 5:
			//case 6:
			//case 7:
			case 8: randomBook();
			case 0: break;
			}

		} while (menuNum != 0);
	}

	public void addBook() {
		System.out.println("\n=====도서 등록=====");

		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 제목 : ");
		String title = sc.nextLine();

		System.out.print("도서  저자: ");
		String author = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 출판사 : ");
		String company = sc.nextLine();

		bookList.add(new Book(num, title, author, price, company));

		System.out.println("등록 완료");
	}

	public void viewBook() {

		for (Book b : bookList) {
			System.out.println(b.toString());
		}

	}

	public String editBook() {

		System.out.println("\n=====도서 수정=====");

		System.out.print("수정할 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		for (Book b : bookList) {

			if (b.getNumber() == num) {
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");

				System.out.print("\n어떤 정보를 수정하시겠습니까? ");
				int a = sc.nextInt();
				sc.nextLine();

				switch (a) {
				case 1:
					System.out.println("=====도서명 수정=====");
					System.out.print("\n수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();

					b.setTitle(title);

					return "\n수정 완료";
				case 2:
					System.out.println("=====도서 저자 수정=====");
					System.out.print("\n수정할 도서 저자를 입력하세요 : ");
					String author = sc.nextLine();

					b.setAuthor(author);

					System.out.println("\n수정 완료");

					return "\n수정 완료";

				case 3:
					System.out.println("=====도서 가격 수정=====");
					System.out.print("\n수정할 도서 가격을 입력하세요 : ");
					int price = sc.nextInt();

					b.setPrice(price);

					System.out.println("\n수정 완료");

					return "\n수정 완료";

				case 4:
					System.out.println("=====도서 출판사 수정=====");
					System.out.print("\n수정할 도서 출판사를 입력하세요 : ");
					String company = sc.nextLine();

					b.setCompany(company);

					System.out.println("\n수정 완료");

					return "\n수정 완료";

				case 0:
					break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요.");
				}
			}
		}
		
		return "일치하는 도서 번호가 없습니다.";
		
	}

	public void deleteBook() {
		System.out.println("\n=====도서 삭제=====\n");
		
		viewBook();
		
		System.out.print("\n삭제할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(Book b : bookList) {
			int index = bookList.indexOf(b);
			// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
			
			if(b.getNumber()==num) {
				System.out.println(b.toString());
				System.out.print("정말 삭제하시겠습니까?(y/n) :  ");
				String answer = sc.next();
				
				if(answer.equalsIgnoreCase("y")){
					bookList.remove(index);
					System.out.println("삭제되었습니다.");
					break;
				} else {
					System.out.println("삭제가 취소되었습니다.");
				}
				
			}
		}
	}

	public void randomBook() {
		System.out.println("=====추천 도서 뽑기=====");
		
		int ran = (int)(Math.random()*bookList.size());
		
		System.out.println(bookList.get(ran).toString());
	}
}
