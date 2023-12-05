package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling extends BaseTest{

public void selectionOfOptionalValue_SelectLanguage()
{
	
	
	//id="gtranslate_selector" - property of the dropDow Select Language
	
	By selectLanguageDropDownProperty=By.id("gtransllate_selector");
	WebElement selectLanguageDropDown=driver.findElement(selectLanguageDropDownProperty);
	
	//selectLanguageDropDown.click();
	
	Select LanguageSelection=new Select(selectLanguageDropDown);
//languageselection.selectByIndex(10); //index starts from 0
	
//<option value="en|m|">Malayalam</option>
//languageSelection.sellectByValue("en|m|"); //provide the attribute value given by
	                                        //the developer from the properties
	
LanguageSelection.selectByVisibleText("Telugu");

//deselect
LanguageSelection.deselectAll(); //will deselelct all the selected Opetional values at once

//deselecting a particular selected optional value
//it is not mandatory to go woth a similar type of method to deselct the selected option value
//we can use any method to perform the deselction of selected Optional value

LanguageSelection.deselectByIndex(8);

//<option value="en|te">Telugu</option>
LanguageSelection.deselectByValue("en|te");

//<option value="en|n|>Dutch</option>
LanguageSelection.deselectByVisibleText("Dutch");

}

public static void main(String[]args)
{

DropDownHandling dropDown=new DropDownHandling();

dropDown.setUp();
dropDown.selectionOfOptionalValue_SelectLanguage();


}
	
	

	
}
