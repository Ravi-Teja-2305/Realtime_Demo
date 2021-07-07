package iFrames;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class iFrames extends BrowserOpen{
	
	@Test
	public void iFramesControl() throws InterruptedException{
		
		//driver.findElement(By.xpath("//iframe[@name = 'iframe-name']"));
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//select[@name = 'categories']")).click();
		Thread.sleep(3000);
		
	}

}
