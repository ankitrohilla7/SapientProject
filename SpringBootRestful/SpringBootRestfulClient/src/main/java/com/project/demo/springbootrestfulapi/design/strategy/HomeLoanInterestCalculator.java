package com.project.demo.springbootrestfulapi.design.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**Class to calculate home loan interest rate
 * @author ankrohil1
 *
 */
public class HomeLoanInterestCalculator {

	/**
	 * Variable for Credit Worthiness Strategy
	 */
	CreditWorthinessStrategy creditWorthinessStrategy;
	/**
	 * Variable for Market Condition Strategy
	 */
	MarketConditionStrategy marketConditionStrategy;
	/**
	 * Variable for Repayment Capacity Strategy
	 */
	RepaymentCapacityStrategy repaymentCapacityStrategy;

	/**Consrtcutor to inittialize variable
	 * @param creditWorthinessStrategy
	 * @param marketConditionStrategy
	 * @param repaymentCapacityStrategy
	 */
	public HomeLoanInterestCalculator(CreditWorthinessStrategy creditWorthinessStrategy,
			MarketConditionStrategy marketConditionStrategy, RepaymentCapacityStrategy repaymentCapacityStrategy) {
		this.creditWorthinessStrategy = creditWorthinessStrategy;
		this.marketConditionStrategy = marketConditionStrategy;
		this.repaymentCapacityStrategy = repaymentCapacityStrategy;
	}

	/**Method to calculate interest rate
	 * @return interest rate 
	 * @throws HomeLoanInterestException
	 */
	public Double calculateInterest() throws HomeLoanInterestException {
		Integer repoRate;
		ExecutorService loExecutorService;
		List<Future<Sheet>> futureTaskList;
		try {
			repoRate=Constants.INTEGER_ZERO;
			// executor frame work to read multiple files
			loExecutorService = Executors.newFixedThreadPool(3);
			futureTaskList = new ArrayList<>();
			for (String fileName : Constants.FILE_LIST) {
				futureTaskList.add(loExecutorService.submit(new MultipleFileReader(fileName)));
			}
			return repoRate + this.creditWorthinessStrategy.getCreditWorthy(futureTaskList.get(0).get())
					+ this.marketConditionStrategy.getMarketCondition(futureTaskList.get(1).get())
					+ this.repaymentCapacityStrategy.calculateRepaymentCapacity(futureTaskList.get(2).get());
		
		} catch (InterruptedException | ExecutionException | HomeLoanInterestException loException) {
			throw new HomeLoanInterestException("Exception occured while calculating interest rate" + loException);
		}
	}


}
