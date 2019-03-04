package com.project.demo.springbootrestfulapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.springbootrestfulapi.design.strategy.ComplexCreditWorthiness;
import com.project.demo.springbootrestfulapi.design.strategy.ComplexMarketCondition;
import com.project.demo.springbootrestfulapi.design.strategy.ComplexRepaymentCapacity;
import com.project.demo.springbootrestfulapi.design.strategy.Constants;
import com.project.demo.springbootrestfulapi.design.strategy.HomeLoanInterestCalculator;
import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;
import com.project.demo.springbootrestfulclient.model.HomeLoanInterestBean;

/**
 * Spring boot Rest Api controller class.
 * 
 * @RestController : Combination of @Controller and @ResponseBody. Beans
 *                 returned are converted to/from JSON/XML
 *
 */
@RestController
public class RestApiController {
	/**
	 * Variable for logger
	 */
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	/**
	 * This method is used to calculate interest rate.
	 * 
	 * @return HomeLoanInterestBean
	 */
	@GetMapping("/homeLoanInterest")
	public HomeLoanInterestBean calculateInterest() {
		Double loHomeLoanInterest = Constants.DOUBLE_ZERO;
		HomeLoanInterestBean loHomeLoanInterestBean = null;
		// We have family of algorithms(calculating values various fields from different
		// files)
		// We are aware that we have these options(interfaces) to calculate interest
		// rate.
		// Runtime pass the required concrete class to calculate interest rate
		// Home Loan Interest rate is dependent on three major factor :
		// Creditworthiness of the applicant,Market Condition, Applicant’s
		// income/Repayment capacity
		try {
			logger.info("Start home loan interest rate");
			loHomeLoanInterestBean = new HomeLoanInterestBean();
			HomeLoanInterestCalculator homeLoanInterestCalculator = new HomeLoanInterestCalculator(
					new ComplexCreditWorthiness(), new ComplexMarketCondition(), new ComplexRepaymentCapacity());
			loHomeLoanInterest = homeLoanInterestCalculator.calculateInterest();
			loHomeLoanInterestBean.setHomeLoanInterest(loHomeLoanInterest);
			logger.info("Finish home loan interest rate");
		} catch (HomeLoanInterestException e) {
			logger.error("Error occured while calculating interest rate.");
		}
		return loHomeLoanInterestBean;
	}
}