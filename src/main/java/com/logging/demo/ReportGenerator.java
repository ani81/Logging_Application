package com.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportGenerator {

	// intialing logger object for current class
	
	private static final Logger logger = LoggerFactory.getLogger( ReportGenerator.class.getName());
	
	public static void main(String[] args) {
		logger.trace("Tracer message");
		  logger.debug("Debug message");
	        logger.info("Info message");
	        logger.warn("Warning message");
	        logger.error("Error message");
	       
	
		
		
		
	}
	
}
