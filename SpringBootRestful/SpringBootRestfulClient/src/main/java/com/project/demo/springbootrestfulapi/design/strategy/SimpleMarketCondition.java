package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

public class SimpleMarketCondition implements MarketConditionStrategy {

	@Override
	public Float getMarketCondition(Sheet sheet) throws HomeLoanInterestException {
		for (Row row : sheet) {
			 for (Cell cell : row) {
				 if(cell.getColumnIndex() == 1 && cell.getStringCellValue().equalsIgnoreCase(Constants.HIGH))
	            	{
	            		return new Float(1.5);
	            	}
			 }
		}
		return new Float(-1.5);
	
	}

}
