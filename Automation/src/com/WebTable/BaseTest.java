package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

public void applicationLaunch()
{	

//Automating Chrome Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\chromedriver.exe");
driver=new ChromeDriver();

System.out.println("Chrome Browser Launched Successfully");

//Navigating to Time an Date Application UrlAddress
driver.get(applicationUrlAddress);
System.out.println("Successfully Navigated to Time and Date Application");

}
public void applicationClose()
{
driver.quit();
System.out.println("*****Chrome Browser along with Application is Closed Successfully*****");
	
		
}
 

}