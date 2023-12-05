package com.WebTable;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingCompleteWebTableData extends BaseTest {

public void capturingCompleteWebTableData()
{

//First Row of First Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		
//First Row of First Row of Last Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]	

//Last Row of Last Cell
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	
//To Go To Every Row
for(int rowOfIndex=1;rowOfIndex<=36;rowOfIndex++)
{
//To Go To Every Row Of All The Cells
for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
{
By tableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowOfIndex+"]/td["+rowOfCellIndex+"]");

WebElement tableData=driver.findElement(tableDataProperty);

String tabeDataText=tableData.getText();
System.out.println(tabeDataText+"|");

}
System.out.println();
}
}

public static void main(String[] args) 
{

	CapturingCompleteWebTableData getTable=new CapturingCompleteWebTableData();
	new CapturingCompleteWebTableData();
	getTable.applicationLaunch();
    getTable.capturingCompleteWebTableData();
    getTable.applicationClose();
		
}

}

