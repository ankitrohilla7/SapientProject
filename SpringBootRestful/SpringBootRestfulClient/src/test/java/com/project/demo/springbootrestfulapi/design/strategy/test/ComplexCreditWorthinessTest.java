/**
 * 
 */
package com.project.demo.springbootrestfulapi.design.strategy.test;

import static org.junit.Assert.assertNotNull;

import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.design.strategy.ComplexCreditWorthiness;
import com.project.demo.springbootrestfulapi.design.strategy.MultipleFileReader;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class ComplexCreditWorthinessTest {
	ComplexCreditWorthiness loComplexCreditWorthiness;
	MultipleFileReader loMultipleFileReader;
	Sheet sheet;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loComplexCreditWorthiness = new ComplexCreditWorthiness();
		loMultipleFileReader = new MultipleFileReader("CreditWorthiness");
		sheet = loMultipleFileReader.call();
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(loComplexCreditWorthiness.getCreditWorthy(sheet));
	}
	
	

}
