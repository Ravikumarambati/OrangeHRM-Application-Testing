package WebTableWithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{

	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\WebApplicationTesting\\Automation\\BrowserDriverFiles\\chromedriver.exe");

driver=new ChromeDriver();

System.out.println("********Chrome Browser Launched Successfully******");

driver.getCurrentUrl();
System.out.println("Successfull Navigated to Time and Date Application");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@AfterTest
public void tearDown()
{

driver.quit();
System.out.println("*****Chrome Browser along with Application is Close Successfull***");
}




}
	
	
	
