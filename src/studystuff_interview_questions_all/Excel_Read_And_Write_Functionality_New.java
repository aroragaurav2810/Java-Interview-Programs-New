package studystuff_interview_questions_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_And_Write_Functionality_New

{

	String reading_file_path="D:\\Gaurav\\Personal Automation Task\\Java Interview Questions\\Java Questions\\Java-Interview-Programs-New\\src\\Student_read.xlsx";
	String writing_file_path="D:\\Gaurav\\Personal Automation Task\\Java Interview Questions\\Java Questions\\Java-Interview-Programs-New\\src\\Student_write.xlsx";
	File file=null;
	FileInputStream fis;
	FileOutputStream fout;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int row_count;
	int col_count;
	
	String[][] ar=null;
	
	public void readExcelData() throws Exception
	{
		file=new File(reading_file_path);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("read_data");
		String sheet_name=sheet.getSheetName();
		row_count=sheet.getLastRowNum()+1;
		row=sheet.getRow(0);
		col_count=row.getLastCellNum();
		System.out.println(row_count);
		System.out.println(col_count);
		ar=new String[row_count][col_count];
		for(int i=0;i<row_count;i++)
		{
			row=sheet.getRow(i);
			for(int j=0;j<col_count;j++)
			{
				cell=row.getCell(j);
				DataFormatter format=new DataFormatter();
				ar[i][j]=format.formatCellValue(cell);
				System.out.println(ar[i][j]);
				
			}
		}		
	}
	
	
	public void writeExcelData() throws Exception
	{
		workbook=new XSSFWorkbook();
		sheet=workbook.createSheet("write_data");
		for(int i=0;i<ar.length;i++)
		{
			row=sheet.createRow(i);
			for(int j=0;j<ar[i].length;j++)
			{
				cell=row.createCell(j);
				cell.setCellValue(ar[i][j]);
			}
		}
		file=new File(writing_file_path);
		fout= new FileOutputStream(file); 
        workbook.write(fout); 
		fout.close();
	}
	
	
	public static void main(String[] args) throws Throwable 
	
	{
	
		Excel_Read_And_Write_Functionality_New obj= new Excel_Read_And_Write_Functionality_New();
		obj.readExcelData();
		obj.writeExcelData();
	}

}
