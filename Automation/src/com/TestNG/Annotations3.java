package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {

@Test(priority=1,description="Gmail Application LogIn Test")
public void GmailApplicationLogInTest()
{
	System.out.println("Gmail Application LogIn Functionality Test Successful");
}

@Test(priority=2,description="Gmail Application InBox Test")
public void GmailApplicationInBoxTest()
{
System.out.println("Gmail Application InBox Functionality Test Successfull");
}

@Test(priority=3,description="Gmail Application ComposeMail Test")
public void GmailApplicationComposeMailTest()
{
System.out.println("Gmail Application ComposeMail Functionlity Test Successfull");
}

@BeforeMethod(description="Launching Gmail Application")
public void ApplicationLaunch()
{
System.out.println("******Gmail Application Lauching Successful*******");
}
	
@AfterMethod(description="Gmail Application Close")
public void GmailApplicationClose()
{
System.out.println("****Gmail Application Closed Successfull*********");

}

@Test(enabled=false,description="Gmail Application Drafts Test") //This represents to a false Test Case-the TestNG during the
     //Test Run Ignores the current Test case and will proceed to
     //execute the remaining Test Case	
	public void GmailApplicationDraftsMailTest()
	{	
	System.out.println("Gmail Application DraftsMail Functionality Test Successfull");
	}

@Test(priority=5,description="Gmail Application SentMail Test")
public void GmailApplicationSentMailTest()
{
System.out.println("Gmail Application SentMail Functionality Test Successfull");
}

	
	
	
	
	
	
	
	
	
	














	
}
