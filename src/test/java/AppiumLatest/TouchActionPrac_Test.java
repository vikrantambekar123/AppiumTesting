package AppiumLatest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PracPages.Locatorrs;
import PracPages.TouchActions_Prac;
import PracticeBase.PracBase_App_Demos;

public class TouchActionPrac_Test extends PracBase_App_Demos
{
	
private static Logger log=Logger.getLogger(Locators_Test.class.getName());
	
	public TouchActions_Prac t;


	@BeforeTest
	public void setup() throws InterruptedException
	{
		BasicConfigurator.configure();
		log.info("Initilizaing Driver");
		Init();
		t=new TouchActions_Prac(driver);
	}
	
	
	@Test
	public void Test_Locators() throws InterruptedException
	{
		System.out.println("In TopuchActionPrac_Method ");
		log.info("Running TopuchActionPrac_Method");
		t.TopuchActionPrac_Method();;
		System.out.println("After Executing ATopuchActionPrac_Method");
		log.info("After Running TopuchActionPrac_Method");

	}
	
	
	@AfterTest
	public void Done_WithShit()
	{
		System.out.println("Done with Shit bro");
	}
	
	
	
	
	
}
