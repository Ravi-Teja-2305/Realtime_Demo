package BaseClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.Screenshots;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	
	public static WebDriver driver;
	
	//@BeforeSuite
	@Test
	public void OpenBrowser() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Screenshots obj = new Screenshots(driver);
		obj.TakeScreenshots("1st page", driver);
		
	}
	
	@AfterSuite
	public void BrowserClose(){
		
		driver.close();
		
	}

}
