package log4jsample;

import org.apache.log4j.Logger;

public class Test1 {
	
	private static final Logger LOGGER = Logger.getLogger(Test1.class.getName());

	public Test1() {
		LOGGER.debug("Log4J debug");
		LOGGER.info("Log4J info");
		LOGGER.warn("Log4J warn");
		LOGGER.error("Log4J error");
		LOGGER.fatal("Log4J fatal");
	}
}
