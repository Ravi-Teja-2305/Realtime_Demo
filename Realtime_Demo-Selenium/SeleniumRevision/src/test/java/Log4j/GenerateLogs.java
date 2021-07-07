package Log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenerateLogs{
	
	@Test
	public static void GenLog4j() {
		
		Logger log = LogManager.getLogger(GenerateLogs.class);
		
		//PropertyConfigurator.configure("G:\\Rest Assured Automation Testing\\Eclipse Practice\\workspace\\SeleniumRevision\\log4j.properities");
		
		/*log.info("Initiating WebDriver");
		
		log.error("Error Came");
		
		WebDriverManager.chromedriver().setup();
		
		log.info("Opening Chrome Driver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		log.info("OPened URL");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		
		System.out.println("Hello World");

		log.info("Information");
		log.warn("Warning");
		log.error("Error Mesage");

	}

}
