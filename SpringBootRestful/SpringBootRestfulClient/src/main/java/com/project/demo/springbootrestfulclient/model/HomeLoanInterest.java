package com.project.demo.springbootrestfulclient.model;

public class HomeLoanInterest {
	 
    private Double homeLoanInterestRate;
  
    public HomeLoanInterest(Double homeLoanInterest) {
        this.setHomeLoanInterest(homeLoanInterest);
    }

	public Double getHomeLoanInterest() {
		return homeLoanInterestRate;
	}

	public void setHomeLoanInterest(Double homeLoanInterest) {
		this.homeLoanInterestRate = homeLoanInterest;
	}
 
}