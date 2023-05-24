package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public abstract class JavaFullStackDevelopmentBook implements Books{

	
	public PurchaseBook purchase() {
		return new OfflinePurchase();
	}
	public abstract String bookName();
	public abstract float bookPrice();
}
