package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.FiveDigitsService;

public class FiveDigitsTest {
	private final FiveDigitsService resource = new FiveDigitsService();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 1000, 9999);
		validRangeCheck(resource, 10000, 99999, 12345);
	}

	@Test
	public void convertFiveDigitNumberTest() {
		assertEquals("fifty one thousand", resource.convertToWords(51000));
	}

}
