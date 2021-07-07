package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class ScrollBy extends BrowserOpen{
	
	@Test
	public void ScrollBy() throws InterruptedException{
		
		WebElement ele = driver.findElement(By.cssSelector("button#mousehover"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,200)");
		Thread.sleep(5000);
		
	}
	

}
