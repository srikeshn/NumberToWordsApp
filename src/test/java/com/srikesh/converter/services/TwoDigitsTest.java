package com.srikesh.converter.services;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.services.impl.TwoDigitsService;

public class TwoDigitsTest {
	private final TwoDigitsService resource = new TwoDigitsService();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 7, 100);
		validRangeCheck(resource, 10, 99);
	}

	@Test
	public void DoubleDigitTest() {
		assertEquals("twelve", resource.convertToWords(12));
		assertEquals("twenty seven", resource.convertToWords(27));
		assertEquals("thirty", resource.convertToWords(30));
		assertEquals("fourty four", resource.convertToWords(44));
		assertEquals("ninety nine", resource.convertToWords(99));
	}

}
