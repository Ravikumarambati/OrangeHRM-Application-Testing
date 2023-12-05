package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
	

	//Identify the file(Excel File) in the System
	FileInputStream testDataFile=new FileInputStream("C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\src\\com\\ExecOperations\\DataType.xlsx");
		
	//Identify the WorkBook in the File(Excel File)	
	 XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);	
		
	//Identify a Particular Sheet in the WorkBook
	XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
	
	//Identify a Particular Row in the Sheet
	//Row-interface of APACHE POI--consider it as one of the DataType
	Row testDataSheetRow = testDataSheet.getRow(0);
	
	//Identify a Particular Row of Cell
	Cell testDataRowOfcell= testDataSheetRow.getCell(0);
		
	//get the Test Data from the Row of the Cell
	String testData=testDataRowOfcell.getStringCellValue();
	
	System.out.println(testData);
		
	//2nd Row of 2nd Cell data
	Row secondTestDataRow=testDataSheet.getRow(2);
	Cell secondRowofSecondCell=secondTestDataRow.getCell(1);
	
	String data=secondRowofSecondCell.getStringCellValue();
	System.out.println(data);
	
	
	
		
		
	}

}
