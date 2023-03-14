package com.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Test {

	public static void main(String[] args) throws IOException {

		File src = new File("C:\\Users\\C zone\\Documents\\Book3.xlsx");

		FileInputStream file = new FileInputStream(src);

		ZipSecureFile.setMinInflateRatio(-1.0d);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();

		int headerRow = 0;
		while (headerRow <= rows) {
//			 System.out.println(headerRow);
			try {
				if (sheet.getRow(headerRow).getCell(0).getStringCellValue().equals("Test Scenario ID")) {
					break;
				}
			} catch (NullPointerException e) {

			}

			headerRow++;
		}

		int cols = sheet.getRow(headerRow).getLastCellNum();
		for (int r = headerRow; r <= rows; r++) {
			for (int c = 0; c < 14; c++) {
				XSSFCell cell = sheet.getRow(r).getCell(c);

				switch (cell.getCellType()){

				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				default:
				break;
				}

				System.out.print("                             ");
			}
			System.out.println();
		}

		workbook.close();
	}

}
