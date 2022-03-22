package Pages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Appium_Class2 extends Base {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

			AndroidDriver<AndroidElement> driver=capabilities();
			Thread.sleep(3000);
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//			    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

			    // driver.hideKeyboard();

			     driver.findElement(By.xpath("//*[@text='Female']")).click();

			     driver.findElement(By.id("android:id/text1")).click();

			  

//			     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Argentina\").instance(0))"));
			     String containedText="Argentina";	
			     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))")).click();     

//			     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

			     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

			String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");



			System.out.println(toastMessage);

//			Assert.assertEquals("Please enter your name", toastMessage);//Actual validation

			//name attribute for toast messages will have content



			     

			     

			     

			     
			
			
		}
		
		
	}

