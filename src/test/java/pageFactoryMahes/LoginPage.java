package pageFactoryMahes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setEmailId(String emailId) {
		email.sendKeys("akash@gmail.com");
	}
	
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void userLogin(String emailId,String password) {
		this.setEmailId(emailId);
		this.setPassword(password);
		this.clickLogin();
	}
	
}
