package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class BooksOrganizerAndBuilderPatternTesterDemo {

	public static void main(String args[]) {

	BooksOrganizerAndBuilder physicsBooksOrganizerAndBuilder = new BooksOrganizerAndBuilder();
	BooksController buildingDetailsForPhysicsBooks = physicsBooksOrganizerAndBuilder.prepareDetailsForPhysicsBooks();
	buildingDetailsForPhysicsBooks.showAllBooksWithDetails();
	System.out.println("The Total cost of purchasing books is:" +buildingDetailsForPhysicsBooks.computeTotalCostOfAllBooks());
	
	
	BooksOrganizerAndBuilder mathematicsBooksOrganizerAndBuilder = new BooksOrganizerAndBuilder();
	BooksController buildingDetailsForMathematicsBooks  = mathematicsBooksOrganizerAndBuilder.prepareDetailsForMathematicsBooks();
	buildingDetailsForMathematicsBooks.showAllBooksWithDetails();
	System.out.println("The Total cost of purchasing books is:" +buildingDetailsForMathematicsBooks.computeTotalCostOfAllBooks());
	
	
	BooksOrganizerAndBuilder javaBooksOrganizerAndBuilder = new BooksOrganizerAndBuilder();
	BooksController buildingDetailsForJavaDevelopmentBooks  = javaBooksOrganizerAndBuilder.prepareDetailsForJavaDevelopmentBooks();
	buildingDetailsForJavaDevelopmentBooks.showAllBooksWithDetails();
	System.out.println("The Total cost of purchasing books is:" +buildingDetailsForJavaDevelopmentBooks.computeTotalCostOfAllBooks());
	
	BooksOrganizerAndBuilder astronomyBooksOrganizerAndBuilder = new BooksOrganizerAndBuilder();
	BooksController buildingDetailsForAstronomyDevelopmentBooks  = astronomyBooksOrganizerAndBuilder.prepareDetailsForJavaDevelopmentBooks();
	buildingDetailsForAstronomyDevelopmentBooks.showAllBooksWithDetails();
	System.out.println("The Total cost of purchasing books is:" +buildingDetailsForAstronomyDevelopmentBooks.computeTotalCostOfAllBooks());
	}
}
