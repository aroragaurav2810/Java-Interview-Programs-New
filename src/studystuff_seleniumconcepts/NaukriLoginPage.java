package studystuff_seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriLoginPage 

{

	
	@Test
	public void uploadDownloadFile()
	{

		System.setProperty("webriver.chrome.driver", "media//gaurav//A644009944006DFD//Gaurav//Gaurav Workspace//Gaurav Project//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/browse-jobs");
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		driver.findElement(By.xpath(".//*[@id='eLoginNew']")).sendKeys("Your id");
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("Your Password");
		driver.findElement(By.xpath(".//*[@id='lgnFrmNew']/div[9]/button")).click();
	}
	
}
