package KiteApp_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage_PomTestNG 
{
	//Step 1:- Variable Deceleration
	@FindBy(id = "pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Countinue;
	
	//step 2:- Initialization Constructor 
	public Kite_PinPage_PomTestNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 3:-Utilization Method
	public void EnterPin(String PutPin) 
	{
		Pin.sendKeys(PutPin);
	}
	
	public void ClickOnCountinueBotton() 
	{
		Countinue.click();
	}

}
