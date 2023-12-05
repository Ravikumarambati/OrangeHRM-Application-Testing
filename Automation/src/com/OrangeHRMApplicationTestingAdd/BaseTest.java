package com.OrangeHRMApplicationTestingAdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {

WebDriver driver;
String applicationAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@BeforeTest
public void setUp()
{
//Automating the Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\msedgedriver.exe");
driver=new ChromeDriver();
System.out.println("*****Successfully launched ChromeBrowser*******");	
	
//Navigated to OrangeHRMApplication Url Address
driver.get(applicationAddress);
System.out.println("***Successfully navigated to OrangeHRMApplication****");	
	
driver.manage().window().maximize();
	
//its a time out related to the Application webpage to be loaded on the Browser	
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//elements to be identified with the given property
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

//@AfterTest
/*
public void tearDown()
{
driver.quit();
System.out.println("****Chrome Browser along with OrangeHRM Application Closed Successfully****");
}*/
}
