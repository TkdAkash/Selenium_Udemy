package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex8_Dropdown_Without_Select_Tage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		clicling on dropdown
		driver.findElement(By.cssSelector(".btn-group")).click();
		
//		Selecting 1 option
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='jQuery']")).click();
		
//		ul[contains(@class,'multiselect-container')]//li//a//label
		//ul[contains(@class,'multiselect-container')]//label   Both are correct
		
		
//   	Getting size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		System.out.println("Total options: "+options.size());
		
//		printing value in console
		for(int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
//      selecting option 
		for(int i=0; i<options.size();i++) {
			if(options.get(i).getText().equals("Java")) {
				options.get(i).click();
				break;
			}
		}
		
		
	}

}
