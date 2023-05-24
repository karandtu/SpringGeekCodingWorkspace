package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class BooksOrganizerAndBuilder {

	
	public BooksController prepareDetailsForPhysicsBooks() {
		BooksController booksController = new BooksController();
		booksController.addNewBookToTheListOfBooks(new ExperimentalPhysicsBook());
		booksController.addNewBookToTheListOfBooks(new TheoreticalPhysicsBook());
		return booksController;
	}
	
	public BooksController prepareDetailsForMathematicsBooks() {
		BooksController booksController = new BooksController();
		booksController.addNewBookToTheListOfBooks(new DiscreteMathsBook());
		booksController.addNewBookToTheListOfBooks(new DifferentialEquationsMathsBook());
		return booksController;
	}
	
	public BooksController prepareDetailsForJavaDevelopmentBooks() {
		BooksController booksController = new BooksController();
		booksController.addNewBookToTheListOfBooks(new JavaSpringBootBook());
		booksController.addNewBookToTheListOfBooks(new FullStackWebDevelopmentJavaBook());
		return booksController;
	}
	
	public BooksController prepareDetailsForAstronomyBooks() {
		BooksController booksController = new BooksController();
		booksController.addNewBookToTheListOfBooks(new DarkMatterAstronomyBook());
		booksController.addNewBookToTheListOfBooks(new GravityParticleAstronomyBook());
		return booksController;
	}
	
}
