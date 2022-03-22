package Resources;

import java.net.MalformedURLException;

import Pages.Base;
import io.appium.java_client.MobileBy;

public class Utilites extends Base
{

	public void Scrolling(String containedText) throws MalformedURLException
	{
		capabilities();
	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))")).click();     
	}
	
	
	
}
