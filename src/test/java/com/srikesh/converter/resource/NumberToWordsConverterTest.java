package com.srikesh.converter.resource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.srikesh.converter.resource.NumberToWordsConverter;

public class NumberToWordsConverterTest {

	@Test
	public void ZeroToNinetyNineRangeTest() {
		assertEquals("0 = zero", new NumberToWordsConverter().convertToWords(0));
		assertEquals("12 = twelve", new NumberToWordsConverter().convertToWords(12));
		assertEquals("27 = twenty seven", new NumberToWordsConverter().convertToWords(27));
		assertEquals("30 = thirty", new NumberToWordsConverter().convertToWords(30));
		assertEquals("44 = fourty four", new NumberToWordsConverter().convertToWords(44));
		assertEquals("99 = ninety nine", new NumberToWordsConverter().convertToWords(99));
	}
	
	@Test
	public void ThreeDigitRangeTest() {
		assertEquals("101 = one hundred and one", new NumberToWordsConverter().convertToWords(101));
		assertEquals("145 = one hundred and fourty five", new NumberToWordsConverter().convertToWords(145));
		assertEquals("200 = two hundred", new NumberToWordsConverter().convertToWords(200));
		assertEquals("999 = nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(999));
	}
	
	@Test
	public void FourDigitRangeTest() {
		assertEquals("1000 = one thousand", new NumberToWordsConverter().convertToWords(1000));
		assertEquals("1450 = one thousand four hundred and fifty", new NumberToWordsConverter().convertToWords(1450));
		assertEquals("2101 = two thousand one hundred and one", new NumberToWordsConverter().convertToWords(2101));
		assertEquals("9999 = nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(9999));
	}
	@Test
	public void FiveDigitRangeTest() {
		assertEquals("10000 = ten thousand", new NumberToWordsConverter().convertToWords(10000));
		assertEquals("12345 = twelve thousand three hundred and fourty five", new NumberToWordsConverter().convertToWords(12345));
		assertEquals("21000 = twenty one thousand", new NumberToWordsConverter().convertToWords(21000));
		assertEquals("99999 = ninety nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(99999));
	
	}
	@Test
	public void SixDigitRangeTest() {
		assertEquals("100000 = one hundred thousand", new NumberToWordsConverter().convertToWords(100000));
		assertEquals("123456 = one hundred and twenty three thousand four hundred and fifty six", new NumberToWordsConverter().convertToWords(123456));
		assertEquals("56040 = fifty six thousand fourty", new NumberToWordsConverter().convertToWords(56040));
		assertEquals("999999 = nine hundred and ninety nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(999999));
	
	}
	@Test
	public void SevenDigitRangeTest() {
		assertEquals("1000000 = one million", new NumberToWordsConverter().convertToWords(1000000));
		assertEquals("1234567 = one million two hundred and thirty four thousand five hundred and sixty seven", new NumberToWordsConverter().convertToWords(1234567));
		assertEquals("7000040 = seven million fourty", new NumberToWordsConverter().convertToWords(7000040));
		assertEquals("9999999 = nine million nine hundred and ninety nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(9999999));
	
	}
	@Test
	public void EightDigitRangeTest() {
		assertEquals("10000000 = ten million", new NumberToWordsConverter().convertToWords(10000000));
		assertEquals("11234567 = eleven million two hundred and thirty four thousand five hundred and sixty seven", new NumberToWordsConverter().convertToWords(11234567));
		assertEquals("80000800 = eighty million eight hundred", new NumberToWordsConverter().convertToWords(80000800));
		assertEquals("99999999 = ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(99999999));
	}
	@Test
	public void NineDigitRangeTest() {
		assertEquals("100000000 = one hundred million", new NumberToWordsConverter().convertToWords(100000000));
		assertEquals("211234567 = two hundred and eleven million two hundred and thirty four thousand five hundred and sixty seven", new NumberToWordsConverter().convertToWords(211234567));
		assertEquals("580000800 = five hundred and eighty million eight hundred", new NumberToWordsConverter().convertToWords(580000800));
		assertEquals("999999999 = nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(999999999));
	}
	@Test
	public void outOfRangeTest() {
		assertEquals("1000000000 = unable to convert 1000000000 to words", new NumberToWordsConverter().convertToWords(1000000000));
	}
}
