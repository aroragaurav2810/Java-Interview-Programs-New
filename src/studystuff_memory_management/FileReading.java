package studystuff_memory_management;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReading {
	
	
	void FileInputOutput() throws Exception 
	{
		
		//String file_path= "C:\\Users\\NUPUR\\Desktop\\IshanTyagi.xlsx"; //Why it is necessary
		
		// Step1: file path
		String file_path="C:\\Users\\ABC\\Desktop\\gaurav.xlsx";
		
		// Step 2: located a file
		File file = new File(file_path);
		
		// Step3: take input from file
			
		    FileInputStream fis= new FileInputStream(file);
		    
		    System.out.println("File Found");
		    
		// Step4: we have a workbook     
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//  Step5: we have a worksheet
		    XSSFSheet sheet= wb.getSheet("Sheet1");
		    
		// Step6: we need a row:
		    XSSFRow row=sheet.getRow(0);
		    
		// Step7: we need a cell:
		    XSSFCell cell=row.getCell(0);
		
		// Step8: we need row count for an array size 
		    int rowcount = sheet.getLastRowNum()+1;    
		    System.out.println("row count is "+rowcount);
		    
		// Step9: we need column count for array size
		    int columncount=row.getLastCellNum();
		    System.out.println("column count is "+columncount);
		// Step 10: we need an array:
		    String arr2d[][]=new String[rowcount][columncount];
		    System.out.println(arr2d.length);
		     
		    
		    
		    
		    
		    // logic
		    
		    for (int row_no=0; row_no<rowcount; row_no++)
		    {
		    	 row = sheet.getRow(row_no);
		    	
		    	for (int column=0; column<columncount; column++)
		    	{
		    		 cell = row.getCell(column);
		    		String Cell_value= cell.getStringCellValue();
		            
		    				arr2d[row_no][column]=Cell_value;
		            System.out.print("\t "+arr2d[row_no][column]);
		    	}
		    	System.out.println();
		    }
		    
		    
		
	
	}

	public static void main(String[] args) throws Exception {
		FileReading obj = new FileReading();
		obj.FileInputOutput();

	}

}
