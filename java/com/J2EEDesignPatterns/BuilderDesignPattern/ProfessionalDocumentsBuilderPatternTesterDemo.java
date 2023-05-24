package com.J2EEDesignPatterns.BuilderDesignPattern;

public class ProfessionalDocumentsBuilderPatternTesterDemo {

	public static void main(String args[]) {
	ProfessionalDocumentsBuilder documentBuilder = new ProfessionalDocumentsBuilder();
	ProfessionalDocuments verificationDocuments = documentBuilder.prepareBackgroundVerificationDocuments();
    System.out.println("BackGroundVerificationDocuments");
    verificationDocuments.showDocuments();
    System.out.println("Total shipping cost of the backgroundVerificationDocuments is:" +verificationDocuments.getTotalShippingCost());
    
	
	
	
	ProfessionalDocumentsBuilder envelopBuilder = new ProfessionalDocumentsBuilder();
	ProfessionalDocuments envelopDocuments = envelopBuilder.prepareEnvelopes();
	System.out.println("EnvelopeDocuments");
	envelopDocuments.showDocuments();
	System.out.println("Total shipping cost of the envelopeDocuments is: "+envelopDocuments.getTotalShippingCost());
	}
	
	
	
}
