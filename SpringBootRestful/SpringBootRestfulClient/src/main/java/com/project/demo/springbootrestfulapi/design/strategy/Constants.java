package com.project.demo.springbootrestfulapi.design.strategy;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
    protected static final List<String> FILE_LIST = new ArrayList<>();

    static {
    	FILE_LIST.add("CreditWorthiness");
    	FILE_LIST.add("MarketCondition");
    	FILE_LIST.add("RepaymentCapacity");
    }
    
    private Constants() {
    	
    }
    
    public static final String FILE_EXT= ".xlsx";
    
    public static final String YES=  "yes";
    
    public static final String HIGH=  "high";
    
    public static final String FILES = "files/";
    
	public static final String FILE_EXTENSION = ".xlsx";
	
	public static final Double DOUBLE_ZERO = 0.0;
	
	public static final Integer INTEGER_ZERO = 0;


}
