package com.J2EEDesignPatterns.BuilderDesignPattern;

public abstract class BackgroundVerificationDocuments implements Document{

	
	@Override
	public Shipping shipping() {
		return new ExpressShippingWrapper();
	}
	
	@Override
	public abstract float shippingPrice();
}
