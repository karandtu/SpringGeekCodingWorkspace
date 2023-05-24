package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class ExperimentalPhysicsBook extends PhysicsBook{

	@Override
	public String bookName() {
		return "Experimental Physics Book";
	}

	@Override
	public float bookPrice() {
		return 140.0f;
	}

	
}
