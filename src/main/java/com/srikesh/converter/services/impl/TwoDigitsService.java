package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.FixedNumbers;
import com.srikesh.converter.services.NumberRange;

public class TwoDigitsService extends AbstractWordType{
	private final FixedNumbers fixedNumbers = new FixedNumbers();

	public TwoDigitsService() {
		super(new NumberRange(10, 99), 10);
	}

	@Override
	public String convertToWords(Integer number) {
		// return the word if it is a fixed number word
		if(fixedNumbers.isValidRange(number))
			return fixedNumbers.convertToWords(number);
		else 
			return super.convertToWords(number); 
	}
	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixedNumbers.convertToWords(mainNumber);
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return " "+ fixedNumbers.convertToWords(remainder);
	}

}
