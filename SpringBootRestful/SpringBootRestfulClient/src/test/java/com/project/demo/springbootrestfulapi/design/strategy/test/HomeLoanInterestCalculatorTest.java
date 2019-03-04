/**
 * 
 */
package com.project.demo.springbootrestfulapi.design.strategy.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.design.strategy.ComplexCreditWorthiness;
import com.project.demo.springbootrestfulapi.design.strategy.ComplexMarketCondition;
import com.project.demo.springbootrestfulapi.design.strategy.ComplexRepaymentCapacity;
import com.project.demo.springbootrestfulapi.design.strategy.HomeLoanInterestCalculator;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class HomeLoanInterestCalculatorTest {
	HomeLoanInterestCalculator loHomeLoanInterestCalculator;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loHomeLoanInterestCalculator = new HomeLoanInterestCalculator(
				new ComplexCreditWorthiness(), new ComplexMarketCondition(), new ComplexRepaymentCapacity());
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(loHomeLoanInterestCalculator.calculateInterest());
		
	}
	
	

}
