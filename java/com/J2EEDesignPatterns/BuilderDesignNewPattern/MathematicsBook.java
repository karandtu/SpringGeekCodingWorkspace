package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public abstract class MathematicsBook implements Books{

	public PurchaseBook purchase() {
		return new OnlinePurchase();
	}
	public abstract String bookName();
	public abstract float bookPrice();
}
