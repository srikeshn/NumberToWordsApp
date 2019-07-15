package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.NumberRange;

public class FiveDigitsService extends AbstractWordType{

	public FiveDigitsService() {
		super(new NumberRange(10000, 99999), 1000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new TwoDigitsService().convertToWords(mainNumber) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new ThreeDigitsService().convertToWords(remainder);
	}

}
