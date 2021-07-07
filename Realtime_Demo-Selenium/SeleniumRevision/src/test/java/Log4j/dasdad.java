package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dasdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger(dasdad.class);
		
		
		System.out.println("Hello World");

		log.info("Information");
		log.warn("Warning");
		log.error("Error Mesage");
		

	}

}
