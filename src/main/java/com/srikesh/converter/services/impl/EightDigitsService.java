package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.NumberRange;

public class EightDigitsService extends AbstractWordType{

	public EightDigitsService() {
		super(new NumberRange(10000000, 99999999), 1000000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new TwoDigitsService().convertToWords(mainNumber) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsService().convertToWords(remainder);
	}

}
