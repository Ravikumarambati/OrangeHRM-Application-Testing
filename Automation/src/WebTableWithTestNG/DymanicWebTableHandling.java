package WebTableWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DymanicWebTableHandling extends BaseTest  {

@Test(priority=1,description="Getting the complete WebTable Data")
public void capturingDynamicWebTableData()
{
//Identifying the WebTable
// /html/body/div[5]/section[1]/div
	
By webTableproperty=By.xpath("/html/body/div[5]/section[1]/div");	
WebElement webTable=driver.findElement(webTableproperty);
 
//Row is identified by the tag name as "tr"

By rowProperty=By.tagName("tr");	
    //Going to the WebTable and finding the Number of Rows in it
List<WebElement>rows=webTable.findElements(rowProperty);
	
//in the WebTable-should goto every row of the WebTable
for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
{
//Going to a particular Row
WebElement WebTableRow=rows.get(rowIndex);

//IN the current Row-identifying the number of its corresponding Cells
//Row of a Cell is identified in a webTable by tagNames as "td"

By rowOfCellProperty=By.tagName("td");

//Going to a Particular 'row and identifying all its Cells
List<WebElement>rowOfCells=WebTableRow.findElements(rowOfCellProperty);

//To goto every Row of all its Corresponding Cells
for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
{
	WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
	String data=rowOfCell.getText();
	System.out.println(data+"|");

}
System.out.println();	
}
	
}
	
	
	
}
