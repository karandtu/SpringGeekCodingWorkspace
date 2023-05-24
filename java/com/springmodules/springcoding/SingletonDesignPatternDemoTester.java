package com.springmodules.springcoding;

public class SingletonDesignPatternDemoTester {

	public static void main(String args[]) {
		
		//getting an only object
		SingletonObjectClass instance = SingletonObjectClass.getInstance();
		instance.showMessage();
	}
}
