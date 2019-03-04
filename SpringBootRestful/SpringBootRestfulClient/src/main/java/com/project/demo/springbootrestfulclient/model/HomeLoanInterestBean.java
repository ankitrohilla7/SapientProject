package com.project.demo.springbootrestfulclient.model;

/**This class provode bean for home loan interest rate
 * @author ankrohil1
 *
 */
public class HomeLoanInterestBean {
	 
    /**
     * Home Loan InterestRate variable
     */
    private Double homeLoanInterestRate;
  
	/**This method gets the interest rate
	 * @return homeLoanInterestRate
	 */
	public Double getHomeLoanInterest() {
		return homeLoanInterestRate;
	}

	/**This method set the interest rate
	 * @param homeLoanInterest
	 */
	public void setHomeLoanInterest(Double homeLoanInterest) {
		this.homeLoanInterestRate = homeLoanInterest;
	}
 
}