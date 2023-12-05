package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//Identify the file(Excel File) of the System
		FileInputStream testDataFile=new FileInputStream("./src/com/ExecOperations/DataType.xlsx");
		
	//Identify the WorkBook in the file	
	XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		
//Identify a Particular Sheet in the workBook
	XSSFSheet testDataSheet=workBook.getSheet("Sheet2");
		
	//Identify the number of Active Rows in the Sheet
	int rowCount=testDataSheet.getLastRowNum();
		
	//for Going to Active Row in the Sheet
	for(int rowIndex=0;rowIndex<=rowCount;rowIndex++) //for active Rows
	{
		//Going to a Particular Row
		Row testDataRow = testDataSheet.getRow(rowIndex);
	
		//In the Current row-finding the Number of Active Cells
		int rowOfCellsCount=testDataRow.getLastCellNum();
	
		//To goto Every Active Row of All the  Active Cells
		for(int rowOfCell=0;rowOfCell<rowOfCellsCount;rowOfCell++)
	{
	
	//going to an Active Row of an Active Cell
	Cell testDataRowOfActiveCell=testDataRow.getCell(rowOfCell);
	
	//getting the data from the Active Row of an Active Cell
	String testData=testDataRowOfActiveCell.getStringCellValue();
	
	//Print the data
	System.out.println(testData+" ");
			
	}		
	System.out.println();		
			
	}	
		
	}

}
