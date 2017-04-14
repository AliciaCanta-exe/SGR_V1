package com.cato.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class main {

	static final Logger logger = Logger.getLogger(main.class);	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");

	}

}
