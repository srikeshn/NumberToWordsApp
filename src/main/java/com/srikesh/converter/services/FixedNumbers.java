package com.srikesh.converter.services;

import java.util.HashMap;
import java.util.Map;

import static com.srikesh.converter.utils.WordConstants.*;

public class FixedNumbers {
	private final Map<Integer, String> fixedWordMap;
	
	public FixedNumbers() {
		fixedWordMap = new HashMap<Integer, String>();
		fixedWordMap.put(1, ONE);
		fixedWordMap.put(2, TWO);
		fixedWordMap.put(3, THREE);
		fixedWordMap.put(4, FOUR);
		fixedWordMap.put(5, FIVE);
		fixedWordMap.put(6, SIX);
		fixedWordMap.put(7, SEVEN);
		fixedWordMap.put(8, EIGHT);
		fixedWordMap.put(9, NINE);
		fixedWordMap.put(10, TEN);
		fixedWordMap.put(11, ELEVEN);
		fixedWordMap.put(12, TWELVE);
		fixedWordMap.put(13, THIRTEEN);
		fixedWordMap.put(14, FOURTEEN);
		fixedWordMap.put(15, FIFTEEN);
		fixedWordMap.put(16, SIXTEEN);
		fixedWordMap.put(17, SEVENTEEN);
		fixedWordMap.put(18, EIGHTEEN);
		fixedWordMap.put(19, NINETEEN);
		fixedWordMap.put(20, TWENTY);
		fixedWordMap.put(30, THIRTY);
		fixedWordMap.put(40, FOURTY);
		fixedWordMap.put(50, FIFTY);
		fixedWordMap.put(60, SIXTY);
		fixedWordMap.put(70, SEVENTY);
		fixedWordMap.put(80, EIGHTY);
		fixedWordMap.put(90, NINETY);
		
	}
	
	public boolean isValidRange(Integer number) {
		return fixedWordMap.get(number) != null;
	}
	
	public String convertToWords(Integer number) {
        return number == 0 ? "" : fixedWordMap.get(number);
	}
}
