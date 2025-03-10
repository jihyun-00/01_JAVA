package com.bookstore.model.dto;

public class Book {
	
	private int number;
	private String title;
	private String author;
	private int price;
	private String company;
	
	public Book() {
	}

	public Book(int number, String title, String author, int price, String company) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
		this.company = company;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return number + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author
				 + " /  도서가격 : " + price + "원 / 출판사 : " + company + "]";
	}
	
	
	
	
	
	

}
