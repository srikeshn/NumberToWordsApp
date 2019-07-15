package com.srikesh.converter.services;

public class UnknownType implements BaseWordType{

	@Override
	public boolean isValidRange(Integer number) {
		return false; // Since we don't convert unknown number type, we always say invalid range.
	}

	@Override
	public String convertToWords(Integer number) {
		return "unable to convert " + number + " to words";
	}

	
}
