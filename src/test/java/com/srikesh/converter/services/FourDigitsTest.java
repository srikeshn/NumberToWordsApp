package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.FourDigitsService;

public class FourDigitsTest {
	private final FourDigitsService resource = new FourDigitsService();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 99999);
		validRangeCheck(resource, 1000, 9999, 6754);
	}

	@Test
	public void convertFourDigitNumberTest() {
		assertEquals("four thousand five hundred and sixty five", resource.convertToWords(4565));
	}

}
