package ReusableComponent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogUtil {
	private static Logger LogObj = LogManager.getLogger(LogUtil.class);
	public static void startTestCase(String testCaseName){
		LogObj.info(testCaseName);
	}

	//This is to print log for the ending of the test case

	public static void endTestCase(String testCaseName){
		LogObj.info("Test Case "+testCaseName+ " End");
	}

	public static void info(String msg) {
		LogObj.info(msg);
	}
	public static void warn(String msg) {
		LogObj.warn(msg);
	}
	public static void error(String msg) {
		LogObj.error(msg);
	}

	public static void fatal(String msg) {
		LogObj.fatal(msg);
	}

}
