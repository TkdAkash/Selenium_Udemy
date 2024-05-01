package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Dialect;

public class Ex16_Hidden_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[2]//i")).click();
		List<WebElement> elemens = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));
		
		for(WebElement el:elemens) {
			
			if(el.getText().equals("HR Manager")) {
				el.click();	
			}
//			System.out.println(el.getText());
			
		}
		
	}

}
