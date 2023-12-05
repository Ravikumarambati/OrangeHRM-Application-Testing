package com.OrangeHRMApplicationTestingAdd;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Alert.BaseTest;

public class AddEmployeeTest extends BaseTest {
	WebDriver driver;
	FileInputStream orangeHRMApplicationLogInTestDataFile;
	FileInputStream propertiesFile;
//Validating LogIn Page
	
	
@Test(priority=1,description="Validating LogIn Functionality Test")
public void logInTest()throws IOException
{
	
orangeHRMApplicationLogInTestDataFile=new FileInputStream("C:\\Users\\DELL\\Desktop\\AddEmployee.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);	
XSSFSheet logInTestDataSheet=workBook.getSheet("LogInTestData");	

XSSFRow LogInTestDataRow=logInTestDataSheet.getRow(1);
XSSFCell logInTestDataRowOfCell=LogInTestDataRow.getCell(0);

String expected_LoginPageText=logInTestDataRowOfCell.getStringCellValue();
System.out.println(expected_LoginPageText);
//identifying the external file(properties file) - since the properties of the element stored in properties file


propertiesFile = new FileInputStream("./src/com/Config/OrangeHRM.properties");
Properties properties= new Properties();
// using the properties class Object - trying to load the identified propeties file
properties.load(propertiesFile);

By loginPanelPropety=By.id(properties.getProperty("OrangeHRMApplicationLogInPageloginPanelProperty")); //identifying the property of an element
//finding an element with the Property in the current webpage

WebElement loginPanel=driver.findElement(loginPanelPropety);

//Operation should be performed on the element-userName
String actual_LoginPageText=loginPanel.getText();
System.out.println(actual_LoginPageText);

logInTestDataRowOfCell=LogInTestDataRow.createCell(1);
logInTestDataRowOfCell.setCellValue(actual_LoginPageText);
FileOutputStream testResult=new FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\AddEmployee.xlsx");
workBook.write(testResult);
//validating OHRM login page
if(actual_LoginPageText.equals(expected_LoginPageText))
	
{
System.out.println("Successfully Validated OHRM Login Page-Pass");	
 logInTestDataRowOfCell=LogInTestDataRow.createCell(2);
logInTestDataRowOfCell.setCellValue("Successfully Validated OHRM Login Page-Pass");
testResult=new FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\AddEmployee.xlsx");
workBook.write(testResult);
	
	
}

else {
	System.out.println(" Validation of OHRM Login Page Failed-Fail");	
	 logInTestDataRowOfCell=LogInTestDataRow.createCell(2);
	logInTestDataRowOfCell.setCellValue("Validation of OHRM Login Page Failed-Fail");
	testResult=new FileOutputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\AddEmployee.xlsx");
	workBook.write(testResult);
}
	
}
}


/*private XSSFCell CreateCell(int i) {
	// TODO Auto-generated method stub
	return null;
}}


/*
//Identifying properties of Password Element
//<input name="txtPassword" autocomplete="off"type="password">

Cell logInTestDataRowOfPasswordCell=LogInTestDataRow.getCell(1);
String passwordTestData=logInTestDataRowOfPasswordCell.getStringCellValue();

//String passwordTestData="@Trainer7";

//identify the property of Password Element

By passwordProperty=By.name("textPassword");

//identifying the element password with its property
WebElement password=driver.findElement(passwordProperty);	

//Performing an operation on the WebElement Password
password.sendKeys(passwordTestData);

//<input type="submit" class=:button" value="LOGIN"
By logInButtoProperty=By.className(properties.getProperty("orangeHRMApplicationLogInButtonProperty"));
WebElement logInButton=driver.findElement(logInButtoProperty);
logInButton.click();

//Validating OrangeHRM Application HomePage
String expected_OrangeHRMApplicationHomePageText="Admin";
System.out.println("The Expecte text of OrangeHRM Application HomePage is:-"+expected_OrangeHRMApplicationHomePageText);

//id="welcome"-Property of WelCome Admin Element
By welComeAdminProperty=By.id(properties.getPropety("orangeHRMpplicatioHomePageWelComeAdminProperty"));
WelComeAdmin=driver.findElement(welComeAdminProperty);

String actual_OrangeHRMApplicationHomePageText=WelComeAdmin.getText();
System.out.println("The actual Text of OrangeHRM Application HomePage is:-"+actual_OrangeHRMApplicationHomePageText);

//Validating HomePage
if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
{
System.out.println("Succesfully Navigated to OrangeHRM Application HomePage-PASS");

//Row logIn TestResultrow=logInTestDataSheet.createRow(1);
//Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);
//of the same first Row--only creating a New CEllto save the Test Result

Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
logInTestResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage-PASS");

}
else
{
System.out.println("Failed to Navigate to OrangeHRM Application HomePage-FAIL");
 //Row logInTestResultRow=logInTestDataSheet.creatRow(1);
 //Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);

Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage--FAIL");

}
FileOutPutStream orangeHRMApplicationLogInTestResultFile=new FileOutPutStream(".src/com/Config/OrangeHRM.properties");
	
}


private XSSFCell CreateCell(int i) {
	// TODO Auto-generated method stub
	return null;
}*/
