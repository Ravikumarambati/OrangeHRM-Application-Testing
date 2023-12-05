package com.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_YourWishList_Click {

	//public static void main(String[] args) {

WebDriver driver;
String applicationUrlAddress="http://amazon.in";
public void applcationLaunch()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\chromedriver.exe");
driver=new ChromeDriver();
System.out.println("***********Successfully Launched Chrome Browser***********8");

driver.get(applicationUrlAddress);
System.out.println("Navigated to Amazon Application Homepage");
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//Hello SignIn element-which is a Mouse Hover Operation
public void helloSignIn()


{
//id="nav-link-accountList"-property of Hello sign in Element
	
By helloSignInProperty=By.id("nav-link-accountList");
WebElement helloSignIn=driver.findElement(helloSignInProperty);

//Actions-its a class of Selenium used to perform Operations related to
//either Mouse of KeyBoard

Actions helloSignInMouseHover=new Actions(driver);	
//1.what type of operation should be done
//2.where the operation should be performed

helloSignInMouseHover.moveToElement(helloSignIn).build().perform();
}

public void yourWishListClick()
	
{

//"Your Wish List"-is an element of Type link
//Locator-linkText/PartialLinkText	
//selector-Your Wish List
	
By yourWishListProperty=By.linkText("Your Wish List");
WebElement yourWishList=driver.findElement(yourWishListProperty);		
yourWishList.click();		

String currentWebPageTitle=driver.getTitle();
System.out.println("The title of the Current WebPageis:-"+currentWebPageTitle);
}

public void applicationClose()
{
	driver.quit();
	System.out.println("**********Amazon Application with Browse Closed********");
}
	
	public static void main(String[]args)
	{
		
Amazon_YourWishList_Click amazon=new
Amazon_YourWishList_Click();
amazon.applcationLaunch();
amazon.helloSignIn();
amazon.yourWishListClick();
amazon.applicationClose();
		
		
		
	}

}
