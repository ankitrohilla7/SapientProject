package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class ComplexMarketCondition implements MarketConditionStrategy {

	/* (non-Javadoc)
	 * @see com.project.demo.springbootrestfulapi.design.strategy.MarketConditionStrategy#getMarketCondition(org.apache.poi.ss.usermodel.Sheet)
	 */
	@Override
	public Float getMarketCondition(Sheet sheet) throws HomeLoanInterestException{
		Integer marketHighOrLowCount=Constants.INTEGER_ZERO;
		for (Row row : sheet) {
			 for (Cell cell : row) {
				 if(cell.getColumnIndex() == 1 && !cell.getStringCellValue().equalsIgnoreCase(Constants.HIGH))
	            	{
	            		marketHighOrLowCount++;
	            	}
			 }
		}
		return marketHighOrLowCount >3 ? new Float(1.5) : new Float(-1.5);
	}

}
