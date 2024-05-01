package pomMahes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		POMClass pomClass = new POMClass(driver);
		pomClass.userLogin("akash@gmail.com", "akash123");
		
		
		Thread.sleep(5000);
		ForgotLink forgotLink = new ForgotLink(driver);
		forgotLink.clickForgotLint();
		

	}

}
