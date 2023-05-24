package com.J2EEDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;


public class ProfessionalDocuments {

	private List<Document> listOfDocumentsListObject = new ArrayList<Document>();
	
	public void addDocuments(Document documentObject) {
		listOfDocumentsListObject.add(documentObject);
	}
	
	
	public float getTotalShippingCost() {
		float totalCost = 0.0f;
		for(Document documentObject : listOfDocumentsListObject) {
			totalCost+= documentObject.shippingPrice();
		}
		return totalCost;
	}
	
	

	public void showDocuments() {
		for(Document eachDocument : listOfDocumentsListObject) {
		System.out.println("documentName:" +eachDocument.documentName());
		System.out.println("Shipping:" +eachDocument.shipping().ship());
		System.out.println("ShippingPrice:" +eachDocument.shippingPrice());
	  }
	}
	
}
