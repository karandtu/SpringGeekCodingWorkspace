package com.J2EEDesignPatterns.BuilderDesignPattern;

public class HouseBackGroundVerificationDocuments extends BackgroundVerificationDocuments{

	@Override
	public String documentName() {
		return "HouseBackGroundVerificationDocuments";
	}

	@Override
	public float shippingPrice() {
		return 75.0f;
	}

}
