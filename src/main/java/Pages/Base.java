package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base 
{
	public static AndroidDriver<AndroidElement> driver;
	public static Properties prop;
	

	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		// TODO Auto-generated method stub
	
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\src\\test\\app-uatest-debug.apk");
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		File appDir = new File("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\src");
		File app = new File(appDir,"ApiDemos-debug.apk");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"9635763368000B7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
//		cap.setCapability("","true");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}
	
}
