package studystuff_interview_questions_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel 

{
	
	

	public static void main(String[] args) throws Throwable 
	
	{
				String file_path="C:\\Users\\gaurav.arora\\Desktop\\ReadDataExcel.xlsx";
				
				
				// file located
				File file=new File(file_path);
				
				
				// read this file
				FileInputStream fis=new FileInputStream(file);
				
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				
				XSSFSheet ws=wb.getSheet("selenium");
				
				Row row;
				
				
				Cell cell;
			
				//System.out.println(cell.getStringCellValue());
				
				int row_count=ws.getLastRowNum()+1;
					
				
				for(int i=0; i<row_count;i++)
				{
					row=ws.getRow(i);
					int column_count=row.getLastCellNum();
					
					//System.out.println("Column Count is "+column_count);
					for(int j=0;j<column_count;j++)
					{
						cell=row.getCell(j);
						System.out.print(cell);
						System.out.print("    ");
					}
					System.out.println();
				}
				
				
				

	}

}
