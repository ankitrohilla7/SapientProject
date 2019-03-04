package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public interface MarketConditionStrategy {
	
	/**
	 * @param sheet
	 * @return
	 * @throws HomeLoanInterestException
	 */
	public Float getMarketCondition(Sheet sheet) throws HomeLoanInterestException;

}
