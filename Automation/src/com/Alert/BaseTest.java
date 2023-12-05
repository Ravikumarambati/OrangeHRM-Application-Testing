package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

WebDriver driver;
String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

public void applicationLauch()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\chromedriver.exe");
driver=new ChromeDriver();	

System.out.println("*****Chrome Browser Launched Successfully*******");
	
driver.get(applicationUrlAddress);
System.out.println("Successfully Navigated to TSRTC Application");

//Maximaizing the Browser
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}	
	
public void applicationClose()
{
	
driver.quit();

System.out.println("***Chrome Browser along with Application is Closed Successfully****");	

}	
	
}
