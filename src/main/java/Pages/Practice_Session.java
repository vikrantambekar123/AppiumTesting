package Pages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.touch.TapOptions.tapOptions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Practice_Session  extends Base
{
	
	
	
	public static void main(String[]args) throws MalformedURLException, InterruptedException
	{
	    capabilities();

	    driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
	    driver.findElementsByClassName("//android.widget.TextView").get(4).click();
//	    driver.findElementByXPath("//android.widget.Button[@text='OK CANCEL DIALOG WITH A MESSAGE']").click();
//	    driver.findElementByXPath("//android.widget.Button[@text='OK']").click();

	    
	    
	    
	    
	    
//		Thread.sleep(2000);
//		System.out.println("Clicking Bro");
//		WebElement ele=.driverfindElementByXPath("//android.widget.Button[@text='ALLOW']");
//		System.out.println("Clicked Bro");
	    
		//Prefrences Tab
//		System.out.println("I am now going to click Preferences");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//		System.out.println("I am now going to click 3. Preference dependencies");
//		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//		System.out.println("I am clicking on Wifi CheckBox");
//		driver.findElementByXPath("(//android.widget.RelativeLayout)[1]").click();
//		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//		System.out.println("I am Entering Values in textbox");
//		driver.findElementById("android:id/edit").sendKeys("Hi Vikrant");
//		System.out.println("Clicking on Cancel Button");
//		driver.findElementsByClassName("android.widget.Button").get(0).click();
//		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//		System.out.println("I am Entering Values Again after cancel in textbox");
//		driver.findElementById("android:id/edit").sendKeys("Hi Vikrant");
//		System.out.println("I am clicking on Ok Button");
//		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
		//Views Tab
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Clicking on Views Using AndroidUIAutomator");
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		
//		TouchAction t=new TouchAction(driver);
//		WebElement Expanlist=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//		System.out.println("Clicking on Expandable Lists");
//		t.tap(tapOptions().withElement(element(Expanlist))).perform();
//		WebElement CustomAdapter=driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
//		System.out.println("Clicking on Custom Adapter");
//		t.tap(tapOptions().withElement(element(CustomAdapter))).perform();
//		
//		WebElement Sample=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
//		System.out.println("I am Long Pressing the SampleMenu");
//		t.longPress(longPressOptions().withElement(element(Sample))).perform();
		
		//View Tab Clock
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Clicking on Views Using AndroidUIAutomator");
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		System.out.println("I am Clicking on Date Widgets");
//		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
//		System.out.println("I am Clicking on Inline");
//		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
//		WebElement ele9=driver.findElementByXPath("//*[@content-desc='9']");
//		System.out.println("I am Clicking on 9 'clock");
//		ele9.click();
//		WebElement ele45=driver.findElementByXPath("//*[@content-desc='45']");
//		TouchAction t=new TouchAction(driver);
//		t.longPress(longPressOptions().withElement(element(ele9)).withDuration(ofSeconds(2))).moveTo(element(ele45)).release().perform();
//		System.out.println("I am on on 9:45 'clock");
		
//		Drag and Drop
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Clicking on Views Using AndroidUIAutomator");
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//
//		System.out.println("Clicking on Drag and Drop");
//		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
//		
//		WebElement ele1=driver.findElementById("io.appium.android.apis:id/drag_dot_1");
//		WebElement ele2=driver.findElementById("io.appium.android.apis:id/drag_dot_2");
//		
//		TouchAction t=new TouchAction(driver);
//		t.longPress(element(ele1)).moveTo(element(ele2)).release().perform();
//		System.out.println("Moved from 1st Object to 2nd Object Location");
		
		//Scrollable
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Clicking on Views Using AndroidUIAutomator");
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		String sc="Tabs";
//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" +sc+ "\").instance(0))")).click();
//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+sc+"\")");

		//Scrollable till Product General App Store
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	     driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
//
//	     driver.hideKeyboard();
//
//	     driver.findElement(By.xpath("//*[@text='Female']")).click();
//
//	     driver.findElement(By.id("android:id/text1")).click();
//
//	     
//
//	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
//
//	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
//
//	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();
//
//	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//
//	     
//
//
//
//	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().class(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
//
//	     
//
//	int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//	    for(int i=0;i<count;i++)
//
//	    {
//
//	    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//	    if(text.equalsIgnoreCase("Jordan 6 Rings"))
//
//	    {
//	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//
//	break;
//	    }
//	    }
//	    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Clicking on Views Using AndroidUIAutomator");
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		
////	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
//		String f="Spinner";
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/text1\"[9])).scrollIntoView(new UiSelector().textMatches(\""+f+"\").instance(0))"));
//		System.out.println("I have Searched Bitch");
		

		
		

	     

	     

	     

	}
		
		

	}
	
	
	
	

