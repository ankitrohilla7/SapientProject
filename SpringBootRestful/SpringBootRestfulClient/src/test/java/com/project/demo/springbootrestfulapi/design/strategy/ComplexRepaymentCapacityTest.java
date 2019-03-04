/**
 * 
 */
package com.project.demo.springbootrestfulapi.design.strategy;

import static org.junit.Assert.assertNotNull;

import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.design.strategy.ComplexRepaymentCapacity;
import com.project.demo.springbootrestfulapi.design.strategy.MultipleFileReader;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class ComplexRepaymentCapacityTest {
	ComplexRepaymentCapacity loComplexRepaymentCapacity;
	MultipleFileReader loMultipleFileReader;
	Sheet sheet;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loComplexRepaymentCapacity = new ComplexRepaymentCapacity();
		loMultipleFileReader = new MultipleFileReader("RepaymentCapacity");
		sheet = loMultipleFileReader.call();
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(loComplexRepaymentCapacity.calculateRepaymentCapacity(sheet));
	}
	
	

}
