package UtilityandBase_Class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class KiteApp_Base {

	protected static WebDriver driver; //make Static bcz static only one replica create;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium&Chrome\\chromedriver.exe");
		ChromeOptions crp=new ChromeOptions();
		crp.addArguments("--Disable-notifications");
		crp.addArguments("--incognito");
		driver=new ChromeDriver(crp);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		Reporter.log("Launch browser Sussess",true);
	}
	
	public void takeScreenshot(String failTCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Velocity Testing Class\\Selenium Practice ScreenShort\\"+failTCName+"KiteApp.jpg");
		FileHandler.copy(src, dest);
		Reporter.log("Taking ScreenShot",true);
	}
	
	
	public void CloseBrowser() 
	{
		driver.close();	
		Reporter.log("Close browser Sussess",true);
	}

}
