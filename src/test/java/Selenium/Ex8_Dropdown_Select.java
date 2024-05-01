package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex8_Dropdown_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1)Dropdown having select tag in DOM
		WebElement day =  driver.findElement(By.cssSelector(".form-control"));
		Select selDay = new Select(day);
		selDay.selectByVisibleText("Monday");
		selDay.selectByIndex(2);
		selDay.selectByValue("Tuesday");
		
//		2)Fiding total option in select tag
		 List<WebElement> totalOption = selDay.getOptions();
		 System.out.println("Total opttion: "+totalOption.size());
		 
//		 3)printing option in console window
//		 for(int i=0; i<totalOption.size();i++) {
//			 System.out.println(totalOption.get(i).getText());
//		 }
		
		 for(WebElement w : totalOption ) {
			 System.out.println(w.getText());
		 }
		 
		 
	}

}
