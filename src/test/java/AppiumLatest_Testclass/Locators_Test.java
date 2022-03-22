package AppiumLatest_Testclass;




import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PracPages.Locatorrs;
import PracticeBase.PracBase_App_Demos;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;

public class Locators_Test extends PracBase_App_Demos
{
	private static Logger log=Logger.getLogger(Locators_Test.class.getName());
	
	public Locatorrs l;

	
	public Locators_Test() 
	{
		super();
	}

	@BeforeTest
	public void setup() throws InterruptedException
	{
		BasicConfigurator.configure();
		log.info("Initilizaing Driver");
		Init();
		l=new Locatorrs(driver);
		
		
		//Recording
//		driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));
	}
	
	
	@Test
	public void Test_Locators() throws InterruptedException
	{
		System.out.println("In Test Method of Test_Locator");
		log.info("Running test_Locatorrs");
		l.Appium_Locators();
		System.out.println("After Executing Appium Locators Method");
		log.info("After Running test_Locatorrs");

	}
	
	@AfterTest
	public void Stop_Record() throws IOException
	{
		//Stop Recording
//		String video = driver.stopRecordingScreen();
//
//        byte[] decode = Base64.getDecoder().decode(video);
//
//        FileUtils.writeByteArrayToFile(new File("appiumRecorded.mp4"), decode);
	}
	
	

	
	
	
}
