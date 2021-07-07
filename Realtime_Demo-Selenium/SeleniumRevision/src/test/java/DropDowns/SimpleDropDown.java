package DropDowns;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClasses.BrowserOpen;
import Utility.Screenshots;

public class SimpleDropDown extends BrowserOpen{

	@Test
	public void DropDown() throws InterruptedException, IOException{
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement dd1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id = 'carselect']")));
		
		Select select = new Select(dd1);
		
		select.selectByIndex(1);
		
		Thread.sleep(3000);
		
		select.selectByValue("honda");
		
		Thread.sleep(3000);
		
		select.selectByVisibleText("BMW");
		
		Screenshots obj = new Screenshots(driver);
		obj.TakeScreenshots("Dropdown", driver);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://github.com/bonigarcia/webdrivermanager");
		
		obj.TakeScreenshots("github", driver);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		WebElement dd2 = driver.findElement(By.xpath("//*[contains(@name,'multiple-select-example')]"));
		
		Select select2 = new Select(dd2);
		
		List<WebElement> opt = select2.getOptions();
		
		for(WebElement ele : opt){
			
			System.out.println(ele.getText());
			
			SoftAssert assertion = new SoftAssert();
			assertion.assertEquals(ele.getText(), "Apple", "Values are not Equal");
			assertion.assertAll();
			
		}
		
		select2.selectByIndex(1);
		select2.selectByVisibleText("Peach");
		
		obj.TakeScreenshots("Multiple Select",driver);
		
		Thread.sleep(3000);
		
		
	}

}
