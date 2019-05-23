package studystuff_seleniumconcepts;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertAndWindowHandling {


		WebDriver driver=null;
			
		// Keyboard and Mouse Events 
		// Mouse Hover-done, Click And Hold, Double Click-done, Drag And Drop, Key Down-done, Key Up-done, Move to Element-done, Release 
		// Difference between Action and Actions class
		@Test(priority=4)
		public void keyboardAndMouseEvent() throws Exception
		{
			System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath(".//*[@id='OKTab']/button")).click();
			Alert alert = driver.switchTo().alert();
			String alertMessage= alert.getText();
			
			System.out.println(alertMessage);	
		    Thread.sleep(5000);
		    System.out.println("Gaurav");    		
		    // Accepting alert		
		    alert.accept();
		    System.out.println("Arora");
		   
		}
	
		@Test(priority=3)
		public void WindowHandling() throws Exception
		{
			driver=new ChromeDriver();		
    		
	        //Launching the site.				
	        driver.get("http://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	       driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);         		
	        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	        		
	        String MainWindow=driver.getWindowHandle();		
	        System.out.println("Main Window Handler is "+MainWindow);
	        // To handle all new opened window.				
	        Set<String> s1=driver.getWindowHandles();		
	        System.out.println(s1.size());
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);		
	                                                                                         
	                                                                                             
	                        driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");			
	                                           
	                        driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        //driver.close();		
	            }	
	            System.out.println("gaurav");
	        }
	        driver.switchTo().window(MainWindow);
 
		}
		
		
		
		
}




