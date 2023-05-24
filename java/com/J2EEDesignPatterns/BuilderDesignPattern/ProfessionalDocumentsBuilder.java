package com.J2EEDesignPatterns.BuilderDesignPattern;

public class ProfessionalDocumentsBuilder {

	public ProfessionalDocuments prepareBackgroundVerificationDocuments() {
		ProfessionalDocuments professionalVerificationDocuments = new ProfessionalDocuments();
		professionalVerificationDocuments.addDocuments(new EmployeeBackGroundVerificationDocuments());
		professionalVerificationDocuments.addDocuments(new HouseBackGroundVerificationDocuments());
		return professionalVerificationDocuments;
	}
	
	
	public ProfessionalDocuments prepareEnvelopes() {
		ProfessionalDocuments professionalEnvelopeDocuments = new ProfessionalDocuments();
		professionalEnvelopeDocuments.addDocuments(new BookletEnvelop());
		professionalEnvelopeDocuments.addDocuments(new CatalogEnvelop());
		return professionalEnvelopeDocuments;
	}
}
