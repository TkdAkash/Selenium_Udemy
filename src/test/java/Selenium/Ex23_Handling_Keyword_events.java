package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex23_Handling_Keyword_events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver", "");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("text1")).sendKeys("Hello, This is akash here....");
	
//		Copy paste ************************************

		Actions act = new Actions(driver);
//		ctr + a		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
//		ctr + c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
//		Tab
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform(); //This is used only if we have to press single key
		
//		ctr + v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				
		
		
		
	}

}
