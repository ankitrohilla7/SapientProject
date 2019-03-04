package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public interface RepaymentCapacityStrategy {
	
	/**
	 * @param sheet
	 * @return
	 * @throws HomeLoanInterestException
	 */
	public Double calculateRepaymentCapacity(Sheet sheet) throws HomeLoanInterestException;

}
