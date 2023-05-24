package com.J2EEDesignPatterns.BuilderDesignNewPattern;

public class OfflinePurchase implements PurchaseBook{

	@Override
	public String buyingMode() {
		return "Purchase Books directly from the Amazon Marketplace Centers";
	}

	
}
