package com.project.demo.springbootrestfulapi.design.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

public class HomeLoanInterestCalculator {

	CreditWorthinessStrategy creditWorthinessStrategy;
	MarketConditionStrategy marketConditionStrategy;
	RepaymentCapacityStrategy repaymentCapacityStrategy;

	public HomeLoanInterestCalculator(CreditWorthinessStrategy creditWorthinessStrategy,
			MarketConditionStrategy marketConditionStrategy, RepaymentCapacityStrategy repaymentCapacityStrategy) {
		this.creditWorthinessStrategy = creditWorthinessStrategy;
		this.marketConditionStrategy = marketConditionStrategy;
		this.repaymentCapacityStrategy = repaymentCapacityStrategy;
	}

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
