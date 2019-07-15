package com.srikesh.converter.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.srikesh.converter.services.FixedNumbers;

public class FixedWordsTest {
	private final FixedNumbers resource = new FixedNumbers();

	@Test
	public void numberExistInMapTest() {
		validRangeCheck(resource, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60,
				70, 80, 90);
	}

	@Test
	public void fixedNumberinWordTest() {
		assertEquals("", resource.convertToWords(0));
		assertEquals("ninety", resource.convertToWords(90));
	}

	private void validRangeCheck(FixedNumbers resource, Integer... numbers) {
		for (Integer num : numbers) {
			assertTrue(resource.isValidRange(num));
		}
	}
}
