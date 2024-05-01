package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex9_Auto_Suggestion_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

//		clicking on serach button
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		
		Thread.sleep(4000);
//		fetching list of all element
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d') and @role='presentation']//span"));
		System.out.println("Size: "+list.size());
		
//		printing value in console
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
//		selecting 1 option 
		for(int i=0 ; i<list.size(); i++) {
			String str = list.get(i).getText();
			if(str.equals("selenium tutorial")) {
				list.get(i).click();
				break;
			}
		}
		
		
	}

}
