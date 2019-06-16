package study_stuff_file_readwriteandcomparision;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentDetailsReader 


{
	
	static DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
	static boolean videoworking;
	static File file;
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static String path;
	static String data[][];
	static XSSFWorkbook wb2;
	static XSSFSheet sheet2;
	static XSSFRow writing_row;
	static XSSFCell writing_cell;
	public static void main(String[] args) throws Exception 
	{
	System.out.println("Main Function home_computer 1");
		readDataFromExcel();
		writeSameDataToExcel();
		
	}
	static void readDataFromExcel() throws Exception
	{
		 path=System.getProperty("user.dir");
		 System.out.println(path);
		 file= new File(path+"\\Students Detail.xlsx");
		
		 fis= new FileInputStream(file);
		
		 wb= new XSSFWorkbook(fis);
		 sheet =wb.getSheet("data");
		 row=sheet.getRow(0);
		int row_count= sheet.getLastRowNum()+1;
		System.out.println("Row count " +row_count);
		 int col_count = row.getLastCellNum();
		 System.out.println("Col count " +col_count);
		 data= new String[row_count][col_count];
		
	
		 
		// String j_username = formatter.formatCellValue(cell); 
			for(int i=0;i<row_count;i++)
			{
				row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++)
				{
					cell=row.getCell(j);
					//Returns the formatted value of a cell as a String regardless of the cell type.
					data[i][j]=formatter.formatCellValue(cell);
					System.out.print("\t"+data[i][j]);
				}
				System.out.println();
			
			}
			
			
	}

	static void writeSameDataToExcel() throws Exception
	{
		//wb2=new XSSFWorkbook();
		if(wb.getSheetName(1).equals("sheet61"))
		{
			wb.removeSheetAt(1);
		}
		sheet=wb.createSheet("sheet61");
		int i=0;
		for(String temp_1d_array[]:data)
		{
			
			row=sheet.createRow(i);
			int j=0;
			for(String temp:temp_1d_array)
			{
				
		cell=row.createCell(j);
		cell.setCellValue(temp);
		j++;
		
			}
			i++;
		}
		
		fout=new FileOutputStream(file);
		//fout=new FileOutputStream(new File("C:\\Users\\gaurav.arora\\Desktop\\Book1.xlsx"));
		
		
		wb.write(fout);
		fout.close();
		System.out.println("Excel written successfully,");
	}
	
}
