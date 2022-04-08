package UtilityandBase_Class;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.testng.Reporter;

public class UtilityClass {

	public static String getRequiredData(int rowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("E:\\Selenium&Chrome\\workSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Zerodha");
		return mySheet.getRow(rowIndex).getCell(CellIndex).getStringCellValue();//we Can Store It With Reference variable or Directly give return in this line;
		
	}

	
//	public static void takeScreenshot(WebDriver driver, int TCID) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("E:\\Velocity Testing Class\\Selenium Practice ScreenShort\\"+TCID+"KiteScreenShot.jpg");
//		FileHandler.copy(src, dest);
//		Reporter.log("Taking ScreenShot",true);
//	}

}
