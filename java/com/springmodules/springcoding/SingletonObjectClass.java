package com.springmodules.springcoding;

public class SingletonObjectClass {

	private static SingletonObjectClass singletonInstance = new SingletonObjectClass();
	
	private SingletonObjectClass() {}
	
	public static SingletonObjectClass getInstance() {
		return singletonInstance;
		
	}
	
	public void showMessage() {
		System.out.println("Hello World");
	}
}
