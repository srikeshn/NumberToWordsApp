package com.srikesh.converter.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.srikesh.converter.services.BaseWordType;

public class RangeValidationUtil {


	public static void invalidRangeCheck(BaseWordType resource,Integer... numbers) {
		for (Integer num : numbers) {
			assertFalse(resource.isValidRange(num));
		}
	}
	
	public static void validRangeCheck(BaseWordType resource,Integer... numbers) {
		for (Integer num : numbers) {
			assertTrue(resource.isValidRange(num));
		}
	}
}
