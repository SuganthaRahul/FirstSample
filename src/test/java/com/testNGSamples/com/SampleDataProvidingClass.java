package com.testNGSamples.com;

import org.testng.annotations.DataProvider;

public class SampleDataProvidingClass {
	@DataProvider(name="sample", parallel=true)
	public Object[][] testData(){
		
		return new Object[][] {{"Sugantha","suga"}, {"Vihaan","viha"}};
		
	}


}
