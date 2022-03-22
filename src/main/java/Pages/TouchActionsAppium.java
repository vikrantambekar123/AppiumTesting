package Pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;




public class TouchActionsAppium extends Base
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		AndroidDriver<AndroidElement>driver=capabilities();
		
		TouchAction t=new TouchAction(driver);
//		
//		//TouchAction by Tap
//		WebElement ele=driver.findElementByXPath("//android.widget.TextView[@text='Views']");
//		t.tap(tapOptions().withElement(element(ele))).perform();	
		
		
		//TouchAction by LongPress
//		WebElement ViewEle=driver.findElementByXPath("//android.widget.TextView[@text='Views']");  //Clicking on View Option
//		t.tap(tapOptions().withElement(element(ViewEle))).perform();
//		System.out.println("Clciking on Expandable Lists");
//		driver.findElementsByClassName("android.widget.TextView").get(9).click();
//		System.out.println("Clciking on Customer Adapter");
//		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
//		System.out.println("Clciking on People Names");
//		WebElement Names=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
//		t.longPress(longPressOptions().withElement(element(Names)).withDuration(ofSeconds(3))).perform();	
		
		
//		AndroidElement ele2=driver.findElementByXPath("");
//		t.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(2))).release().perform();

	
		//TouchAction Drag and Drop using LonpressOptions and Move and Moveto
		System.out.println("Clicking on View Button");
		WebElement ViewEle2=driver.findElementByXPath("//android.widget.TextView[@text='Views']");  //Clicking on View Option
		t.tap(tapOptions().withElement(element(ViewEle2))).perform();

		System.out.println("Clciking on Drag and Drop");
		driver.findElementsByClassName("android.widget.TextView").get(8).click();
		
		System.out.println("Dragging Source Element");
		AndroidElement Source=driver.findElementsByClassName("android.view.View").get(1);
		AndroidElement Dest=driver.findElementsByClassName("android.view.View").get(2);
		System.out.println("Moving Sources to Dest");
		Thread.sleep(3000);
		t.longPress(element(Source)).moveTo(element(Dest)).release().perform();	
	
		
		
		
		
		
	}

}
