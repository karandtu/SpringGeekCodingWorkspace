package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public abstract class AstronomyBook implements Books{

	@Override
	public PurchaseBook purchase() {
		return new OfflinePurchase();
	}
	
	@Override
	public abstract String bookName();
	
	@Override
	public abstract float bookPrice();
}
