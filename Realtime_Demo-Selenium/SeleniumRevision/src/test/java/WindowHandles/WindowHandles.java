package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class WindowHandles extends BrowserOpen{
	
	@Test
	public void WindowHandle(){
		
		String Parent = driver.getWindowHandle();
		
		WebElement ele = driver.findElement(By.xpath("//button[text() = 'Open Window']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		Set<String> list = driver.getWindowHandles();
		
		System.out.println(list.size());
		
		for(String i : list){
			
			if(!Parent.equals(i)){
				driver.switchTo().window(i);
				System.out.println(driver.getTitle());
			}
			
		}
		
		driver.switchTo().window(Parent);
		driver.switchTo().defaultContent();
		
		
		
	}

}
