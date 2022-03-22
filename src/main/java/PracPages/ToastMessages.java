package PracPages;

import java.net.MalformedURLException;
import java.util.List;

import PracticeBase.PracBase_App_Demos;
import PracticeBase.PracBase_Grocery_App;
import io.appium.java_client.android.AndroidElement;

public class ToastMessages extends PracBase_Grocery_App
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		Thread.sleep(3000);
		System.out.println("I am in ToastMessage Class");
		capabilities_new();
		Thread.sleep(6000);
		
		//ToastMessgae
		
		List<AndroidElement>ele2=driver.findElementsByClassName("//android.widget.Button");
		int a=ele2.size();
		System.out.println(a);
		System.out.println("--------------");
		for(int i=1;i<=ele2.size();i++)
		{
			String tex=ele2.get(i).getText();
			System.out.println(tex);
		}
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		System.out.println("Clickied on Lets Shop");
		String Toast=driver.findElementByXPath("//android.widget.Toast[1]").getText();
		System.out.println("Toast Message is :- "+Toast);
		
		
		
		
	}

}
