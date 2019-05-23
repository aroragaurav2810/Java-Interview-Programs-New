package studystuff_seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAndDownloadFile 

{

	
	@Test
	public void uploadDownloadFile()
	{

		System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		 WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\Users\\ABC\\Desktop\\biller ref no.txt");
	        driver.findElement(By.id("terms")).click();
	        driver.findElement(By.name("send")).click();
	}
	
}
