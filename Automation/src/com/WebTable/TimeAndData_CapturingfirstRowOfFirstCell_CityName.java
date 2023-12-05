package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimeAndData_CapturingfirstRowOfFirstCell_CityName extends BaseTest {

public void capturingFirstRowOfFirstCellCityName()
{
/*	
 Xpath Expression
 
      /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	
	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	
	Locator- xpath
	Selector-xpath Expression(for the Source Code)
	
	any Xpath expression starts with "html" tag-it is called as Absolute Xpath
	*/
	//Automating Chrome browser
	By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
	WebElement cityName=driver.findElement(cityNameProperty);
	String cityNameText=cityName.getText();
	
	System.out.println(cityNameText);
}

public static void manin(String[]args)
{

TimeAndData_CapturingfirstRowOfFirstCell_CityName getcityName= new TimeAndData_CapturingfirstRowOfFirstCell_CityName();
	
getcityName.applicationLaunch();
getcityName.capturingFirstRowOfFirstCellCityName();
getcityName.applicationClose();

	
	
		
}
}	

