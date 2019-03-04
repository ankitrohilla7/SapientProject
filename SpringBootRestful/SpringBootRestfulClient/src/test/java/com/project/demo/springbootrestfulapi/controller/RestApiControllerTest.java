/**
 * 
 */
package com.project.demo.springbootrestfulapi.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.controller.RestApiController;

/**
 * @author ankrohil1
 *
 */
public class RestApiControllerTest {
	RestApiController loRestApiController;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loRestApiController = new RestApiController();
	}
	
	@Test
	public void testCalculateInterest() {
		assertNotNull(loRestApiController.calculateInterest().getHomeLoanInterest());
		assertTrue(loRestApiController.calculateInterest().getHomeLoanInterest()>0.0);
	}
	
	

}
