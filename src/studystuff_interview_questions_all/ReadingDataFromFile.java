package studystuff_interview_questions_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromFile {

	public static void main(String[] args) throws Exception
	
	
	{
				String file_path="E:\\LoginFunctionality.xlsx";
				
				
				// located the file
				File file =new File(file_path);
				
				// trying to read data from located file
				FileInputStream  fis=new FileInputStream(file);
				
				
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
				XSSFSheet sheet=workbook.getSheet("SignIn");
				
				XSSFRow row=sheet.getRow(0);
				
				
				XSSFCell cell=null;
				
			
				int rowcount=sheet.getLastRowNum()+1;
				System.out.println("row count of sheet SignIn is"+rowcount);
						
				int columncount=row.getLastCellNum();
				System.out.println("col count of row 0 is "+columncount);
				
				
				String data[][]=null;
				for(int i=0;i<rowcount;i++)
				{
					
					row=sheet.getRow(i);
					for(int j=0;j<row.getLastCellNum();j++)
					{
					//	System.out.println("row containing "+ row);
						
						data=new String[rowcount][row.getLastCellNum()];
						cell=row.getCell(j);
						//System.out.println("column containing "+cell);
						data[i][j]=cell.getStringCellValue();
						System.out.print(data[i][j]);
						System.out.print("      ");
					}
					System.out.println();
				}
				
				
				
						

	}

}
