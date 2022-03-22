package Pages;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends Base
{

	public static void main(String[] args) throws MalformedURLException 
	{

		AndroidDriver<AndroidElement>driver=capabilities();
		
		//Option1 for Scrolling Which Does not Work in My System
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView()");
		
		
		//Option2 for Scrolling Which Work in My System
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//		
//		
//		
//		String sc = "Visibility";
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" +sc+ "\").instance(0))")).click();
//		System.out.println("I have Reached the Destination");
		
		
		//Scrolling Whole Element and not Partially
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		String a="Seek Bar";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/text1\")).scrollIntoView(new UiSelector().textMatches(\""+a+"\").instance(0))"));  
		

		
		
		
		
		
	}

}
