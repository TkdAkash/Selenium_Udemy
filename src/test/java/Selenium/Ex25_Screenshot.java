package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex25_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		
//		Capturing full page screenshot ----> This is available in selenium
//		Here driver is reference of webdriver type and ts is rteference of TakesScreenshot type
//		both are difference that's why we nwwd to type cast
//		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		now this screenshot got saved some where in the file
//		src act as reference of this screenshot file
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File("C:\\Users\\2317322\\Selenium_Udemy\\SeleniumUdemy\\Screenshots\\fullPage.png");
//		FileUtils.copyFile(src, target);
		
		
//		capturing screenshot of specific page
		
		WebElement featureProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = featureProduct.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\2317322\\Selenium_Udemy\\SeleniumUdemy\\Screenshots\\featrureProduct.png");
		FileUtils.copyFile(src, target);
		
		
	}

}
