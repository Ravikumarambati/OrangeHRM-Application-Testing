package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationUserDefineMethods {
	WebDriver driver;
	
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
	
	@Given("^User should Open Chrome Browser in the System$")
	public void user_should_Open_Chrome_Browser_in_the_System() 
	{
	   
		// Automating CHrome Browser
		System.setProperty("webdriver.chrome.driver", "./NewChromeDriverFile/chromedriver.exe");
		driver = new ChromeDriver();
		// System.out.println(" ***** Successfully launched Chrome Browser ******* ");
		Log.info(" ***** Successfully launched Chrome Browser ******* ");

		
	}

	@When("^User enters OrangeHRM Application Url Address$")
	public void user_enters_OrangeHRM_Application_Url_Address()
	{
	
		//Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		// System.out.println(" Sucessfully navigated to OrangeHRM Application ");

		Log.info("Sucessfully navigated to OrangeHRM Application ");

		driver.manage().window().maximize();

		// its a time out related to the Application webpage to be loaded on the Browser
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// elements to be identified with the given property
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}

	@Then("^User should be navigated to OrangeHRM Application LogIn WebPage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()  {
	   
		// id="logInPanelHeading"
		By logInPanelTextProperty=By.id("logInPanelHeading");
		WebElement logInPanel=driver.findElement(logInPanelTextProperty);

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		Log.info(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


		String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
		Log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);

		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		Log.info(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
		}
		else
		{
		//Log.info(" OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
		}

		}

		
	

	@Then("^User should close the OrangeHRM Application along with the Browser$")
	public void user_should_close_the_OrangeHRM_Application_along_with_the_Browser()  {
	   
		driver.quit();
		// System.out.println(" ********* Chrome Browser along with OrangeHRM Application Closed Successfully *****");

		Log.info(" ********* Chrome Browser along with OrangeHRM Application Closed Successfully *****");

		
		
	}



}
