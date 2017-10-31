/**
 * Log4j example
 * @author fpeignot
 *
 */

import org.apache.log4j.Logger;

public class Log4jExample {

	final static Logger logger = Logger.getLogger(Log4jExample.class);

	public static void main(String[] args) {
				
		System.out.println("Log4j example");

		String parameter = "hello";
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

		System.out.println("Bye");
	}

}
