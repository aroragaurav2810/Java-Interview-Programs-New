package neelamcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.internal.*;

public class TestCode {
	public static void main(String[] args) {
		//final FirefoxProfile firefoxProfile = new FirefoxProfile();//for version control
		//firefoxProfile.setPreference("xpinstall.singaturesr.required", false);
		System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		String baseUrl = ("https://www.epikso.com/");
		driver.get(baseUrl);
		
	driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[5]/a")).click();
	WebElement Checkbox1 = driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[1]/div/div[1]/label/input"));                            
    for (int i1=0; i1<2; i1++) 
    {                                            
       Checkbox1.click ();             
       System.out.println(" Checkbox Status is -  "+ Checkbox1.isSelected());
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[1]/div/div[1]/label/input")).click();
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[1]/input")).click();
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[2]/div/div[1]/label/input[1]")).click();
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[2]/input[2]")).click();
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[3]/div/div[1]/label/input")).click();
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[3]/input[2]")).click();
	
	WebElement mail =driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[4]/div/div[1]/input"));
    mail.sendKeys("neelam@epikso.com");
    driver.findElement(By.id("name")).sendKeys("neelam");
    WebElement phone =driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[4]/div/div[2]/div/div[2]/input"));
    phone.sendKeys("1234567890");
    WebElement message =driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[4]/div/div[3]/textarea"));
    message.sendKeys("Test");
	
	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/form/fieldset[4]/input[2]")).click();
	
	//driver.close();
				//System.exit(0);


	}


	}
	
}