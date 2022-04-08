package KiteApp_With_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import UtilityandBase_Class.*;
import KiteApp_POM_DDF.*;

@Listeners(listener_Class.Listener_KiteApp.class)//we need to Declare listener on Class level;
public class KiteApp_with_TestNG extends KiteApp_Base
{
	Kite_LoginPage_POMTESTNG login;
	Kite_PinPage_PomTestNG pin;
	Kite_HomePage_PomTestNG home;
	@BeforeClass
	public void LaunchingBrowser() 
	{
		launchBrowser();
	}
	
	@BeforeMethod
	public void KiteAppLogin() throws EncryptedDocumentException, IOException
	{
		login=new Kite_LoginPage_POMTESTNG(driver);
		pin=new Kite_PinPage_PomTestNG(driver);
		home=new Kite_HomePage_PomTestNG(driver);
		
		login.EnterUserId(UtilityClass.getRequiredData(0, 0));
		login.EnterPassword(UtilityClass.getRequiredData(0, 1));
		login.ClickOnLoginButton();
		Reporter.log("UserId And Password Data Filled Properlly ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.EnterPin(UtilityClass.getRequiredData(0, 2));
		pin.ClickOnCountinueBotton();
		Reporter.log("Pin Data Filled Properlly ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}

	
  @Test
  public void ValidatingKiteHomePageId() throws EncryptedDocumentException, IOException 
  {
	 // int TCID= 2135;
	  String actualUserId = home.ValidatingUserId();
	  String expectedUserId = UtilityClass.getRequiredData(1, 0);//correct_>> 0,0 ; wrong-->> 1,0;if wrong then take SC;
	  
	  Assert.assertEquals(actualUserId, expectedUserId,"Actual UserId is Not Matchind with Expected UserId");
	 // UtilityClass.takeScreenshot(driver, TCID);
  
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.ClickOnLogout();
	  Reporter.log("Logout Sussess ",true);
  }
  
  @AfterClass 
  public void KiteAppClose()
  {
	  CloseBrowser();
  }
  
  
}
