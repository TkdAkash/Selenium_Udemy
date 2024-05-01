package Selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_WebDriver_Conditional_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		
		Thread.sleep(3000);
//		WebElement logo = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo: "+ logo.isDisplayed());

//		OR
		
		boolean logo = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo);
	
		boolean search = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
		System.out.println(search);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement male_gen = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Male: "+male_gen.isSelected());
		
		male_gen.click();
		System.out.println("Male: "+male_gen.isSelected());
		
		
	}

}
