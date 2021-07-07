package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class MouseHovering extends BrowserOpen{
	
	@Test
	public void MouseHover() throws InterruptedException{
		
		WebElement mouseHover = driver.findElement(By.cssSelector("button#mousehover"));
		WebElement top = driver.findElement(By.xpath("//div[starts-with(@class,'mouse-hover-content')]//a[@href = '#top']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(mouseHover).perform();
		top.click();
		Thread.sleep(2000);
		
		
		
	}

}
