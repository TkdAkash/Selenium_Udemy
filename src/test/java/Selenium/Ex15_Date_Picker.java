package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex15_Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/10/2000");

		
		String month = "March";
		String year = "202";
		String date = "25";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(mon) && year.equals(yr)) {
				break;
			}
			
		
			
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Future date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Past date
		}
		
		
		List<WebElement> allDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		for(WebElement el:allDays) {
			if(el.getText().equals(date)) {
				el.click();
				break;
			}
		}
		
	}

}
