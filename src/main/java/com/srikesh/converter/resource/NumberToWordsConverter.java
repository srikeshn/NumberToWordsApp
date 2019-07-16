package com.srikesh.converter.resource;

import static com.srikesh.converter.utils.WordConstants.ZERO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.srikesh.converter.services.AbstractWordType;
import com.srikesh.converter.services.BaseWordType;
import com.srikesh.converter.services.FixedNumbers;
import com.srikesh.converter.services.UnknownType;
import com.srikesh.converter.services.impl.EightDigitsService;
import com.srikesh.converter.services.impl.FiveDigitsService;
import com.srikesh.converter.services.impl.FourDigitsService;
import com.srikesh.converter.services.impl.NineDigitsService;
import com.srikesh.converter.services.impl.SevenDigitsService;
import com.srikesh.converter.services.impl.SixDigitsService;
import com.srikesh.converter.services.impl.ThreeDigitsService;
import com.srikesh.converter.services.impl.TwoDigitsService;

public class NumberToWordsConverter {
	private static final FixedNumbers fixedNumbers = new FixedNumbers();

	private final Collection<? extends AbstractWordType> numberTypes = Arrays.asList(new TwoDigitsService(),
			new ThreeDigitsService(), new FourDigitsService(), new FiveDigitsService(), new SixDigitsService(),
			new SevenDigitsService(), new EightDigitsService(), new NineDigitsService());

	public String convertToWords(Integer number) {
		if (number == 0)
			return String.format("%d = %s", number, ZERO);
		else if (fixedNumbers.isValidRange(number)) {
			return String.format("%d = %s", number, fixedNumbers.convertToWords(number));
		} else {
			BaseWordType baseType = getNumberType(number);
			return String.format("%d = %s", number, baseType.convertToWords(number));
		}
	}

	private BaseWordType getNumberType(Integer number) {
		BaseWordType defaultType = new UnknownType();
		Optional<? extends AbstractWordType> matchedType = numberTypes.stream()
				.filter(type -> type.isValidRange(number)).findFirst();
		if (matchedType.isPresent())
			return matchedType.get();
		return defaultType;
	}
}
