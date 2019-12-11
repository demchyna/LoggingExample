package com.softserve.academy;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {
	private final static Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {


		LOGGER.trace("This is trace level");

		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("This is debug level");
		}

		if(LOGGER.isInfoEnabled()){
			LOGGER.info("This is info level");
		}

		LOGGER.warn("This is warn level");
		LOGGER.error("This is error level");
		LOGGER.fatal("This is fatal level");
	}

}