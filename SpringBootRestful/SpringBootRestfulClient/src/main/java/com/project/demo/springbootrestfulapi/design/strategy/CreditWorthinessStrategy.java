package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**Interface for Credit Worthiness Strategy
 * @author ankrohil1
 *
 */
public interface CreditWorthinessStrategy {
	
	/**This method provide algorithm for CreditWorthinessStrategy interface
	 * @param sheet
	 * @return float value
	 * @throws HomeLoanInterestException
	 */
	public Float getCreditWorthy(Sheet sheet) throws HomeLoanInterestException;

}
