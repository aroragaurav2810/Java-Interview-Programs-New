package studystuff_memory_management;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Mukund 

{
	// follow these steps on IE browser:
	// 1. go to ie>internet option> security> for all 4 zones> click on check box "Enable protected mode"
	// 2. set zoom to 100%
	// or
	// http://www.seleniumeasy.com/selenium-tutorials/how-to-run-webdriver-in-ie-browser
	

			public static void main(String[] args) 
			{
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				System.setProperty("webdriver.ie.driver","D:\\Gaurav\\Go Jek\\IEDriverServer.exe");
				WebDriver driver= new InternetExplorerDriver();
				driver.get("https://www.facebook.com/");

			}

		

	}


