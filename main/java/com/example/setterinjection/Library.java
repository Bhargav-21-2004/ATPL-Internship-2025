package com.example.setterinjection;

public class Library {
	private Book book;
	public Library() {
		System.out.println("library object is created");
	}
	public void setBook(Book book) {
		this.book=book;
	}
	public void showLibraryDetails() {
		System.out.println("libarary has this book:"+book);
		book.display();
	}

}
