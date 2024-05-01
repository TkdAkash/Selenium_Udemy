package day37.Parallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	
	@Test
	void test1() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		boolean status = driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		System.out.println(status);
		Assert.assertEquals(status, "true");
	}

}
