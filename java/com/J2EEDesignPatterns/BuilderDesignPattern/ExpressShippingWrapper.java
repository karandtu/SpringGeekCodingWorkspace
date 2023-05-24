package com.J2EEDesignPatterns.BuilderDesignPattern;

public class ExpressShippingWrapper implements Shipping{

	@Override
	public String ship() {
		return "ExpressShippingDelivery";
	}

}
