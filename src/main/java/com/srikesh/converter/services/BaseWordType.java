package com.srikesh.converter.services;

// Any digit number will have a range and should convert number to words.
public interface BaseWordType {

	boolean isValidRange(Integer number);

    String convertToWords(Integer number);
}
