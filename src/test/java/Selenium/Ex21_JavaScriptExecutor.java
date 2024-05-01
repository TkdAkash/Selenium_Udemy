package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex21_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WebDriver driver = new EdgeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		Or
		
//		EdgeDriver driver = new EdgeDriver();
//		JavascriptExecutor js = driver;

		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement name = driver.findElement(By.cssSelector("#name"));
		
//		SendKeys
//		js.executeScript("arguments[0].setAttribute('value','Akash')",name);
		js.executeScript("arguments[0].value='Akash'",name);

		
//		click
//		WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
//		js.executeScript("arguments[0].click()", radioButton);
		
//		js.executeScript("window.scrollBy(0,3000)", "");
		
		
//		getting loction 
//		js.executeScript("return window.pageYOffset;");
		
		
//		scroll down till page is present
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
//		js.executeScript("arguments[0].scrollIntoView()", radioButton);
		
		
//		scroll down till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
