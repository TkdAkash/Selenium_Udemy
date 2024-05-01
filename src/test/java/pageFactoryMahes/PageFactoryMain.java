package pageFactoryMahes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pomMahes.POMClass;

public class PageFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.userLogin("akash@gmail.com", "akash123");

	}

}
