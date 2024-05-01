package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex4_Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		String str = driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
//		String str = driver.findElement(By.linkText("MacBook")).getText();
		System.out.println(str);
	}

}
