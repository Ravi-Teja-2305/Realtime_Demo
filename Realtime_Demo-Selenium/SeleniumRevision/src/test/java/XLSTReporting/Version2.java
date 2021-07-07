package XLSTReporting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Screenshots;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Version2 {

	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		report = new ExtentReports("ExtentReportVersion2.html");
		test = report.startTest("My First Test");
		
		WebDriverManager.chromedriver().setup();
		
		test.log(LogStatus.INFO, "Browser Started");
		
		driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com");
		
		test.log(LogStatus.INFO, "App is Up and Running");
		
		Screenshots obj = new Screenshots(driver);
		
		if("Complete Test Automation Bundle".equalsIgnoreCase(driver.getTitle())){
			
			
			String path1 = obj.TakeScreenshots("Title Verification Passed", driver);
			String image1 = test.addScreenCapture(path1);
			test.log(LogStatus.PASS, "Title Passed", image1);
			
		}
		
		else{
			
			
			String path2 = obj.TakeScreenshots("Title Verification Failed", driver);
			String image2 = test.addScreenCapture(path2);
			test.log(LogStatus.FAIL, "Title Failed", image2);
		}
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		report.endTest(test);
		report.flush();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus() == ITestResult.FAILURE){
			
			
			
		}
		
	}

}
