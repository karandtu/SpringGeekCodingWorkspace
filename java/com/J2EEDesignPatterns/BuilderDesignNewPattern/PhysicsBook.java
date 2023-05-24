package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public abstract class PhysicsBook implements Books{

    @Override
	public PurchaseBook purchase() {
		return new OnlinePurchase();
	}
	
    @Override
	public abstract String bookName();
    
    @Override
	public abstract float bookPrice();
}
