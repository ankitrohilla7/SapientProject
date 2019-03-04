package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**This is one of the concrete implementation for CreditWorthinessStrategy interface
 * @author ankrohil1
 *
 */
public class SimpleCreditWorthiness implements CreditWorthinessStrategy {

	/* (non-Javadoc)
	 * @see com.project.demo.springbootrestfulapi.design.strategy.CreditWorthinessStrategy#getCreditWorthy(org.apache.poi.ss.usermodel.Sheet)
	 */
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
