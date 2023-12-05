package com.Alert;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Tsrtc_HandIngAlert extends BaseTest {

public void checkAvailabilityTest()	
{

//id="searchBtn"
By checkAvailabilityProperty=By.id("searchBtn");
WebElement checkAvailability=driver.findElement(checkAvailabilityProperty);
checkAvailability.click();
}

public void handlingAlert()
{

///thread.sleep(5000);

Alert alertWindow=driver.switchTo().alert();
	

String expected_AlertText="Please select start place.";	
System.out.println("The Expected Text of the AlertWindow is:-"+expected_AlertText);


String actual_AlertText=alertWindow.getText();
System.out.println("The Actual text of the AlertWindow is:-"+actual_AlertText);

if(actual_AlertText.equals(expected_AlertText))
{
System.out.println("Navigated to Alert window-PASS");	

}
else
{
	
System.out.println("Failed to Navigat to Alert Window-FAIL");	
}
alertWindow.accept(); //accept-will perform the Operation onthe Ok button
	
//alertWindow.disiss(); //dissmiss-will perform operation on the Cancel button

//alertwindow.sendKeys("Test Data"); //to pass the Test data into the alert window
}
 public static void  main(String[]args) throws InterruptedException
 {

Tsrtc_HandIngAlert alertHandling=new Tsrtc_HandIngAlert();	 

alertHandling.applicationLauch();
alertHandling.checkAvailabilityTest();
alertHandling.handlingAlert();
//alertHandling.appliationClose();

	
}
	

}
