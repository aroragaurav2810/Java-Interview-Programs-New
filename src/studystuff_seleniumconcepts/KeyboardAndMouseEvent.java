package studystuff_seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEvent 

{

	
			
		// Keyboard and Mouse Events 
		// Mouse Hover-done, Click And Hold, Double Click-done, Drag And Drop, Key Down-done, Key Up-done, Move to Element-done, Release 
		// Difference between Action and Actions class
		@Test
		public void keyboardAndMouseEvent() throws Exception
		{
			System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			
			WebElement link_element=driver.findElement(By.xpath(".//*[@id='MoreOptionsLink']"));
			Thread.sleep(2000);
			Actions builder=new Actions(driver);
			Action check=builder.moveToElement(link_element).build();
			
			// One is Actions class and another is Action class
			// where Actions class is used to perform all actions which can be performed by Mouse and Keyboard 
			// where Action class only contains one method called as perfrom()  
			// Actions class build() method return Action class
			check.perform();
			WebElement text_element=driver.findElement(By.xpath(".//*[@id='FromTag']"));
			Action seriesofaction=builder.moveToElement(text_element).click().keyDown(text_element, Keys.SHIFT).sendKeys(text_element, "Hello").keyUp(text_element, Keys.SHIFT).doubleClick(text_element).contextClick().build();
			seriesofaction.perform();
			text_element.sendKeys(Keys.TAB);
			
		
		    
		}
	

}
