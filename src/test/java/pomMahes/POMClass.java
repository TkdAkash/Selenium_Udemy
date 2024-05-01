package pomMahes;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass {
	
	WebDriver driver;
	
//	Constructor
	public POMClass(WebDriver driver) {
		this.driver = driver;
	}
	
//	Locator
	By email = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	
	
//	Action method
	public void setEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);;
	}
	
	public void setPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void userLogin(String emailId,String pass) {
		this.setEmail(emailId);
		this.setPass(pass);
		this.clickLogin();
	}
}
