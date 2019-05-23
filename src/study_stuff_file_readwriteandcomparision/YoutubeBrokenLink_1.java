package study_stuff_file_readwriteandcomparision;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeBrokenLink_1 


{
	
	static boolean videoworking;
	static File file;
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static XSSFCell writing_cell;
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\gaurav.arora\\Desktop\\Youtube (1).xlsx";
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\Automation Task\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 file= new File(path);
		
		 fis= new FileInputStream(file);
		
		 wb= new XSSFWorkbook(fis);
		 sheet =wb.getSheet("Sheet1");
		 row=sheet.getRow(0);
		int row_count= sheet.getLastRowNum()+1;
		System.out.println("Row count " +row_count);
		 int col_count = row.getLastCellNum();
		 System.out.println("Col count " +col_count);
		String data[]= new String[row_count];
		
			
			for(int i=0;i<row_count;i++)
			{
				videoworking=true;
				row=sheet.getRow(i);
				 cell = row.getCell(0);
        		String Cell_value = cell.getStringCellValue();
        		data[i]= Cell_value;
        		System.out.println(data[i]);
        		driver.get(data[i]);
        		Thread.sleep(5000);
        		System.out.println("True or False = "+driver.getPageSource().contains("This video is unavailable."));
        		videoworking=driver.getPageSource().contains("This video is unavailable.");
        		if(!videoworking)
        		{
        			videoworking=false;
        		}
        		System.out.println("is video " +data[i]+ " working ? "+videoworking);
        		writeVideoStatusToExcel(videoworking);
			
			}
			
	}

	static void writeVideoStatusToExcel(boolean videoStatus) throws Exception
	{
		writing_cell=row.createCell(1);
		writing_cell.setCellValue(videoStatus);
		fout=new FileOutputStream(file);
	
	}
	
}
