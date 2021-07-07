package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class ScrollIntoView extends BrowserOpen{
	
	@Test
	public void ScrollIntoView() throws InterruptedException{
		
		WebElement ele = driver.findElement(By.cssSelector("button#mousehover"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(5000);
		
	}

}
