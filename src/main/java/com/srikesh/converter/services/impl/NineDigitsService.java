package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.NumberRange;

public class NineDigitsService extends AbstractWordType{

	public NineDigitsService() {
		super(new NumberRange(100000000, 999999999), 1000000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new ThreeDigitsService().convertToWords(mainNumber) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsService().convertToWords(remainder);
	}

}
