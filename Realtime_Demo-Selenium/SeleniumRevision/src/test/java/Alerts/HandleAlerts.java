package Alerts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class HandleAlerts extends BrowserOpen{
	
	@Test
	public void HandleAlerts(){
		
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		
		driver.switchTo().alert().getText();
		
	}

}
