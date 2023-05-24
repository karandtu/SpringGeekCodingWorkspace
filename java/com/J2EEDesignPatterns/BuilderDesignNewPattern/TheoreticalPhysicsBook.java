package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class TheoreticalPhysicsBook extends PhysicsBook{

	@Override
	public String bookName() {
		return "Theoretical Physics Book";
	}

	@Override
	public float bookPrice() {
		return 150.0f;
	}
}
