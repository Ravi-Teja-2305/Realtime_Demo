package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshots{
	
	static WebDriver driver;
	
	public Screenshots(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	public String TakeScreenshots(String name, WebDriver driver) throws IOException{
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String dest = "./src/test/resources/Screenshots/" + name + ".png";
		
		System.out.println(dest);
		
		File f = new File(dest);
		
		FileUtils.copyFile(src, f);
		
		return dest;
		
	}

}
