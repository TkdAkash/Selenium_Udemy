package pomMahes;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotLink {
	
	WebDriver driver;
	
	By forgotLink = By.partialLinkText("Log in with password");
	
	public ForgotLink(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickForgotLint() {
		driver.findElement(forgotLink).click();;
	}

}
