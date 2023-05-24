package com.J2EEDesignPatterns.BuilderDesignPattern;

public class NormalShippingWrapper implements Shipping {

	@Override
	public String ship() {
		return "NormalShippingDelivery";
	}
	

}
