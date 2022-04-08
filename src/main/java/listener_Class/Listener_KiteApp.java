package listener_Class;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import UtilityandBase_Class.KiteApp_Base;

public class Listener_KiteApp implements ITestListener
{
	KiteApp_Base obj=new KiteApp_Base();//creating obj for calling takeScreeShot Method;
	
	public void onTestFailure(ITestResult result) //By Using This Method only failed TC ScreenShot Taken;
	{
		String failTCName = result.getName();
		System.out.println("Listener give Fali Test Case Name-->>"+failTCName);
		try {
			obj.takeScreenshot(failTCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Listener give Pass Test Case Name-->>"+result.getName());
	}

}
