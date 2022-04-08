package KiteApp_POM_DDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage_PomTestNG 
{
	//Step 1:- Variable Declaration
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserIdHomePage;
	@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
	
	//Step 2:- Initialize Constructor;
	public Kite_HomePage_PomTestNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 3:- Utilize Method
	public String ValidatingUserId() //we need to remove Void And Replace with String bcz i need string from this Method;
	{
		String ActualUserId = UserIdHomePage.getText();
		return ActualUserId;
		
	}
	
	public void ClickOnLogout() throws InterruptedException 
	{
		UserIdHomePage.click();
		Thread.sleep(1000);
		Logout.click();
		
	}
}
