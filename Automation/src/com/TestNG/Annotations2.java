
package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

@Test(priority=1,description="Gmail Application LogIn Test")
public void gmailApplicationLogInTest()
{
System.out.println("Gmail Application LogIn Functionlty Test Successfull");
}

@Test(priority=2,description="Gmail Application InBox Test")
public void GmailApplicationInBoxTest()
{
	System.out.println("Gmail Application InBox Functionality Test Successfull");	
}
	
@Test(priority=3,description="Gmail Application ComposeMail Test")
public void GmailApplicationComposeMailTest()
{
System.out.println("Gmail Appliation ComposeMail Functionlity Test Successfull");
}

@BeforeTest(description="Launching Gmail Application")
public void gmailApplicationLaunch()
{
	System.out.println("*****Gmail Application Launch Successfull****");
}

@AfterTest(description="Gmail Application Close")
public void GmailApplicationClose()
{
	System.out.println("Gmail Application Closed Successfull");
}


@Test(enabled=false,description="Gmail Application Drafts Test") //this represents to a false Test Case-the TestNG during the
   //Test Run Ignores the current Test case and will proceed to
   //execute the remaining Test Cases
   //the default status of the Test case is-enabled=true

public void GmailApplicatinDraftsMailTest()
{
	System.out.println("Gmail Appliction DraftsMail Functionality Test Successfull");
}

@Test(priority=5,description="Gmail Application SentMail Test")
public void GmailApplicationSentMailTest()
{
System.out.println("Gmail Application SentMail Functionlality Test Successfull");
}



}

