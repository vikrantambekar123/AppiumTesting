package PracPages;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PracticeBase.PracBase_App_Demos;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Locatorrs extends PracBase_App_Demos
{
	
		@AndroidFindBy(xpath="(//android.widget.TextView)[11]")
		WebElement xpath_by_index;
		
		@AndroidFindBy(xpath="//android.widget.TextView")
		List<AndroidElement> xpath_by_classindex;
		
		@AndroidFindBy(id="android:id/checkbox")
		WebElement Resourceid;
		
		@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
		WebElement xpath_by_class_bracketindex;
		
		@AndroidFindBy(uiAutomator="text(\"WiFi settings\")")
		WebElement By_AndroidUiAutomator;
		
		@AndroidFindBy(className ="android.widget.EditText")
		WebElement ByClassname;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
		WebElement Xpath_By_Text;
		
		public  AndroidDriver<WebElement>driver;

		public Locatorrs(AndroidDriver<WebElement> driver)
		{
		this.driver=driver;
		System.out.println("I am in Locators Class");
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		
		public void Appium_Locators() throws InterruptedException
		{
		
		List<WebElement> ele3=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<ele3.size();i++)
		{
			String tex=ele3.get(i).getText();

			System.out.println("Your Text at "+i+" is :-"+tex);
		}
		
		
		
		//Locators
		
		//1)  Xpath by Index
//		Thread.sleep(3000);
		System.out.println("Xpath by Index");
		xpath_by_index.click();
//		
//		//2) Xpath by ClassName Index
		System.out.println("Xpath by Classname Index");
		xpath_by_classindex.get(3).click();
		
		//3) Resource Id
		System.out.println("Resource Id");
		Resourceid.click();
		
		//xpath_by_class_bracket_index
		System.out.println("Xpath by Index");
		xpath_by_class_bracketindex.click();
	
		
		//4) AndroiduiAutomator by Text
		System.out.println("Xpath by Xpath Text");
		String AlertValue=By_AndroidUiAutomator.getText();
		System.out.println(AlertValue);
		
		//5) Classnmame
		ByClassname.sendKeys("Vikrant Testing Appium");
		
		
		//6) Xpath by Text
		Xpath_By_Text.click();
		System.out.println("Clicked on OK");
		
		}
	}
