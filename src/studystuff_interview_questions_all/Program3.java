package studystuff_interview_questions_all;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;


public class Program3 


{

	static WebDriver driver=null;
	static WebElement element=null;
	static FirefoxBinary ffbinary=null;
	static FirefoxProfile ffprofile=null;
	static File file=null;
	static String browser_path=null;
	static Select select_list1=null;
	static Select select_list2=null;
	static List<WebElement> list_list1=null;
	static List<WebElement> list_list2=null;
	static List<WebElement> list_of_columns_fields=null;
	
	

public static void main(String []str) throws Exception
{
	browser_path="C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
	file=new File(browser_path);
	ffbinary=new FirefoxBinary(file);
	ffprofile=new FirefoxProfile();
	
	list_list1=new ArrayList<WebElement>();
	list_list2=new ArrayList<WebElement>();
	list_of_columns_fields=new ArrayList<WebElement>();
	driver=new FirefoxDriver(ffbinary,ffprofile);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    driver.get("http://tuborg.kamet.office:9090");
    driver.findElement(By.xpath("//*[@id='user']")).sendKeys("gaurav_admin");
    driver.findElement(By.xpath("//*[@id='p1']")).sendKeys("admin123");
    driver.findElement(By.xpath("//*[@id='loginform']/div/div/div[2]/div[4]/input[2]")).click();
    driver.findElement(By.xpath("//*[@id='h-adminstration']/a")).click();
    driver.findElement(By.xpath("//a[contains(.,'Report View ')]")).click(); 
    select_list1=new Select(driver.findElement(By.xpath(".//*[@id='allLists1']")));
    
    list_list1=select_list1.getOptions();
   
    
    for(WebElement temp_list1:list_list1)
    {
    	if(!temp_list1.getText().equalsIgnoreCase("-Select-"))
    	{
    	select_list1.selectByVisibleText(temp_list1.getText());
    	select_list2=new Select(driver.findElement(By.xpath(".//*[@id='allLists2']")));
    	
    	list_list2=select_list2.getOptions();
    	
    	for(WebElement temp_list2:list_list2)
    	{
    		if(!temp_list2.getText().equalsIgnoreCase("-Select-"))
    		{
    		select_list2.selectByVisibleText(temp_list2.getText());
    		driver.findElement(By.xpath(".//*[@id='reportTooltip']")).clear();
    		driver.findElement(By.xpath(".//*[@id='reportTooltip']")).sendKeys("ToolTip");//+" "+temp_list1.getText());
    		Thread.sleep(10000);
    		System.out.println("gaurav");
    		
    	    list_of_columns_fields=driver.findElements(By.xpath(".//*[@id='tabs-inner-sec']/div[@class='tabs-inner-sec-content columns-box']/div"));
    	   
    	    System.out.println(list_of_columns_fields.size());
    		for(WebElement temp_list_of_columns_fields:list_of_columns_fields)
    		{
    			
    		System.out.println(temp_list2.getText()+"-->"+temp_list_of_columns_fields.getText());
    			
    		}
    	}
    }
   }
    }
}





}
