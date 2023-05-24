package com.springmodules.springcoding;

public class InvoiceCreationImplementation implements InvoiceCreationDAO {

 
	@Override
	public InvoiceCreationPOJO createInvoice() {
		//implementation starts here
		InvoiceCreationPOJO invoiceObject = new InvoiceCreationPOJO();
		invoiceObject.setInvoicetextRandomNumber("5292300015287AL");
		invoiceObject.setAgencyCode("529");
		return invoiceObject;
	}
	
	
	//after implementation, creating BeanPostProcessor Call-back factory methods
	public void initBean() {
		System.out.println("The InitBean method is called.");
	}
	
	public void destroyBean() {
		System.out.println("The DestroyBean method is called.");
	}
}
