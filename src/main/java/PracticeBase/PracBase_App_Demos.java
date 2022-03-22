package PracticeBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PracBase_App_Demos 
{

	public static AndroidDriver<WebElement> driver;
	public static Properties prop;	
	public static FileInputStream fis;
	
	public PracBase_App_Demos()
	{
		prop=new Properties();
		try {
			fis= new FileInputStream("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static AndroidDriver<WebElement> Init()
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		File appDir = new File("C:\\Users\\vikrant.ambekar\\eclipse-workspace\\AppiumLatest\\src");
		File app = new File(appDir,prop.getProperty("Apkname"));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("Devicename"));
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		try {
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}	
	
}
