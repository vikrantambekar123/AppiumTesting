package PracPages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dryrunclass {
	
	public static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		DesiredCapabilities cap= new DesiredCapabilities();
		
		File appDir = new File("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\src");
		File app = new File(appDir,"ApiDemos-debug.apk");

		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"9635763368000B7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		try {
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value =driver.findElementByXPath("(//android.widget.TextView)[9]").getText();
		System.out.println(value);
		
		driver.findElementByXPath("(//android.widget.TextView)[11]").click();
		
		
		
	}

}
