package log4jsample;

import org.apache.log4j.Logger;

public class Test2 {
	private static final Logger LOGGER = Logger.getLogger(Test2.class.getName());

	public Test2() {
		LOGGER.debug("Log4J debug");
		LOGGER.info("Log4J info");
		LOGGER.warn("Log4J warn");
		LOGGER.error("Log4J error");
		LOGGER.fatal("Log4J fatal");
	}
}
