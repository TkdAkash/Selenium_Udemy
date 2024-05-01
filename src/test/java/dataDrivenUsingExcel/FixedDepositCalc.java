package dataDrivenUsingExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FixedDepositCalc {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
//		WebElement pop1 = driver.findElement(By.className("wzrk-alert wiz-show-animate"));
//		if(pop1.isDisplayed()) {
//			driver.findElement(By.id("wzrk-cancel")).click();
//		}
		
//		WebElement pop2 = driver.findElement(By.className("modal-content cashback_popup for_nonpro_users"));
//		if(pop2.isDisplayed()) {
//			
//		}
		
//		InputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
//		Workbook wb = new XSSFWorkbook(fi);
		String fPath = System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		String sheetName = "Sheet1";
		int row = ExcelUtility.getRowCount(fPath, sheetName);
		System.out.println(row);
		
		for(int r=1;r<=row;r++) {
			
//			getting data dfrom excel
			String principal = ExcelUtility.getCellData(fPath, sheetName, r, 0);
			String rateOfInterest = ExcelUtility.getCellData(fPath, sheetName, r, 1);
			String period = ExcelUtility.getCellData(fPath, sheetName, r, 2);
			String years = ExcelUtility.getCellData(fPath, sheetName, r, 3);
			String frequency = ExcelUtility.getCellData(fPath, sheetName, r, 4);
			String Exp_Maturity_Value = ExcelUtility.getCellData(fPath, sheetName, r, 5);
//			String expectedValue = ExcelUtility.getCellData(fPath, sheetName, r, 6);
//			System.out.println(principal);
			
//			Pass data into excel
			PomClass pomClass = new PomClass(driver);
			pomClass.setValues(principal, rateOfInterest, period, years, frequency);
			
//			validate result  & pass result into eccel
			String Act_Maturity_Value = pomClass.getActValue();
			if(Double.parseDouble(Act_Maturity_Value) ==Double.parseDouble(Exp_Maturity_Value) ) {
				System.out.println("Test Case Passed!!!");
				ExcelUtility.setCellData(fPath, sheetName, r, 7, "Passed");
				ExcelUtility.fillGreenColour(fPath, sheetName, r, 7);
				System.out.println(Act_Maturity_Value);
			}
			else {
				ExcelUtility.setCellData(fPath, sheetName, r, 7, "Failed");
				ExcelUtility.fillGRedColour(fPath, sheetName, r, 7);
			}
			
			Thread.sleep(3000);
			pomClass.clickClearButton();
			
		}

	}

}
