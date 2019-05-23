package studystuff_interview_questions_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_And_Write_Functionality_New

{

	String reading_file_path="";
	String writing_file_path="";
	File file=null;
	FileInputStream fis;
	FileOutputStream fout;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int row_count;
	int col_count;
	
	public void initiallize() throws Throwable
	{
		
		file=new File(reading_file_path);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("read_data");
		row_count=sheet.getLastRowNum();
		col_count=row.getLastCellNum();
		
	}
	
	public void readExcelData()
	{
		
	}
	
	
	public void writeExcelData()
	{
		
	}
	
	
	public static void main(String[] args) throws Throwable 
	
	{
	
		Excel_Read_And_Write_Functionality_New obj= new Excel_Read_And_Write_Functionality_New();
		obj.initiallize();
		

	}

}
