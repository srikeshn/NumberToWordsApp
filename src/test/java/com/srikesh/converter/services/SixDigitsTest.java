package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.SixDigitsService;

public class SixDigitsTest {
	private final SixDigitsService resource = new SixDigitsService();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 9999, 99999);
		validRangeCheck(resource, 100000, 999999, 234543);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine",
				resource.convertToWords(999999));
	}

}
