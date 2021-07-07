package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClasses.BrowserOpen;

public class BrokenLinks extends BrowserOpen{
	
	@Test
	public void FindBrokenLinks() throws IOException{
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		WebElement footer = driver.findElement(By.xpath("//div[contains(@class, 'footer')][1]"));
		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		
		for(WebElement i : footerLinks){
			
			System.out.println("Footer Link : " + i.getAttribute("href"));
			
		}
		
		for(WebElement ele : links){
			
			//System.out.println(ele.getAttribute("href"));
			String link = ele.getAttribute("href");
			CheckURL(link);
			
		}
	}
	
	public void CheckURL(String link) throws IOException{
		
		URL url = new URL(link);
		HttpURLConnection hc = (HttpURLConnection)url.openConnection();
		hc.setConnectTimeout(3000);
		hc.connect();
		
		if(hc.getResponseCode() == 200){
			
			System.out.println(link + " : " + hc.getResponseCode());
			
		}
		
		else{
			
			System.out.println(link + " : " + hc.getResponseCode());
			
		}
	}

}
