package com.springmodules.springcoding;


public class MySingletonIntanceSingletonDesignPattern {

	private static MySingletonIntanceSingletonDesignPattern INSTANCE;
	private MySingletonIntanceSingletonDesignPattern() {}
	
	public static MySingletonIntanceSingletonDesignPattern getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new MySingletonIntanceSingletonDesignPattern();
		}
		
		return INSTANCE;
	}
	
}
