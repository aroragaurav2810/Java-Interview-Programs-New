package studystuff_seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webriver.chrome.driver", "D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> list_month=new ArrayList<WebElement>();
		WebElement month_dropdown=driver.findElement(By.xpath(".//*[@id='month']"));
		month_dropdown.click();
		Select obj=new Select(month_dropdown);
		list_month=obj.getOptions();
		
		for(WebElement element:list_month)
		{
			String month_value=element.getText();
			if(month_value.equalsIgnoreCase("Sept"))
			{
					//element.click();
				obj.selectByVisibleText(month_value);
			}
		}
		
	}

}
