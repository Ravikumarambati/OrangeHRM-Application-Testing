package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingFirstColoumCityName extends BaseTest{

public void capturingFirstColoumCityName()
{	
//First Row of First Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a	
	
//Last Row of First Cell
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a	
	
String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
String xpathExpressionPart2="]/td[1]";

//To goto every Row of the Table
for(int tableRowIndex=1;tableRowIndex<=36;tableRowIndex++)
{

/*
 By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tableRowIndex+"]/td[1]");   
   
  */
	
                  //OR
	
By cityNameProperty=By.xpath(xpathExpressionPart1+tableRowIndex+xpathExpressionPart2);
WebElement cityNameText=driver.findElement(cityNameProperty);	

String cityName=cityNameText.getText();

}

}
	
public static void main(String[] args)
{

CapturingFirstColoumCityName getCityName= new CapturingFirstColoumCityName();	
	
getCityName.applicationLaunch();
getCityName.capturingFirstColoumCityName();
getCityName.applicationClose();
	
}
		
}	

