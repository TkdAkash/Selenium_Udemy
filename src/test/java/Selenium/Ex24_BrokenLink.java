package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex24_BrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size()); //48
		
		int brokenlinks=0;
		
		for(WebElement linkEle:links) {
			
			String linkValue = linkEle.getAttribute("href");
			
			// pre-requisite for checking broken link
			if(linkValue == null || linkValue.isEmpty()) {
				System.out.println("href attribute value is empty.");
				continue;
			}
			
			//Checking link is broken or not
			URL url = new URL(linkValue);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(linkValue+"     "+"====> Broken Link");
				brokenlinks++;
			}
			else
			{
				System.out.println(linkValue+"     "+"====> Not Broken Link");
			}
			
			
		}
		
		System.out.println("total number of broken links:"+brokenlinks);
			
			
			
			
		}

	

}
