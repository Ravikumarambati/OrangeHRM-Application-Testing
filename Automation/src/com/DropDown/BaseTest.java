package com.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	
	public void setUp()
	{	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	
	System.out.println("****Chrome Browser Launched Successfully****");
	
	driver.get(applicationUrlAddress);
	System.out.println("Sucessfully Navigated to TSRTC application");
	
	//Maximizing the Browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void tearDown()
	{
	
	driver.quit();
	System.out.println("*****Chrome Browse along with Application is Closed Successfully****");
	
	
	}
	

    }
