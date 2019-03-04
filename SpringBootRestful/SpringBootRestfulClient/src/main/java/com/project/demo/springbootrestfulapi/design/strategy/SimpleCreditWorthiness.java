package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

public class SimpleCreditWorthiness implements CreditWorthinessStrategy {

	@Override
	public Float getCreditWorthy(Sheet sheet) throws HomeLoanInterestException {
		for (Row row : sheet) {
			 for (Cell cell : row) {
			    	if(cell.getColumnIndex() == 1 && cell.getStringCellValue().equalsIgnoreCase(Constants.YES))
	            	{
	            		return new Float(0.5);
	            	}
			
			 }
		}
		return new Float(-0.5);
	}

}
