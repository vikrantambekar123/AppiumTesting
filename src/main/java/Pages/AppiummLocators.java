package Pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiummLocators extends Base
{

	public static void main(String[] args) throws MalformedURLException 
	{

	AndroidDriver<AndroidElement>driver=capabilities();
	//Ids
	driver.findElementById("");
	
	//ClassName
	driver.findElementByClassName("");
	
	//ClassName by Index
	WebElement ele=driver.findElementsByClassName("").get(1);
	ele.click();
	
	//AndroidUiAutomator
	driver.findElementByAndroidUIAutomator("");     //Using Property
	driver.findElementByAndroidUIAutomator("");     //Using Attribute
	driver.findElementByAndroidUIAutomator("");     //Scrolling
	
	//Xpath
	driver.findElementByXPath("");   //Using ClassName and Text
	
	//Xpath by Index
	driver.findElementById("");     //Using ClassName and [0] Index
	
	
	}

}
