package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex13_Handle_Frames_Browsers {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.vision/demo/webtest/frames/");
		
//		frame1
		WebElement el1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(el1);
		driver.findElement(By.name("mytext1")).sendKeys("Akash Sharma");
		
		driver.switchTo().defaultContent();
		
//		frame2
		WebElement el2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(el2);
		driver.findElement(By.name("mytext2")).sendKeys("Akash Sharma");		
		
		driver.switchTo().defaultContent();
		
//		frame3
		WebElement el3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(el3);
		driver.findElement(By.name("mytext3")).sendKeys("Akash Sharma");		
	
		
//		Inner Frame 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		
	}

}
