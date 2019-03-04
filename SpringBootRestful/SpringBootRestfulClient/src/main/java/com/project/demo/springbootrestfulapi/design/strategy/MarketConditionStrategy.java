package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

public interface MarketConditionStrategy {
	
	public Float getMarketCondition(Sheet sheet) throws HomeLoanInterestException;

}
