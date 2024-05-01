package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class Ex17_Handle_mouse_events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Mouse hover *****************************************************************
//		WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//		
//		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
//		WebElement mca = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(desktop).moveToElement(mca).click().build().perform(); create action & then perform
//		action.moveToElement(desktop).moveToElement(mca).click().perform(); //perform action
		
		
//		Right click *************************************************************************
//		WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
//		driver.manage().window().maximize();
//		
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(rightClick).perform();
//		
//		driver.findElement(By.xpath("//span[text()='Copy']")).click();
//		
//		Alert alrt = driver.switchTo().alert();
//		System.out.println(alrt.getText());
//		alrt.accept();
		
		
//		Double click **********************************************************************************
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
//		
		driver.switchTo().frame("iframeResult");
		WebElement input = driver.findElement(By.id("field1"));
		input.clear();
		input.sendKeys("Akash");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions action = new Actions(driver);
		action.doubleClick(button).perform();
		

	}

}
