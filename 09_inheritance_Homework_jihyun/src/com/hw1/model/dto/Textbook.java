package com.hw1.model.dto;

public class Textbook extends Book {
	
	private String subject; //과목

	public Textbook() {
	}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle(), getAuthor(), subject);
	}
}
