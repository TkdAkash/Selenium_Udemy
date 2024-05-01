package apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File-->Workbook-->Sheet-->Rows-->Cells
		
//		InputStream file = new FileInputStream("C:\\Users\\2317322\\Selenium_Udemy\\SeleniumUdemy\\TestData\\Sample.xlsx");
		InputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Sample.xlsx\\");
		Workbook wb = new XSSFWorkbook(file);
		
		
//		using methods
		Sheet sheet = wb.getSheetAt(0);
//		Sheet sheet = wb.getSheet("Sheet1");
		int numberOfRows = sheet.getLastRowNum();
		int numberOfCells =  sheet.getRow(1).getLastCellNum();
		System.out.println("Rows: "+numberOfRows);
		System.out.println("Column: "+numberOfCells);
		for(int r=0; r<=numberOfRows;r++) {
			Row currentRow = sheet.getRow(r);
			for(int c=0; c<numberOfCells;c++) {
//				Cell cell = currentRow.getCell(c);
				String value = currentRow.getCell(c).toString();
//				String value = currentRow.getCell(c).getStringCellValue();
				System.out.print(value+"         ");
			}
			System.out.println();
		}		
		wb.close();
		file.close();
		
		
//		using iterator
//		Sheet sheet = wb.getSheet("Sheet1");
//		Iterator<Row> rowIterator = sheet.iterator();
//		
//		while(rowIterator.hasNext()) {
//			Row row = rowIterator.next();
//			Iterator<Cell> cellIterator = row.iterator();
//			
//			while(cellIterator.hasNext()) {
//				Cell cell = cellIterator.next();
//				System.out.println(cell);
//				
//			}
//			
//		}
		
		
	}

}
