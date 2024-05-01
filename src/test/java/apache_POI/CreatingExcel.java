package apache_POI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlxs");
//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet();
		
//		Cell cell = sheet.createRow(0).createCell(1);
//		cell.setCellValue("Akash");
		
//		Row row = sheet.createRow(0);
//		row.createCell(1).setCellValue("a");
//		row.createCell(2).setCellValue("b");
//		row.createCell(3).setCellValue("c");
//		
//		Row row1 = sheet.createRow(1);
//		row1.createCell(1).setCellValue("d");
//		row1.createCell(2).setCellValue("e");
//		row1.createCell(3).setCellValue("f");
		
		
//		using for loop
		
//		for(int r=0; r<=5;r++) {
//			Row row = sheet.createRow(r);
//			for(int c=0; c<6; c++) {
//				row.createCell(c).setCellValue("Akash");
//			
//			}
//		}
//		
//		workbook.write(file);
//		workbook.close();
//		file.close();
		
		
		
//		*********************************Mahes
//		OutputStream file = new FileOutputStream("newSample.xlxs");
//		Workbook wb = new XSSFWorkbook();
//		Sheet sheet =  wb.createSheet();
//		Row row = sheet.createRow(2);
//		Cell cell = row.createCell(5);
//		cell.setCellValue("Akash");
//		
//		wb.write(file);
		
		OutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\newSample.xlsx");
		
		Workbook wb = new XSSFWorkbook();
		Sheet sheet =  wb.createSheet();
//		Row row0 = sheet.createRow(0);
//		row0.createCell(0).setCellValue("Akash");
//		row0.createCell(1).setCellValue("Akash");
//		row0.createCell(2).setCellValue("Vikash");
//		row0.createCell(3).setCellValue("Kartik");
//		
//		Row row1 = sheet.createRow(1);
//		row1.createCell(0).setCellValue("Akash");
//		row1.createCell(1).setCellValue("Akash");
//		row1.createCell(2).setCellValue("Vikash");
//		row1.createCell(3).setCellValue("Kartik");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row: ");
		int rowSize = sc.nextInt();
		System.out.println("Enter number of Column: ");
		int colSize = sc.nextInt();
		for(int r=0; r<rowSize;r++) {
			Row row = sheet.createRow(r);
			System.out.println("Enter "+colSize+" Value in sheet");
			for(int c=0; c<colSize;c++) {
				int val = sc.nextInt();
				Cell cell = row.createCell(c);
				cell.setCellValue(val);
			}
			
		}
		
		
		wb.write(file);
		wb.close();
		file.close();
		
		
	}

}
