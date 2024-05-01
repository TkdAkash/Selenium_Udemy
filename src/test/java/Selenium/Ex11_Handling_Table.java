package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate;

public class Ex11_Handling_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		1) Find Total number of rows
		List<WebElement> tableRowList = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(tableRowList.size());
		
//		2) Find total number of column
		List<WebElement> tableColumnList = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println(tableColumnList.size());
		
//		3)Read specific row and column
		String el = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(el);
		
//		4)Read data from all row and column
//		for(int r=2; r<=tableRowList.size();r++) {
//			for(int c=1;c<=tableColumnList.size();c++) {
//				String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.println(values);
//			}
//		}
		
		
//		5) print book name whose author is amit
		for(int r=2; r<=tableRowList.size();r++) {
			String autor = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(autor.equalsIgnoreCase("amit")) {
				String ans = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(ans);
			}
		
		}
		
//		6) Find sum of prices for all the books
		int sum=0;
		for(int i=2; i<=tableRowList.size();i++) {
			int price = Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText()) ;
			sum += price;
		}
		
		System.out.println("Sum is: "+sum);
		
	}
		

}
