package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

public interface RepaymentCapacityStrategy {
	
	public Double calculateRepaymentCapacity(Sheet sheet) throws HomeLoanInterestException;

}
