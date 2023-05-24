package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class DiscreteMathsBook extends MathematicsBook{

	@Override
	public String bookName() {
		return "Discrete Maths";
	}

	@Override
	public float bookPrice() {
		return 50.0f;
	}

	
}
