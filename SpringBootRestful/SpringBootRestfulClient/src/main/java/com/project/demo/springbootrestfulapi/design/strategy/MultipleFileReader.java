package com.project.demo.springbootrestfulapi.design.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.demo.springbootrestfulapi.exception.HomeLoanInterestException;

/**
 * Class to read multiple file parallely
 * 
 * @author ankrohil1
 *
 */
public class MultipleFileReader implements Callable<Sheet> {
	/**
	 * Variable for file name
	 */
	private String fileName;

	/**
	 * Constructor to initialize variable
	 * 
	 * @param fileName
	 */
	public MultipleFileReader(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Sheet call() throws HomeLoanInterestException {
		return readMultipleFiles(fileName);
	}

	/**
	 * This method will return the excel sheet element read by individual thread
	 * 
	 * @param fileName
	 * @return sheet
	 * @throws HomeLoanInterestException
	 */
	private Sheet readMultipleFiles(String fileName) throws HomeLoanInterestException {
		ClassLoader classLoader;
		File file;
		FileInputStream inputStream;
		Workbook workbook;
		Sheet sheet = null;
		try {
			classLoader = getClass().getClassLoader();
			file = new File(classLoader.getResource(Constants.FILES + fileName + Constants.FILE_EXTENSION).getFile());
			inputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(inputStream);
			sheet = workbook.getSheetAt(0);
		} catch (IOException loException) {
			throw new HomeLoanInterestException("Exception occured while reading excel files" + loException);
		}
		return sheet;
	}

}
