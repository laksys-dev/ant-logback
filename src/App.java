import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	public static void main(String[] args){
		System.out.println("----- logging example -----");

		Logger logger = LoggerFactory.getLogger(App.class);

		logger.trace("this is trace message...");
		logger.debug("this is debug message...");
		logger.info("Welcome to java logging...");
		logger.warn("this is warning message...");
		logger.error("this is error message...");

		System.out.println("----- ends -----");
	}
}
