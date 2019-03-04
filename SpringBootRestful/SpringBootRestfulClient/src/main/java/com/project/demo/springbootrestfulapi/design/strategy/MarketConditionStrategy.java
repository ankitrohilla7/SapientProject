package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**Interface for Market Condition Strategy
 * @author ankrohil1
 *
 */
public interface MarketConditionStrategy {
	
	/**This method provide algorithm for MarketConditionStrategy interface
	 * @param sheet
	 * @return float value
	 * @throws HomeLoanInterestException
	 */
	public Float getMarketCondition(Sheet sheet) throws HomeLoanInterestException;

}
