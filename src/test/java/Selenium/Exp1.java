package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		1) Launch browser
//	2) open url
//		https://opensource-demo.orangehrmlive.com/
//	3) Provide username  - Admin
//	4) Provide password  - admin123
//	5) Click on Login button 
//	6) Verify the title of dashboard page   
//		Exp title : OrangeHRM
//	7) close browser

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
//		String act_title= driver.getTitle();
//		String exp_title = "OrangeHRM";
//		
//		if(act_title.contains(exp_title)) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		driver.close();
//		driver.quit();
		Thread.sleep(4000);
		String act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp_label = "Dashboard";
		
		if(act_label.equals(exp_label)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
