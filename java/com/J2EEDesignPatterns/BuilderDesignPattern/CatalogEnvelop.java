package com.J2EEDesignPatterns.BuilderDesignPattern;

public class CatalogEnvelop extends Envelope{

	@Override
	public String documentName() {
		return "House Insurance Documents";
	}

	@Override
	public float shippingPrice() {
		
		return 50.0f;
	}

}
