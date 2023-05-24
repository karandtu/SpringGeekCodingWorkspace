package com.J2EEDesignPatterns.BuilderDesignPattern;

public class EmployeeBackGroundVerificationDocuments extends BackgroundVerificationDocuments{

	@Override
	public String documentName() {
		return "EmployeeBackGroundVerificationDocuments";
	}

	@Override
	public float shippingPrice() {
		
		return 100.0f;
	}

}
