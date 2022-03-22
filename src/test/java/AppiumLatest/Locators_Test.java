package AppiumLatest;




import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PracPages.Locatorrs;
import PracticeBase.PracBase_App_Demos;

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
	
	

	
	
	
}
