package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**Interface for Market Condition Strategy
 * @author ankrohil1
 *
 */
public interface RepaymentCapacityStrategy {
	
	/**This method provide algorithm for RepaymentCapacityStrategy interface
	 * @param sheet
	 * @return double value
	 * @throws HomeLoanInterestException
	 */
	public Double calculateRepaymentCapacity(Sheet sheet) throws HomeLoanInterestException;

}
