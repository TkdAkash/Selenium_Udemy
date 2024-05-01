package day37.Parallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters(value={"browser","url"})
	void setup(String br,String ur) throws InterruptedException {
		
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver = new EdgeDriver();			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(ur);
		Thread.sleep(5000);
	}

	@Test(priority=1)
	void testLogo() {
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))).isDisplayed();
//			boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			Assert.fail();	
		}
		
		
	}
	
	@Test(priority = 2)
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are bot matched..");
	}
	
	@AfterClass
	void tearDown() {
		
	}
	
	
}
