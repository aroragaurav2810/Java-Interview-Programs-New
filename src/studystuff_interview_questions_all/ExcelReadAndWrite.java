package studystuff_interview_questions_all;

import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ExcelReadAndWrite 

{
	
	static String file_path=null;
	static File file=null;
	static FileInputStream fis=null;
	static FileOutputStream fout;
	static XSSFWorkbook workbook=null;
	static XSSFSheet sheet=null;
	static XSSFRow row=null;
	static XSSFCell cell=null;
	static int rownum=0;
	static int colnum=0;
	static Scanner obj1=null;
	static String excel_name=null;
	static boolean sheet_name_flag;
	static String data[][]=null;
	static List list=null;
	
	public  void initiallize(String workbook_name) throws Throwable
	{
		try
		{
		file_path=System.getProperty("user.dir")+"\\"+workbook_name+".xlsx";
		file=new File(file_path); 
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(this.getClass().getSimpleName());
		rownum=sheet.getLastRowNum()+1;
		colnum=sheet.getRow(0).getLastCellNum();
		System.out.println("total number of rows "+rownum);
		System.out.println("total number of columns "+colnum);
		data=new String[rownum][colnum];
		list=new ArrayList();
		
		
		}
		catch(Exception e)
		{
			System.out.println("sheet name is not same as class name "+e);
		}
		
	}
	
	public static void readExcelData(String workbook_name) throws Throwable
	{
		for(int i=0;i<rownum;i++)
		{
			row=sheet.getRow(i);
			
			for(int j=0;j<colnum;j++)
			{
				cell=row.getCell(j);
				data[i][j]=cell.getStringCellValue();
				list.add(data[i][j]);
				
			}
			
			
			
		}
		System.out.println("Total excel cell value"+list);
		System.out.println(list.size());
		System.out.println(data.length);
		System.out.println(data);
		System.out.println(data[2][1]);
		for(int k=0;k<list.size();k=k+2)
		{
			
			
			System.out.println(list.get(k));
					
		}
		
		fis.close();
// The above line code is written because the excel was getting corrupted each time user reads its data 		
	}
	
	
	public static void writeExcelData() throws Throwable
	{
		
		workbook=new XSSFWorkbook();
		sheet=workbook.createSheet("amey");		
		for(int i=0;i<data.length;i++)
		{
			row=sheet.createRow(i);
			
			for(int j=0;j<data[0].length;j++)
			{
				cell=row.createCell(j);
				cell.setCellValue(data[i][j]+" gaurav");
				
			    
			}			      
			
		}
		file=new File("E:\\6 aug\\Interview Questions\\ExcelReadAndWriteOutput.xlsx");
		fout= new FileOutputStream(file);
		workbook.write(fout);
		fout.close();
	    System.out.println("Excel written successfully..");
		
	}
	
	
	
	
	
	public static void main(String[] args) throws Throwable
	
	{	
		ExcelReadAndWrite obj=new ExcelReadAndWrite();
		System.out.println("Make Sure workbook sheet name is same as class name");
		System.out.println("Please enter excel or workbook name");
		obj1=new Scanner(System.in);
		excel_name=obj1.nextLine();
		obj.initiallize(excel_name);
		readExcelData(excel_name);
		
		writeExcelData();
		
	}

	
	
	
}
