package com.project.demo.springbootrestfulapi.design.strategy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**This is one of the concrete implementation for CreditWorthinessStrategy interface
 * @author ankrohil1
 *
 */
public class ComplexCreditWorthiness implements CreditWorthinessStrategy {

	/* (non-Javadoc)
	 * @see com.project.demo.springbootrestfulapi.design.strategy.CreditWorthinessStrategy#getCreditWorthy(org.apache.poi.ss.usermodel.Sheet)
	 */
	@Override
	public Float getCreditWorthy(Sheet sheet) throws HomeLoanInterestException {
		Integer paymentDueCout=Constants.INTEGER_ZERO;		
		for (Row row : sheet) {
			 for (Cell cell : row) {
				 if(cell.getColumnIndex() == 1 && cell.getStringCellValue().equalsIgnoreCase(Constants.YES))
		        	{
		        		paymentDueCout++;
		        	} 
			 }
		}
		return paymentDueCout >1 ? new Float(0.5) : new Float(-0.5);
		
	}

}
