package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.ThreeDigitsService;

public class ThreeDigitsTest {
	private final ThreeDigitsService resource = new ThreeDigitsService();

	@Test
	public void ThreeDigitsRangeTest() {
		invalidRangeCheck(resource, 9, 20, 9999);
		validRangeCheck(resource, 199, 100);
	}

	@Test
	public void ConvertThreeDigitNumbersTest() {
		assertEquals("one hundred and one", resource.convertToWords(101));
	}

}
