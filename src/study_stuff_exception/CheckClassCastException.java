package study_stuff_exception;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckClassCastException extends Parent

{
	static WebDriver driver;
	static void takeScreenShot()  throws IOException 
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils futil=new FileUtils();
		futil.copyFile(file, new File("C:\\Users\\ABC\\Desktop\\screenshot.jpeg"));
	}
	
	static void dataBaseConnectivity() throws SQLException
	{
		Connection obj=DriverManager.getConnection("");
	}
	
	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
				takeScreenShot();
			
	
			dataBaseConnectivity();
		
		CheckClassCastException obj = new CheckClassCastException();   // case 1
		Parent obj2 = new Parent();			// case 2
		Parent obj3 = new CheckClassCastException();   // case3
		//CheckClassCastException obj4 = (CheckClassCastException) new Parent();
		
		

	}

}
