package com.OrangeHRMApplicationTestCases;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMLogInPage;


public class OrangeHRMLogInPageTest extends BaseTest
{

	
@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text Test")
public void validatingLogInPaneltextTest()
{

	
OrangeHRMLogInPage logInPage=new OrangeHRMLogInPage();
logInPage.validatingLogInPanelText();


}
	
	
	
	
	
	
	
	
	
	
	
	
}
