package com.springmodules.springcoding;

public class UsingPrivateConstructorsToDelegateConstructors {


	private String dataTypeValue;
	private String dataTypeType;


	private UsingPrivateConstructorsToDelegateConstructors(String dataTypeName, String dataTypeType) {
		this.dataTypeValue = dataTypeName;
		this.dataTypeType = dataTypeType;
	}

	public UsingPrivateConstructorsToDelegateConstructors(int x) {
		this(Integer.toString(x),"int");
	}

	public UsingPrivateConstructorsToDelegateConstructors(boolean y) {
		this(Boolean.toString(y),"boolean");
	}

	public String getDataTypeValue() {
		return dataTypeValue;
	}

	public void setDataTypeValue(String dataTypeValue) {
		this.dataTypeValue = dataTypeValue;
	}

	public String getDataTypeType() {
		return dataTypeType;
	}

	public void setDataTypeType(String dataTypeType) {
		this.dataTypeType = dataTypeType;
	}


}
