package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//		Thread.sleep(3000);
//		Tag ID ---> # (Seperator)
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Samsung");
		
//		Tag Class ---> . (Seperator)
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Vivo");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Vivo");
		
//		Tag Attribute ---> [] (Seperator)
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Poco");
		
//		Tag class Attribute ---> . [] (Seperator)		
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("MI");
//		driver.findElement(By.cssSelector(".search-box-text[id='small-searchterms']")).sendKeys("MI");
		
	}

}

