package PracPages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PracticeBase.PracBase_App_Demos;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class TouchActions_Prac extends PracBase_App_Demos{

	@AndroidFindBy(className = "android.widget.TextView")
	List<AndroidElement> ViewTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
	AndroidElement DragandDrop_Tab;
	
	@AndroidFindBy(xpath ="(//android.view.View)[1]")
	AndroidElement LongpressCircleEle;	
	
	@AndroidFindBy(xpath = "(//android.view.View)[1]")
	AndroidElement Source;
	
	@AndroidFindBy(xpath ="(//android.view.View)[3]")
	AndroidElement Dest;	
	
	
	public TouchActions_Prac(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
		System.out.println("I am in TouchAction_Prac Class");
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
		
	public void TopuchActionPrac_Method()
	{
		TouchAction c=new TouchAction(driver);
		
		//Clicking on Views Tabs
		ViewTab.get(12).click();
		
		//ToucAction Tap
		c.tap(tapOptions().withElement(element(DragandDrop_Tab))).perform();
		System.out.println("Tapped on Drag and Drop");
		
		
		//TouchAction Longpress
		c.longPress(longPressOptions().withElement(element(LongpressCircleEle)).withDuration(ofSeconds(3))).release().perform();
		System.out.println("Longpressed Circle Element");
		
		
		//move
		c.longPress(longPressOptions().withElement(element(Source))).moveTo(element(Dest)).release().perform();
		System.out.println("Moved Source to Dest");
	}

}
