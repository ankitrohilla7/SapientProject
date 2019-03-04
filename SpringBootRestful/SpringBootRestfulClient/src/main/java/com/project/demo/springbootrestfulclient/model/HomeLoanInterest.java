package com.project.demo.springbootrestfulclient.model;

public class HomeLoanInterest {
	 
    private Double homeLoanInterest;
  
    public HomeLoanInterest(Double homeLoanInterest) {
        this.setHomeLoanInterest(homeLoanInterest);
    }

	public Double getHomeLoanInterest() {
		return homeLoanInterest;
	}

	public void setHomeLoanInterest(Double homeLoanInterest) {
		this.homeLoanInterest = homeLoanInterest;
	}
 
}