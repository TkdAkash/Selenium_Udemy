package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex10_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebDriverWait drWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
//		Alert button with ok/cancel button
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
//		Alert alert = driver.switchTo().alert();
//		Alert alert = drWait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
		
//		Thread.sleep(3000);
//		alert.accept(); //This will close alert window using Ok button
//		alert.dismiss(); //This will close alert window using Ok button
		
		
		
//		//		Alert button with text area
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Akash");
//		alert.accept();
//		
//		String act_reslut = driver.findElement(By.xpath("//p[@id='result']")).getText();
//		String exp_result = "You entered: Akash";
//		if(act_reslut.equals(exp_result)) {
//			System.out.println("Test case passed");
//		}
//		else {
//			System.out.println("Not passed");
//		}
	
	
	
//	Alert with username ans password without button
//		https://the-internet.herokuapp.com/basic_auth
//		https://admin:admin@the-internet.herokuapp.com/basic_auth

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
	}

		
		
}
