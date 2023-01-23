package genricMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FunctionForReadingExcel {
	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./Testdata/ConfigureProperties"));
			properties = new Properties();
			properties.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		return properties.getProperty(key);
	}
	
	
public static String fromExcelFileString(String sheetName, int rowNo, int cellNo) {
	FileInputStream fis = null;
	Workbook workbook = null;
	try {
		fis = new FileInputStream(new File("./Testdata/testing.xlsx"));
		workbook = WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
}

public static double fromExcelFileNum(String sheetName, int rowNo, int cellNo) {
	FileInputStream fis = null;
	Workbook workbook = null;
	try {
		fis = new FileInputStream(new File("./Testdata/testing.xlsx"));
		workbook = WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
}

public static boolean fromExcelFileBoolean(String sheetName, int rowNo, int cellNo) {
	FileInputStream fis = null;
	Workbook workbook = null;
	try {
		fis = new FileInputStream(new File("./Testdata/testing.xlsx"));
		workbook = WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
}
public static  LocalDateTime fromExcelFileDate(String sheetName, int rowNo, int cellNo) {
	FileInputStream fis = null;
	Workbook workbook = null;
	try {
		fis = new FileInputStream(new File("./Testdata/testing.xlsx"));
		workbook = WorkbookFactory.create(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue();
}
}