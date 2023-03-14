package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AmazonTc {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\C zone\\Desktop\\TCs 8th Oct.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		int rows  = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<rows;r++) {
			for(int c=0; c<cols; c++) {
				XSSFCell cell = sheet.getRow(r).getCell(c);
				
				switch(cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				default:
				break;
				
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		System.out.println(rows);

	}

}
