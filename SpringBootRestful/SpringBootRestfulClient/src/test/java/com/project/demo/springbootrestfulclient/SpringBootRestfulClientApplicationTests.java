package com.project.demo.springbootrestfulclient;

import org.junit.Test;

import com.project.demo.springbootrestfulapi.controller.RestApiController;

public class SpringBootRestfulClientApplicationTests {

	RestApiController a = new RestApiController();

	@Test
	public void testCalculateInterest() {
		a.calculateInterest();
	}

}
