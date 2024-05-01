package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex12_Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");  //demo
				
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo"); //demo
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//a[text()='Customers']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		int a = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
	}

}
