package studystuff_seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class DateTimePicker

{
	FluentWait<WebDriver> fluent_wait=null;
	
	@Test
	public void handleDateTimePicker()
	{
		
		System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
	
		fluent_wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
		fluent_wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='DepartDate']"))));
 		
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		String flight_depart_date="September-30-2017";
		String[] departDate = flight_depart_date.split("-");

		String departMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
        while (!departMonth.equalsIgnoreCase(departDate[0])) 
        {
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
        departMonth = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
        }

		// new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select"))).selectByVisibleText(departDate[2]);

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]//a[contains(.,'"+departDate[1]+"')]")).click();
		      
 		
 		
 			      
 		
	       
	}
}
