/**
 * 
 */
package com.project.demo.springbootrestfulapi.design.strategy;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.design.strategy.MultipleFileReader;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class MultipleFileReaderTest {
	MultipleFileReader loMultipleFileReader;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loMultipleFileReader = new MultipleFileReader("CreditWorthiness");
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(loMultipleFileReader.call());
	}
	
	

}
