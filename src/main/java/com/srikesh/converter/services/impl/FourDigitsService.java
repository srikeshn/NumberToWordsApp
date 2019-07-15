package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.FixedNumbers;
import com.srikesh.converter.services.NumberRange;

public class FourDigitsService extends AbstractWordType{
	private final FixedNumbers fixednumbers = new FixedNumbers();

	public FourDigitsService() {
		super(new NumberRange(1000, 9999), 1000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixednumbers.convertToWords(mainNumber) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return  new ThreeDigitsService().convertToWords(remainder);
	}

}
