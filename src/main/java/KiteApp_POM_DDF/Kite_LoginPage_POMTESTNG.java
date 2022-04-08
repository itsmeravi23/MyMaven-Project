package KiteApp_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage_POMTESTNG 
{

	//Variable Declare:-->>
	@FindBy(id = "userid")private WebElement UserId;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//Constructor Initialization;
	
	public Kite_LoginPage_POMTESTNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilize Method
	public void EnterUserId(String Uid) 
	{
		UserId.sendKeys(Uid);
	}
	
	public void EnterPassword(String Pass) 
	{
		Password.sendKeys(Pass);
	}
	
	public void ClickOnLoginButton() 
	{
		LoginButton.click();
	}
}  
