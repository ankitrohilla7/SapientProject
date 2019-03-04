/**
 * 
 */
package com.project.demo.springbootrestfulapi.exception.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class HomeLoanInterestExceptionTest {

	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		assertNotNull(new HomeLoanInterestException("Exception"));
	}
	
	

}
