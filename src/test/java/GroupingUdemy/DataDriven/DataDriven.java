package GroupingUdemy.DataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new EdgeDriver();
		
	}
	
	
	@Test(dataProvider = "dp")
	void login(String email, String pass) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		System.out.println(act_title+" : "+exp_title);
		
		Assert.assertEquals(act_title, exp_title);
		
		
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	
//	@DataProvider(name="dp")
	@DataProvider(name="dp",indices= {1})
	String[][] loginData(){
		
		String [][] data = {
				{"akash3@gmail.com","12"},
				{"akash123@gmail.com","akash1234"},
				{"akash123@gmail.com","akash1234"},
				{"akas3@gmail.com","aka123"},
				{"ash123@gmail.com","akash1"}
		};
		return data;
		
	}
	
}
