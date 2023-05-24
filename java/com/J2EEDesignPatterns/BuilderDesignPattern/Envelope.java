package com.J2EEDesignPatterns.BuilderDesignPattern;

public abstract class Envelope implements Document{

	@Override
	public Shipping shipping() {
		return new NormalShippingWrapper();
	}
	
	
	@Override
	public abstract float shippingPrice();
}


