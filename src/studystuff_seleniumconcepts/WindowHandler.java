package studystuff_seleniumconcepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class WindowHandler {

	 String mainwindow;

    WebDriver driver;  
    @BeforeTest  
    public void setup() throws Exception {  
    driver=new ChromeDriver();  
    String URL="https://www.google.com/gmail/about/#";   
    driver.get(URL);  
    driver.manage().window().maximize();  
    }  
    @Test (priority=1) 
    public void test() throws Exception 
    {   
    	  mainwindow=driver.getWindowHandle();
    	  driver.findElement(By.xpath("//a[contains(.,'Create an account')]")).click();			
    	  handleChildWindowCreateAnAccount();
    	  driver.switchTo().window(mainwindow);
	      WebElement element=driver.findElement(By.xpath("//a[contains(.,'GET STARTED')]"));
	      Thread.sleep(2000);
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
	      Thread.sleep(2000);
	      element.click();
	      handleChildWindowGetStarted(); 
	      driver.switchTo().window(mainwindow);
	      driver.findElement(By.xpath(".//a[contains(.,'Sign In')]")).click();
    }  
    
  void  handleChildWindowCreateAnAccount() throws Exception
    {
     // To handle all new opened window.				
     Set<String> windowsset=driver.getWindowHandles();		
     System.out.println(windowsset.size());
     Iterator<String> iterator=windowsset.iterator();		
    while(iterator.hasNext())
    {
 	   String childwindow=iterator.next();
     if(!mainwindow.equalsIgnoreCase(childwindow))
     {
     	driver.switchTo().window(childwindow);
     	driver.findElement(By.xpath(".//*[@id='FirstName']")).clear();
     	driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Gaurav");
     	Thread.sleep(2000);
     	driver.close();
     	
     }
    }
     
     
    }
  
  void handleChildWindowGetStarted() throws Exception
  {
	  Set<String> windowsset=driver.getWindowHandles();		
	     System.out.println(windowsset.size());
	     Iterator<String> iterator=windowsset.iterator();		
	    while(iterator.hasNext())
	    {
	 	   String childwindow=iterator.next();
	     if(!mainwindow.equalsIgnoreCase(childwindow))
	     {
	    	driver.switchTo().window(childwindow);
	    	Thread.sleep(2000);
	    	driver.close();
	    	 
	     	
	     }
	    }
	  
  }
    
}

