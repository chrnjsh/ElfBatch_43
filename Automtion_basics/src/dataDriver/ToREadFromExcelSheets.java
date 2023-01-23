package dataDriver;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import genricMethods.FunctionForReadingExcel;

public class ToREadFromExcelSheets {
	public static void main(String[] args){
		/*
		 * File absPath = new File("./Testdata/testing.xlsx"); FileInputStream fis = new
		 * FileInputStream(absPath);
		 * 
		 * 
		 * 
		 * Workbook workbook = new XSSFWorkbook(fis);
		 */
		
		//String value = workbook.getSheet("TestData") .getRow(7).getCell(4).getStringCellValue();
		//System.out.println(value);
		System.out.println(FunctionForReadingExcel.fromExcelFileString("TestData", 7, 4));
		System.out.println(FunctionForReadingExcel.fromExcelFileNum("TestData", 7, 6));
		System.out.println(FunctionForReadingExcel.fromExcelFileBoolean("TestData", 7, 5));
		System.out.println(FunctionForReadingExcel.fromExcelFileDate("TestData", 7, 7));
		
	}
}





























