package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class JavaScriptExecutorMethods extends BrowserOpen{
	
	@Test
	public void Methods() throws InterruptedException{
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='benzradio']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		
		WebElement i = driver.findElement(By.xpath("//input[@id='hondacheck']"));
		
		js.executeScript("arguments[0].click();", i);
		
		WebElement j = driver.findElement(By.xpath("//input[@id='name'][1]"));
		
		js.executeScript("document.getElementById('name').value = 'Ravi Teja';", j);
		
		Thread.sleep(2000);
		
	}

}
