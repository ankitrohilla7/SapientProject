/**
 * 
 */
package com.project.demo.springbootrestfulclient;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.project.demo.springbootrestfulapi.controller.RestApiController;

/**
 * @author ankrohil1
 *
 */
public class SpringBootRestfulClientApplicationTest {
	RestApiController loRestApiController;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loRestApiController = new RestApiController();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	@org.junit.Test
	public void testCalculateInterest() {
		loRestApiController.calculateInterest();
		assertNotNull(loRestApiController.calculateInterest().getHomeLoanInterest());
		assertTrue(loRestApiController.calculateInterest().getHomeLoanInterest()>0.0);
	}

}
