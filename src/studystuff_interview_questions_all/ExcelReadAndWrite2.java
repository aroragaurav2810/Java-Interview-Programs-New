package studystuff_interview_questions_all;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ExcelReadAndWrite2 

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
	static Map<String, String> map=null;
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
		map=new LinkedHashMap<String, String>();
		
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
				cell.setCellType(Cell.CELL_TYPE_STRING);
				data[i][j]=cell.getStringCellValue();
				//list.add(data[i][j]);
				//map.put(key, value)
				
				
			}
			
			
			
		}
		
		for(String[] arr:data){
			   map.put(arr[0],arr[1]);
			   
			}
		System.out.println(map.get("1"));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(data.length);
		System.out.println(data);
		System.out.println(data[2][1]);
	
		
		fis.close();
// The above line code is written because the excel was getting corrupted each time user reads its data 		
	}
	
	
	public static void writeExcelData() throws Throwable
	{
		file=new File("E:\\6 aug\\Interview Questions\\ExcelReadAndWrite2Output.xlsx");
		fout= new FileOutputStream(file);
		workbook=new XSSFWorkbook();
		sheet=workbook.createSheet("Amey");	
		
			for(int i=1;i<=map.size();i++)
			{
				
					
					row=sheet.createRow(i-1);
					cell=row.createCell(0);
					cell.setCellValue(""+map.get(""+i+""));
					
				    
			}			      
				
			
		
		workbook.write(fout);
		fout.close();
	    System.out.println("Excel written successfully..");
	 // The above line code is written because the excel was getting corrupted each time user writes its data 		
		
	
	}
	
	
	
	public static void main(String[] args) throws Throwable
	
	{	
		ExcelReadAndWrite2 obj=new ExcelReadAndWrite2();
		System.out.println("Make Sure workbook sheet name is same as class name");
		System.out.println("Please enter excel name");
		obj1=new Scanner(System.in);
		excel_name=obj1.nextLine();
		obj.initiallize(excel_name);
		readExcelData(excel_name);
		writeExcelData();
		
	}

	
	
	
}
