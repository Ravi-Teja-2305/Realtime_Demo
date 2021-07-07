package Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class HighLightElements extends BrowserOpen{
	
	@Test
	public void HighLightElements() throws InterruptedException{
		
		WebElement ele = driver.findElement(By.xpath("//label[@for='bmw'][1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','border:solid 2px red')", ele);
		
		Thread.sleep(3000);
		
	}

}
