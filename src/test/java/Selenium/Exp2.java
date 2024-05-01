package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Exp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Apple");
//		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		
		
//		Thread.sleep(10000);
//		linkText
//		driver.findElement(By.partialLinkText("Personal")).click(); // Not working
//		driver.findElement(By.partialLinkText("Business")).click();
		
		
		
//		Finding multiple web elements ***********************************

//		1) Finding number of sliders
//		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
//		System.out.println("Number if sliders: "+sliders.size());

//		2)Finding number of img
//		List<WebElement> img = driver.findElements(By.tagName("img"));
//		System.out.println("Number of image: "+img.size());
		
//		3)Finding number of links
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Number if sliders: "+links.size());
		
		
//		Scenario1:  locator is matching with single web element.
//		-------
//		findElement(loc) ---->single webelement   WebElement
//		findElements(loc)--->single webelement		List<WebElement>
//
//		Scenario2: locator is matching with multiple web elements
//		------------------
//		findElement(loc)---->single webelement(first)    WebElement
//		findElements(loc) ---> multiple web elements      List<WebElement>
//
//		Scenario3: locator is incorect ( No elements are not matching with locator)
//		------
//		findElement(loc)----> NoSuchElementException
//		findElements(loc)--->returns zero
		
		
		
	}

}
