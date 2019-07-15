package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.FixedNumbers;
import com.srikesh.converter.services.NumberRange;

public class SevenDigitsService extends AbstractWordType{
	private FixedNumbers fixedNumbers = new FixedNumbers();

	public SevenDigitsService() {
		super(new NumberRange(1000000, 9999999), 1000000);//here divisor is 1000000 so that we get the million digit
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixedNumbers.convertToWords(mainNumber) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsService().convertToWords(remainder);
	}
	

}
