package com.J2EEDesignPatterns.BuilderDesignPattern;

public class BookletEnvelop extends Envelope{

	@Override
	public String documentName() {
		return "Greeting Cards";
	}

	@Override
	public float shippingPrice() {
		
		return 25.0f;
	}

	
}
