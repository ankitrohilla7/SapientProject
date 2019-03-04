package com.project.demo.springbootrestfulclient.model;

/**
 * @author ankrohil1
 *
 */
public class HomeLoanInterestBean {
	 
    /**
     * 
     */
    private Double homeLoanInterestRate;
  
	/**
	 * @return
	 */
	public Double getHomeLoanInterest() {
		return homeLoanInterestRate;
	}

	/**
	 * @param homeLoanInterest
	 */
	public void setHomeLoanInterest(Double homeLoanInterest) {
		this.homeLoanInterestRate = homeLoanInterest;
	}
 
}