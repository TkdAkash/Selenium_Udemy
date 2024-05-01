package dataDrivenUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClass {
	
	WebDriver driver;
	
	@FindBy(id="principal")
	WebElement princ;
	
	@FindBy(id="interest")
	WebElement inter;
	
	@FindBy(id="tenure")
	WebElement period;
	
	@FindBy(id="tenurePeriod")
	WebElement tenuPeriod;
	
	@FindBy(id="frequency")
	WebElement freq;
	
	@FindBy(xpath = "//a[@onClick= 'return getfdMatVal(this);']//img")
	WebElement calButton;
	
	@FindBy(xpath = "//span[@id='resp_matval']/strong")
	WebElement value;
	
	@FindBy(xpath = "//a[@onClick= 'javascript:reset_fdcalcfrm();']//img")
	WebElement clearButton;
	
	public PomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setPrincipal(String principal) {
		princ.sendKeys(principal);
	}
	
	public void setInterest(String interest) {
		inter.sendKeys(interest);
	}
	
	public void setTenure(String tenure) {
		period.sendKeys(tenure);
	}
	
	public void setTenuPeriod(String period) {
		Select select = new Select(tenuPeriod);
		select.selectByVisibleText(period);
	}
	
	public void setFrequency(String frequency) {
		Select selFreq = new Select(freq);
		selFreq.selectByVisibleText(frequency);
//		freq.sendKeys(frequency);
	}
	
	public String getActValue() {
		return value.getText();
	}
	
	public void  clickClearButton() {
		clearButton.click();
	}
	
	public void setValues(String principal,String interest,String tenure,String period,String frequency) {
		this.setPrincipal(principal);
		this.setInterest(interest);
		this.setTenure(tenure);
		this.setTenuPeriod(period);
		this.setFrequency(frequency);
		calButton.click();
	}

}
