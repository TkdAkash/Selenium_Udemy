package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex14_Handle_Browser_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();

		/*
		 * // Approach 1 // driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 * // capture id's for browser window Set<String> windowIDS =
		 * driver.getWindowHandles();
		 * 
		 * List<String > windowIDSList = new ArrayList<String>(windowIDS);
		 * 
		 * String parent = windowIDSList.get(0); String child = windowIDSList.get(1);
		 * 
		 * // switch to child window driver.switchTo().window(child);
		 * driver.findElement(By.
		 * xpath("//div[@class='d-flex web-menu-btn']//button[text()='Contact Sales']"))
		 * .click(); driver.switchTo().window(parent); //
		 */

//		Set<String> windows = driver.getWindowHandles();

//		for(String winId:windows) {
//			
//			String title1 = driver.switchTo().window(winId).getTitle();
//			if(title1.equals("OrangeHRM")) {
//				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//			}
//			else if(title1.equals("Human Resources Management Software | OrangeHRM")) {
//				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//button[text()='Contact Sales']")).click();
//			}
//			
//		}

//		close 
//		for(String winId:windows) {
//			
//			String title1 = driver.switchTo().window(winId).getTitle();
//			
//			if(title1.equals("OrangeHRM")) {
//				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//				driver.close();
//			}
//			else if(title1.equals("Human Resources Management Software | OrangeHRM")) {
//				driver.close();
//			}
//			
//		}

//		Assignmemt
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div[1]//a")).click();
		driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div[2]//a")).click();
		driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div[3]//a")).click();
		driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div[4]//a")).click();
		driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div[5]//a")).click();

		Set<String> windows = driver.getWindowHandles();

		for (String Ids : windows) {

			System.out.println(Ids);
		}

		for (String Ids : windows) {
			String title = driver.switchTo().window(Ids).getTitle();
//			System.out.println(title);
			if (title.equals("Automation Testing Practice")) {
				driver.close();
			}
			if (title.equals("Selenium disulfide - Wikipedia")) {
				driver.close();
			}
			if (title.equals("Selenium (software) - Wikipedia")) {
				driver.close();
			}
//			if (title.equals("Selenium - Wikipedia")) {
//				driver.close();
//			}
//			if (title.equals("Selenium in biology - Wikipedia")) {
//				driver.close();
//			}
			if (title.equals("Selenium dioxide - Wikipedia")) {
				driver.close();
			}

		}

	}

}
