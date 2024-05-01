package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex7_HandlingCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://demoqa.com/forms");
//		driver.findElement(By.xpath("//div[@class='element-group'][1]")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		driver.findElement(By.xpath("//span[text()='Home']")).click();

		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		List<WebElement> list =  driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element' ]"));
		
//		for(int i=0; i<list.size();i++) {
//			list.get(i).click();
//		}
		
		
//		selecting last two check box
//		4-2=2(starting index)
//		for(int i=2;i<list.size();i++) {
//			list.get(i).click();
//		}
		
//		selecting first two check box
//		for(int i=0;i<2;i++) {
//			list.get(i).click();
//		}
		
//		Or
//		for(int i=0;i<list.size();i++) {
//			if(i<2) {
//				list.get(i).click();
//			}
//		}
		
		
//		Unselect checkbox
//		for(int i=0; i<list.size();i++) {
//			list.get(i).click();
//		}
		
//		unselecting all checkboxes
//		for(int i=0; i<list.size();i++) {
//			list.get(i).click();
//		}
		
		
		
		for(int i=0; i<2;i++) {
			list.get(i).click();
		}
		
//		unselecting 2 checkboxes
		for(int i=0; i<list.size();i++) {
			
			if(list.get(i).isSelected()) {
				list.get(i).click();				
			}
		}
		

		
		
		
		
		
	}

}
