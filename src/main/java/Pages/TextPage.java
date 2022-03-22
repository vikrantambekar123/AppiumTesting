package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TextPage extends Base 
{

	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement Textbox;
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement Female_Radio;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement Shop_Button;
	
	@AndroidFindBy(xpath="//android.widget.Toast[1]")
	public WebElement toastmsg;
	
	
	public TextPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void textbox()
	{
		Textbox.sendKeys("Hello Vikrant");
	    driver.hideKeyboard();
	}
	
	public void Click_Femaleradio()
	{
		Female_Radio.click();
	}
	
	public void Clickingon_Shopbutton()
	{
		Shop_Button.click();
	}
	
	
}
