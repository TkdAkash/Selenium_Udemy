package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex18_Drap_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		WebDriverManager.chromedriver().setup();
		
//		Drag and Drop ***********************************************88
//		WebDriver driver =new ChromeDriver();
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.manage().window().maximize();
//		
//		Actions act=new Actions(driver);
//		
//		// rome---> Italy
//		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
//		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
//		
//		act.dragAndDrop(rome, italy).perform(); // drag and drop
//		
//		
//		// Wasington---> USA
//		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
//		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
//		
//		act.dragAndDrop(washington, usa).perform();
//		
//		
////		Seoul -->Denmark
//		WebElement Seoul=driver.findElement(By.xpath("//div[@id='box5']"));
//		WebElement Denmark=driver.findElement(By.xpath("//div[@id='box104']"));
//
//		act.dragAndDrop(Seoul, Denmark);
//		
		
		
//		Slider************************************************************
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//Min slider
				WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
				System.out.println("Current location of min slider:"+min_slider.getLocation());  //(59, 250) x,y
				act.dragAndDropBy(min_slider, 100, 250).perform();
				System.out.println("Location of min slider After moving:"+min_slider.getLocation());  

				//Max slider
				WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
				System.out.println("Current location of max slider:"+max_slider.getLocation()); //(796, 250)
				
				act.dragAndDropBy(max_slider, -96, 250).perform();
				System.out.println("Location of max slider after moving:"+max_slider.getLocation()); 
		
		
		
	}

}
