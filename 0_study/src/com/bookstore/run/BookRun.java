package com.bookstore.run;

import com.bookstore.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		service.dispalyMenu();

	}

}
