package PracticeBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PracBase_Grocery_App 
{

	public static AndroidDriver<AndroidElement> driver;
	public static Properties prop;
	

	public static  AndroidDriver<AndroidElement> capabilities_new() throws MalformedURLException
	{		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		File appDir = new File("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\src");
		File app = new File(appDir,"General-Store.apk");

		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"9635763368000B7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
