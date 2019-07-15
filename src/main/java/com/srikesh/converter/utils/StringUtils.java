package com.srikesh.converter.utils;

public class StringUtils {

	public static Integer sanitize(String input) {
		input = input.replace(",", "");
		if (input.length() > 9 || input.contains("."))
			throw new RuntimeException("unsupported number, supported range is 0 - 999999999 and without decimals");
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			throw new RuntimeException("unsupported number, supported range is 0 - 999999999 and without decimals");
		}

	}
}
