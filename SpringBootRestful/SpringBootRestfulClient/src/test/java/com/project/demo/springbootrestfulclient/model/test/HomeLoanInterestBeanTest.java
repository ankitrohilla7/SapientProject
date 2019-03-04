/**
 * 
 */
package com.project.demo.springbootrestfulclient.model.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;
import com.project.demo.springbootrestfulclient.model.HomeLoanInterestBean;

/**
 * @author ankrohil1
 *
 */
public class HomeLoanInterestBeanTest {
	HomeLoanInterestBean loHomeLoanInterestBean;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loHomeLoanInterestBean = new HomeLoanInterestBean();
	}
	
	@Test
	public void testCalculateInterest() throws HomeLoanInterestException {
		loHomeLoanInterestBean.setHomeLoanInterest(0.0);
		assertNotNull(loHomeLoanInterestBean.getHomeLoanInterest());
	}
	
	

}
