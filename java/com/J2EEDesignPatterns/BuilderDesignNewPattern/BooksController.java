package com.J2EEDesignPatterns.BuilderDesignNewPattern;

import java.util.ArrayList;
import java.util.List;

public class BooksController {

	List<Books> listOfAllBooks = new ArrayList<>();
	
	public void addNewBookToTheListOfBooks(Books book) {
			listOfAllBooks.add(book);
	}
	
	public float computeTotalCostOfAllBooks() {
		float totalInitialCostOfBooks = 0.0f;
		for(Books eachBook: listOfAllBooks) {
			totalInitialCostOfBooks+= eachBook.bookPrice();
		}
		return totalInitialCostOfBooks;
	}
	
	
	public void showAllBooksWithDetails() {
		for(Books eachBook: listOfAllBooks) {
			System.out.println("The Bookname is :"+ eachBook.bookName());
			System.out.println("The Book Purchasing style is :"+eachBook.purchase().buyingMode());
			System.out.println("The Book Price is :"+ eachBook.bookPrice());
		}
	}
}
