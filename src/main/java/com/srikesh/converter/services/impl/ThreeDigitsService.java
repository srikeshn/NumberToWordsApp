package com.srikesh.converter.services.impl;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.FixedNumbers;
import com.srikesh.converter.services.NumberRange;

public class ThreeDigitsService extends AbstractWordType{

	private FixedNumbers fixednumber = new FixedNumbers();
	public ThreeDigitsService() {
		super(new NumberRange(100, 999), 100);
	}

	public String convertToWords(Integer number) {
		if(fixednumber.isValidRange(number)) {
			return fixednumber.convertToWords(number);
		}
		else {
			return super.convertToWords(number);
		}
	}
	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixednumber.convertToWords(mainNumber) + " hundred";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		String words = new TwoDigitsService().convertToWords(remainder);
		StringBuilder result = new StringBuilder();
		if(remainder > 0) {
			result.append(" and ");
		}
		return result.append(words).toString();
	}
	

}
