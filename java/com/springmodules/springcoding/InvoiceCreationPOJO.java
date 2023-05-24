package com.springmodules.springcoding;

public class InvoiceCreationPOJO {

	private String invoicetextRandomNumber;
	private String agencyCode;
	
	
	public String getInvoicetextRandomNumber() {
		return invoicetextRandomNumber;
	}
	public void setInvoicetextRandomNumber(String invoicetextRandomNumber) {
		this.invoicetextRandomNumber = invoicetextRandomNumber;
	}
	public String getAgencyCode() {
		return agencyCode;
	}
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	
	@Override
	public String toString() {
		return "InvoiceCreationPOJO [invoicetextRandomNumber=" + invoicetextRandomNumber + ", "
				+ "agencyCode=" + agencyCode
				+ "]";
	}
	
	
	
	
	
}
