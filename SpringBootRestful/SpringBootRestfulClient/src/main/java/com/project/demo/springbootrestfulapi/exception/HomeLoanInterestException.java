package com.project.demo.springbootrestfulapi.exception;

/**
 * Exception created for this project. Applciation will wrap all other exception
 * to this exception.
 * 
 * @author ankrohil1
 *
 */
public class HomeLoanInterestException extends Exception {
	/**
	 * Variable for serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor to intialization
	 * 
	 * @param s
	 */
	public HomeLoanInterestException(String s) {
		super(s);
	}
}
