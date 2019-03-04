package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * @author ankrohil1
 *
 */
public class ComplexRepaymentCapacity implements RepaymentCapacityStrategy{

	/* (non-Javadoc)
	 * @see com.project.demo.springbootrestfulapi.design.strategy.RepaymentCapacityStrategy#calculateRepaymentCapacity(org.apache.poi.ss.usermodel.Sheet)
	 */
	@Override
	public Double calculateRepaymentCapacity(Sheet sheet) throws HomeLoanInterestException {
		Double calculateSalary= Constants.DOUBLE_ZERO;
		for (Row row : sheet) {
			 for (Cell cell : row) {
				 if(cell.getColumnIndex() == 1 && cell.getRowIndex()!=0)
	            	{
	            		calculateSalary = calculateSalary + (Double) cell.getNumericCellValue();
	            	}
			 }
		}
		return calculateSalary/100000;
	
	}
	
}
