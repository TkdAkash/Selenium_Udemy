package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex5_WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		Get Method
//		get()
//		getTitle()
//		getCurrentUrl()
//		getPageSource()
//		getWindowHandle()
//		getWindowHandles()
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrmlive.com/en/30-day-free-trial");
		
		Thread.sleep(3000);
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		System.out.println("Id: "+driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy.')]")).click();
		Set<String> windows = driver.getWindowHandles();
		
		for(String w: windows) {
			System.out.println(w);
		}
		
	}

}
