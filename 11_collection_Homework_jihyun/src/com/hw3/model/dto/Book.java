package com.hw3.model.dto;

public class Book {
	
	private String name; //책이름
	private String author; //저자
	private int price; //가격
	private String com; //출판사
	private int num; //책 번호
	
	public Book() { //기본생성자
	}


	public Book(String name, String author, int price, String com, int num) { //매개변수 생성자
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.com = com;
		this.num = num;
	}



	public int getNum() { //setting된 책 번호 값 받기
		return num;
	}

	public void setNum(int num) { //책 번호 값 넣기
		this.num = num;
	}

	public String getName() { //setting된 책 이름 값 받기
		return name;
	}

	public void setName(String name) { //책 이름 넣기
		this.name = name;
	}

	public String getAuthor() { //setting된 저자 값 받기
		return author;
	}

	public void setAuthor(String author) { //저자 값 넣기
		this.author = author;
	}

	public int getPrice() { //setting된 책 가격 값 받기
		return price;
	}

	public void setPrice(int price) { //책 가격 값 넣기
		this.price = price;
	}

	public String getCom() { //setting된 출판사 값 받기
		return com;
	}

	public void setCom(String com) { //출판사 이름 값 넣기
		this.com = com;
	}

	@Override
	public String toString() { //오버라이딩(재정의) run에서 출력될 도서목록 출력 형식 지정
		return String.format(num + "번 도서 : [도서제목 : " + name + " / 도서저자 : " + author + 
				" / 도서가격 : " + price + "원 / 출판사 : " + com + "]");
	}
	
	
	
	

}
