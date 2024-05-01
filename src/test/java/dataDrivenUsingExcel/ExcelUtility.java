package dataDrivenUsingExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.collections4.collection.IndexedCollection;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static InputStream fi;
	public static OutputStream fo;
	public static Workbook wb;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		int rowCount = sheet.getLastRowNum();
		wb.close();
		fi.close();
		
		return rowCount;
	}
	
	public static int getCellCount(String xlfile,String xlsheet,int rowNum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		int cellCount = sheet.getRow(rowNum).getLastCellNum();
		wb.close();
		fi.close();
		
		return cellCount;
	}
	
	public static String getCellData(String xlfile,String xlsheet,int rowNum,int colNum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
			return data;
		} catch (Exception e) {
			// TODO: handle exception
			data = "";
		}
		wb.close();
		fi.close();
		
		return data;
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rowNum,int colNum,String data) throws IOException {
	
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		row = sheet.getRow(rowNum);
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColour(String xlfile,String xlsheet,int rowNum,int colNum) throws IOException {
		

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	
	}
	
	public static void fillGRedColour(String xlfile,String xlsheet,int rowNum,int colNum) throws IOException {
		

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	
	}

}
