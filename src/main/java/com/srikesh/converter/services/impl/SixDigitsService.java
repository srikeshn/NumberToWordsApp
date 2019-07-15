package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.NumberRange;

public class SixDigitsService extends AbstractWordType{

	public SixDigitsService() {
		super(new NumberRange(100000, 999999), 1000); // Since we break number into set of three digits, divisor is 1000
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new ThreeDigitsService().convertToWords(mainNumber) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new ThreeDigitsService().convertToWords(remainder);
	}
	

}
