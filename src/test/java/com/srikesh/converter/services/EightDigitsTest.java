package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.EightDigitsService;

public class EightDigitsTest {
	private final EightDigitsService resource = new EightDigitsService();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 10000, 1000000);
		validRangeCheck(resource, 10000000, 99999999, 75693475);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("ten million", resource.convertToWords(10000000));
	}

}
