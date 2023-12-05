package com.OrangeHRMApplicationTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Alert.BaseTest;

public class LogInTest extends BaseTest {

//Validating LogIn Page
	
WebElement welComeAdmin;

WebDriver driver;

FileInputStream propertiesFile;
Properties properties;

@Test(priority=1,description="Validating LogIn Functionalaity Test")
public void logInTest()throws IOException
{
	
FileInputStream orangeHRMApplicationLogInTestDataFile=new FileInputStream("./src/com/ExecOperations/DataType.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
XSSFSheet logInTestDataSheet=workBook.getSheet("LogInTestData");

//Identifying the External file(Properties file)-since the properties of the
//elements are stored in the properties file

propertiesFile=new FileInputStream("./src/com/Config/OrangeHRM.properties");
properties=new Properties();
//using the properties class Object-trying to load the identified properties file
properties.load(propertiesFile);

Row LogInTestDatarow=logInTestDataSheet.getRow(1);
Cell logInTestDataRowOfUserNameCell=LogInTestDatarow.getCell(0);

String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();

//String userNameTestData="srini";
//Identifying the property of an element-which is stored in the properties file
By usernameProperty=By.id(properties.getProperty("OrangeHRMApplicationLogInPageUserNameProperty"));
//finding an element with the property in the current webpage
WebElement userName=driver.findElement(usernameProperty);

//Operation should be performed on the element-userName
userName.sendKeys(userNameTestData);

//Identifying properties of Password Element
//<input name="txtPassword" autocomplete="off"="password">

Cell LogInTestDataRowOfPasswordCell=LogInTestDatarow.getCell(1);
String passwordTestData=LogInTestDataRowOfPasswordCell.getStringCellValue();

//String passwordTestData="Q@Trainer7";

//identify the property of Password Element
By passwordProperty=By.name(properties.getProperty("orangeHRMAppicatonLogInPagePasswordProperty"));
//identifying the element password with its property
WebElement password=driver.findElement(passwordProperty);
//Performing an operation on the WebElement Password
password.sendKeys(passwordTestData);

//<input type="submit" class="button" value="LOGIN">

By logInButtonProperty=By.className(properties.getProperty("orangeHRMAppliationLogInButtonProperty"));
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();
	
//Validating OrangeHRM Application HomePage
String expected_OrangeHRMApplicationHomePageText="Admin";
System.out.println("The Expected Text of OrangeHRM Application HomePage is:-"+expected_OrangeHRMApplicationHomePageText);

//id="welcome"-Property of 'welCome Admin Element
By WelComeAdminProperty=By.id(properties.getProperty("OrangeHRMApplicationHomePageWelComAdminProperty"));

String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
System.out.println("The actual Text of OrangeHRM Application HomPage is:-"+actual_OrangeHRMApplicationHomePageText);

//Validating HomePage
if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
{
System.out.println("Successfully Navigated to OrangeHRM Application HomePage-PASS");

//Row logInTestResultRow=logInTestDataSheet.createRow(1);
//Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);
//of the same first ROW--only creating a New CEII to save the Test Result

Cell logInTestResultRowOfCell=LogInTestDatarow.createCell(2);
logInTestResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage-PASS");

}
else
{
System.out.println("Failed to Navigat to OrangeHRM Application HomePage-FAIL");
//Row logInTestResultRow=logInTestDataSheet.createRow(1);
//Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);
Cell logInTestResultRowOfCell=LogInTestDatarow.createCell(2);
logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage-FAIL");

}

FileOutputStream orangeHRMapplicationLogInTestResultFile=new FileOutputStream("C:\\Users\\DELL\\Desktop\\OHRM_LogInTestData.xlsx");
workBook.write(orangeHRMapplicationLogInTestResultFile);
}
@Test(priority=2,description="Validating WelComeAdmin Funtionality Test")
public void welComeAdminTest()
{

welComeAdmin.click();
}

@Test(priority=3,description="Validating LogOunt Functionality Test")
public void logOutTest() {
	

//By logOutPropery=By.partialLinkText("Log");
By logOutProperty=By.linkText(properties.getProperty("OrangeHRMApplicationomePageLogOutProperty"));

WebDriverWait wait=new WebDriverWait(driver,10);wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));

WebElement logOut=driver.findElement(logOutProperty);
logOut.click();
	
	
//Validation of LogIn Page	
		
}
}
