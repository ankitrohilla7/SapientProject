/**
 * 
 */
package com.project.demo.springbootrestfulapi.design.strategy.test;

import static org.junit.Assert.assertNotNull;

import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.design.strategy.ComplexMarketCondition;
import com.project.demo.springbootrestfulapi.design.strategy.MultipleFileReader;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class ComplexMarketConditionTest {
	ComplexMarketCondition loComplexMarketCondition;
	MultipleFileReader loMultipleFileReader;
	Sheet sheet;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loComplexMarketCondition = new ComplexMarketCondition();
		loMultipleFileReader = new MultipleFileReader("MarketCondition");
		sheet = loMultipleFileReader.call();
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(loComplexMarketCondition.getMarketCondition(sheet));
	}
	
	

}
