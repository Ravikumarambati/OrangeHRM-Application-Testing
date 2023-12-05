package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Identifying the file(Excel File) in the System
	FileInputStream testDataFile=new FileInputStream("./src/com/ExecOperations/DataType.xlsx");
		
	//Identify the WorkBook in the File(Excel File)
	XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		
	//Identify a Particular Sheet in the WorkBook
	 XSSFSheet testDataSheet=workBook.getSheet("Sheet3");
	
	 	//Create a Particular Row in the Sheet
		Row sheetOfNewRowCreated=testDataSheet.createRow(1);
		
		//Create a Particular Row of a Cell
		Cell newRowOfCellCreated=sheetOfNewRowCreated.createCell(2);		
		
		//setting the value into the New Row of Cell Created
		newRowOfCellCreated.setCellValue("functional Testing");
		
		//Saving the file with the path of the location of the System with a Name along WorkBook
		FileOutputStream testResultFile= new FileOutputStream("C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\src\\com\\ExecOperations\\DataType.xlsx");
		
		
		workBook.write(testResultFile);
		
		
		
		
	}

}
