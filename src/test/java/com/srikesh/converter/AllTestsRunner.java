package com.srikesh.converter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.srikesh.converter.resource.NumberToWordsConverterTest;
import com.srikesh.converter.services.EightDigitsTest;
import com.srikesh.converter.services.FiveDigitsTest;
import com.srikesh.converter.services.FourDigitsTest;
import com.srikesh.converter.services.NineDigitsTest;
import com.srikesh.converter.services.SevenDigitsTest;
import com.srikesh.converter.services.SixDigitsTest;
import com.srikesh.converter.services.ThreeDigitsTest;
import com.srikesh.converter.services.TwoDigitsTest;

@RunWith(Suite.class)
@SuiteClasses({ NumberToWordsConverterTest.class,TwoDigitsTest.class,
	  ThreeDigitsTest.class, FourDigitsTest.class, FiveDigitsTest.class,SixDigitsTest.class,
	  SevenDigitsTest.class,EightDigitsTest.class, NineDigitsTest.class })
public class AllTestsRunner {

}
